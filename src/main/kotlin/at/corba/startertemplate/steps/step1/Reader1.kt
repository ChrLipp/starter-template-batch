package at.corba.startertemplate.steps.step1

import org.springframework.batch.item.ItemReader
import org.springframework.stereotype.Component

@Component
class Reader1 : ItemReader<String>
{
    private val inputs = listOf("hello", "world")
    private var index = 0

    override fun read(): String?
    {
        return inputs.getOrNull(index++)
    }
}
