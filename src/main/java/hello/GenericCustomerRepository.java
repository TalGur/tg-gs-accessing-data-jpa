package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenericCustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    List<Customer> findByFirstName(String firstName);
}
