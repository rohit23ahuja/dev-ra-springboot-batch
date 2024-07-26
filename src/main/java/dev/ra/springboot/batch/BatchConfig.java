package dev.ra.springboot.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfig {

    @Bean
    Step myStep(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager){
        return new StepBuilder("myStep", jobRepository)
                .<Integer, Integer>chunk(1, platformTransactionManager)
                .reader(new MyReader())
                .writer(new MyWriter())
                .build();
    }

    @Bean
    Job myJob(JobRepository jobRepository, Step myStep){
        return new JobBuilder("myJob", jobRepository)
                .start(myStep)
                .build();
    }
}
