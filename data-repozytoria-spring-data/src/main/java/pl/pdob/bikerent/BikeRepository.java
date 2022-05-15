package pl.pdob.bikerent;

import org.springframework.data.repository.CrudRepository;

interface BikeRepository extends CrudRepository<Bike, Long> { }
