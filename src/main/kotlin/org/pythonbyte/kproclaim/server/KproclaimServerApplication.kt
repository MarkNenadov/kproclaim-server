package org.pythonbyte.kproclaim.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["org.pythonbyte"])
class KproclaimServerApplication

fun main(args: Array<String>) {
    runApplication<KproclaimServerApplication>(*args)
}
