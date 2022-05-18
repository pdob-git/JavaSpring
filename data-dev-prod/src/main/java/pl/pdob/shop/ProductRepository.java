package pl.pdob.shop;

import org.springframework.data.repository.CrudRepository;

interface ProductRepository extends CrudRepository<Product, Long> {
}
