package linggash.kotlin.restful.service

import linggash.kotlin.restful.model.CreateProductRequest
import linggash.kotlin.restful.model.ListProductRequest
import linggash.kotlin.restful.model.ProductResponse
import linggash.kotlin.restful.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

    fun list(listProductRequest: ListProductRequest): List<ProductResponse>
}