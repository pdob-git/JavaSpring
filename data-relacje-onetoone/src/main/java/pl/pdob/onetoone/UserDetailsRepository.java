package pl.pdob.onetoone;

import org.springframework.data.repository.CrudRepository;

interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {
}
