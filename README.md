# Spring Boot App with Cassandra - Docker

## Initialize Docker

Start by setting up your Cassandra database with Docker.

1. Run the Cassandra Docker container:

    ```bash
    docker run -p 9042:9042 --rm --name cassandra -d cassandra:4.0.7
    ```

2. Access the Cassandra console:

    ```bash
    docker exec -it cassandra bash -c "cqlsh -u cassandra -p cassandra"
    ```

3. Once in the Cassandra console, execute the following commands to set up your keyspace and table:

    ```sql
    CREATE KEYSPACE spring_cassandra WITH replication = {'class' : 'SimpleStrategy', 'replication_factor' : 1};
    USE spring_cassandra;
    CREATE TABLE Product (id int PRIMARY KEY, name text);
    DESCRIBE TABLES;
    DESCRIBE TABLE product;
    ```

## Run Your Spring Boot Application

After setting up your Cassandra database, you can run your Spring Boot application.

## Available API Endpoints

- `GET - /api/products`: Get all products
- `GET - /api/products/1`: Get a single product
- `POST - /api/products`: Create a product
- `PUT - /api/products/1`: Edit a product
- `DELETE - /api/products/1`: Delete a product
