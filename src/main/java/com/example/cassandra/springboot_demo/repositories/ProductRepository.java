package com.example.cassandra.springboot_demo.repositories;

import com.example.cassandra.springboot_demo.models.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product, Integer> {
}
