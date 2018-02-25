package com.herokuapp.patrimonioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herokuapp.patrimonioapi.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
