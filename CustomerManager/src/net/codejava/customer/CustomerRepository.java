package net.codejava.customer;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	@Query(value = "SELECT c FROM Customer c WHERE c.name LIKE '%' || :keyword || '%'"
			+ " OR c.email LIKE '%' || :keyword || '%'"
			+ " OR c.password LIKE '%' || :keyword || '%'")
	public List<Customer> search(@Param("keyword") String keyword);

	
	//@Query(value="select * from Customer where name='\" + login.getName() + \"' and password='\" + login.getPassword()" )
	public List<String> findByname(String name);

//	@Query(value = "select name, password from customer")
//	public Map<String, String> findBycredentials(String name, String password);
}
