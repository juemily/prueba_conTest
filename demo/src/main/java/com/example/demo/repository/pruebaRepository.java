package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.pruebaEntity;

@Repository("PruebaRepository")
public interface pruebaRepository extends JpaRepository<pruebaEntity, Serializable> {

}
