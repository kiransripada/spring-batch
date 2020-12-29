package com.tech.batchsample.core;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTaskTwo implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println("MyTask Two");
        System.out.println("*****");
        System.out.println("Task Two Done");

        return RepeatStatus.FINISHED;
    }
}
