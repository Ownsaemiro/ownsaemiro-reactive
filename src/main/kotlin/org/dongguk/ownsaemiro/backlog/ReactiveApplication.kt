package org.dongguk.ownsaemiro.backlog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.TimeZone

@SpringBootApplication
class BacklogApplication {
	init {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"))
	}
}

fun main(args: Array<String>) {
	runApplication<BacklogApplication>(*args)
}
