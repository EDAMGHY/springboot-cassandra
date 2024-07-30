package com.example.cassandra.springboot_demo.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @PrimaryKey
    private int id;
    private String name; 
}
