package pl.pdob.onetomany;

import org.springframework.data.repository.CrudRepository;

interface ClientRepository extends CrudRepository<Client, Long> {
}
