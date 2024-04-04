package com.activation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activation.model.Empolyee;

@Repository
public interface EmpRepository extends JpaRepository<Empolyee, Integer> {

	List<Empolyee> findAll();

}
