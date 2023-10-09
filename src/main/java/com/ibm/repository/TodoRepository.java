package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}