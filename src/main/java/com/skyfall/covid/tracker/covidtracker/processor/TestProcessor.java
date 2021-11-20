package com.skyfall.covid.tracker.covidtracker.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.batch.api.chunk.ItemProcessor;

public class TestProcessor implements ItemProcessor {
    @Override
    public Object processItem(Object o) throws Exception {
        System.out.println("inside processor :" +o);
        return null;
    }
}
