package com.skyfall.covid.tracker.covidtracker.tasklet;

import com.skyfall.covid.tracker.covidtracker.service.CovidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

public class FileDownloaderTasklet implements Tasklet {

    private static Logger LOGGER = LoggerFactory.getLogger(FileDownloaderTasklet.class);

    @Autowired
    private CovidService covidService;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        //String covidDetails = covidService.getCovidDetails();
        LOGGER.info("File downloader tasklet completed :");
        return RepeatStatus.FINISHED;
    }
}
