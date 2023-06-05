package rikeei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rikeei.academy.model.Customer;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
