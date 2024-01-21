package at.corba.startertemplate.steps.step1

import org.springframework.batch.core.Step
import org.springframework.batch.core.repository.JobRepository
import org.springframework.batch.core.step.builder.StepBuilder
import org.springframework.batch.item.ItemReader
import org.springframework.batch.item.ItemWriter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.PlatformTransactionManager

@Configuration
class Step1Config(
    val jobRepository: JobRepository,
    val transactionManager: PlatformTransactionManager
)
{
    @Bean
    fun step1(
        reader1: ItemReader<String>,
        writer1: ItemWriter<String>
    ) : Step
    {
        return StepBuilder("1: Step 1", jobRepository)
            .chunk<String, String>(5, transactionManager)
            .reader(reader1)
            .writer(writer1)
            .build()
    }
}