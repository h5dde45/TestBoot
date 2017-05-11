package ru.java.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.java.springboot.test.domain.Item;
import ru.java.springboot.test.repository.ItemRepository;

@Component
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    public void showData() {

            Item item2 = itemRepository.findOne(1L);
            item2.setName("asdasd");
            itemRepository.save(item2);
        for (Item item : itemRepository.findAll()) {
            System.out.println("item = " + item.getName());
        }
    }
}

