package linggash.kotlin.restful.service.impl

import linggash.kotlin.restful.entity.Product
import linggash.kotlin.restful.model.CreateProductRequest
import linggash.kotlin.restful.model.ProductResponse
import linggash.kotlin.restful.repository.ProductRepository
import linggash.kotlin.restful.service.ProductService
import linggash.kotlin.restful.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.util.Date

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository,
    val validationUtil: ValidationUtil
) : ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
            id = createProductRequest.id!!,
            name = createProductRequest.name!!,
            price = createProductRequest.price!!,
            quantity = createProductRequest.quantity!!,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )

    }
}