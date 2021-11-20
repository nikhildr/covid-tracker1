package com.skyfall.covid.tracker.covidtracker.processor;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class TestWriter implements ItemWriter {
    @Override
    public void write(List list) throws Exception {

        System.out.println("inside wirter ");
        System.out.println("list size :"+list.get(0));

    }
}
