package com.cool.POS.order

import com.cool.POS.order.orderRepository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(path= arrayOf("/orders/{orderId}"))
class OrderController @Autowired constructor(private val orderRepository: OrderRepository) {

    @RequestMapping(method= arrayOf(RequestMethod.GET))
    fun getOrders() = orderRepository.findAll()

    @RequestMapping(method= arrayOf(RequestMethod.GET))
    fun getOrder(@PathVariable orderId: Int) = orderRepository.findById(orderId).let { if(it.isPresent) it.get() else throw Exception("Not Found!") }
}
