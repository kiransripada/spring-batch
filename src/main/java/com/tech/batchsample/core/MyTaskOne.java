package com.tech.batchsample.core;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTaskOne implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println("My Taskone Started");
        System.out.println("*******");
        System.out.println("TaskOne Done");

        return RepeatStatus.FINISHED;
    }
}
