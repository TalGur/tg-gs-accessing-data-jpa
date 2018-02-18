package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryOrig extends GenericCustomerRepository {
    //List<Customer> findByLastName(String lastName);
}
