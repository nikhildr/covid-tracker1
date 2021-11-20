package com.skyfall.covid.tracker.covidtracker.tasklet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class FileSplitterTasklet implements Tasklet {

    private static Logger LOGGER = LoggerFactory.getLogger(FileSplitterTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        LOGGER.info("completed file splitter tasklet");
        return RepeatStatus.FINISHED;
    }
}
