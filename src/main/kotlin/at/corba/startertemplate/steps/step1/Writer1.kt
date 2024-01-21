package at.corba.startertemplate.steps.step1

import mu.KotlinLogging
import org.springframework.batch.item.Chunk
import org.springframework.batch.item.ItemWriter
import org.springframework.stereotype.Component

@Component
class Writer1 : ItemWriter<String>
{
    /** The logger */
    private val log = KotlinLogging.logger {}

    override fun write(chunk: Chunk<out String>)
    {
        for (item in chunk.items) {
            log.info { item }
        }
    }
}