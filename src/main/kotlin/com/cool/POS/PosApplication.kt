package com.cool.POS

import com.cool.POS.order.CustomerOrder
import com.cool.POS.order.orderRepository.OrderRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class PosApplication {

    @Bean
    fun init(orderRepository: OrderRepository) = CommandLineRunner { (1..10).forEach { orderRepository.save(CustomerOrder(it)) } }
}

fun main(args: Array<String>) {
    SpringApplication.run(PosApplication::class.java, *args)
}
