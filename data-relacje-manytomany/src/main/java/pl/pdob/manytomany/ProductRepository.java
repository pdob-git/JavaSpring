package pl.pdob.manytomany;

import org.springframework.data.repository.CrudRepository;

interface ProductRepository extends CrudRepository<Product, Long> {
}
