package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.manager;

public interface HomeRepo extends JpaRepository<manager, Integer> {

}
