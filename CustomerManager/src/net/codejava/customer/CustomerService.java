package net.codejava.customer;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired CustomerRepository repo;
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	public List<String> findByname(String name) {
		return repo.findByname(name);
	}
	
	public List<Customer> listAll() {
		return (List<Customer>) repo.findAll();
	}
	
	public Customer get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Customer> search(String keyword) {
		return repo.search(keyword);
	}
//	public Map<String, String> findBycredentials(String name, String password) {
//		return repo.findBycredentials(name,password);
//	}
}
