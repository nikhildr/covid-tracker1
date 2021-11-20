package com.skyfall.covid.tracker.covidtracker.config;

import com.skyfall.covid.tracker.covidtracker.model.Employee;
import com.skyfall.covid.tracker.covidtracker.pojo.VesselSchedule;
import com.skyfall.covid.tracker.covidtracker.processor.TestWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableBatchProcessing
public class JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Value("file:input/Sail*.xml")
    public Resource[] inputFiles;

    @Bean
    public MultiResourceItemReader<Employee> multiResourceItemReader() {
        MultiResourceItemReader<Employee> multiResourceItemReader = new MultiResourceItemReader<>();

        multiResourceItemReader.setDelegate(reader());
        multiResourceItemReader.setResources(inputFiles);
        return multiResourceItemReader;
    }

    @Bean
    public StaxEventItemReader<Employee> reader() {

        StaxEventItemReader<Employee> staxEventItemReader = new StaxEventItemReader<>();

        Map<String, Class> aliases = new HashMap<>();
        aliases.put("VesselSchedule", VesselSchedule.class);

       /* XStreamMarshaller unMarshaller = new XStreamMarshaller();
        unMarshaller.setAliases(aliases);
*/
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setClassesToBeBound(VesselSchedule.class);

        staxEventItemReader.setFragmentRootElementName("VesselSchedule");
        staxEventItemReader.setUnmarshaller(jaxb2Marshaller);

        return staxEventItemReader;
    }

    @Bean
    public Step step1() {
        return this.stepBuilderFactory.get("step1").chunk(1).reader(multiResourceItemReader()).writer(new TestWriter()).build();
    }


    @Bean
    public Job myJob(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {

        return jobBuilderFactory.get("My-First-Job").start(step1()).build();
    }

}