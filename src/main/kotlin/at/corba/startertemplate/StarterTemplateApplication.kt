package at.corba.startertemplate

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.system.exitProcess

@SpringBootApplication
class StarterTemplateApplication

fun main(args: Array<String>)
{
    val context = runApplication<StarterTemplateApplication>(*args)
    exitProcess(SpringApplication.exit(context))
}