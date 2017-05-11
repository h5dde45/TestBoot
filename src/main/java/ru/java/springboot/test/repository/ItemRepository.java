package ru.java.springboot.test.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.java.springboot.test.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
