package com.cool.POS.order.orderRepository

import com.cool.POS.order.CustomerOrder
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*


interface OrderRepository : JpaRepository<CustomerOrder, Int> {
    fun findById(id: Int): Optional<CustomerOrder>
}
