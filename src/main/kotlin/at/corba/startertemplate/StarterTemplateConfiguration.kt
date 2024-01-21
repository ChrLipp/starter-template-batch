package at.corba.startertemplate

import at.corba.startertemplate.steps.step1.Step1Config
import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.job.builder.JobBuilder
import org.springframework.batch.core.repository.JobRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * Place your configuration here.
 */
@Configuration
@Import(Step1Config::class)
class StarterTemplateConfiguration
{
    /**
     * The batch job which is executed on program start.
     * @param jobRepository The job repository
     * @param step1         First step
     * @return              the job
     */
    @Bean
    fun job(
        jobRepository: JobRepository,
        step1: Step
    ): Job {
        return JobBuilder("job", jobRepository)
            .start(step1)           // does anything
            .build()
    }
}
