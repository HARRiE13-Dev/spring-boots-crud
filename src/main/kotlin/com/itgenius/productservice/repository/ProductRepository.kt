package com.itgenius.productservice.repository

import com.itgenius.productservice.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product,Int> {
  // If you wanna be custom interface

  //  fun findByProductName(productName : String):Product?
}