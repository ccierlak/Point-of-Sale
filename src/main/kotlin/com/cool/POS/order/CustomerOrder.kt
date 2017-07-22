package com.cool.POS.order

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

//"Order" is a sql keyword, naming the entity this would cause sql grammar errors in hibernate
@Entity
data class CustomerOrder(@Id @GeneratedValue val id: Int)
