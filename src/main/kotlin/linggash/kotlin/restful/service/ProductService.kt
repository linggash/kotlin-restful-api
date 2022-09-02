package linggash.kotlin.restful.service

import linggash.kotlin.restful.model.CreateProductRequest
import linggash.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse
}