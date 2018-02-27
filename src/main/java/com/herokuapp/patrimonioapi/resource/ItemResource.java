package com.herokuapp.patrimonioapi.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.herokuapp.patrimonioapi.model.Item;
import com.herokuapp.patrimonioapi.repository.ItemRepository;

@RestController
@CrossOrigin(origins={"https://patrimonio.now.sh","https://patrimonio-material.now.sh","http://localhost:4200"})
public class ItemResource {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/item")
	public List<Item> lst() {
		return this.itemRepository.findAll();
	}
	
	@PostMapping("/item")
	public Item add(@RequestBody @Valid Item item) {
		return this.itemRepository.save(item);
	}
	
}
