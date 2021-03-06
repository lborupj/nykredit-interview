# Nykredit Interview JAX-RS web application

This is sample repository containing a basic JAX-RS web application.


## Get it!

Clone this repository


## Build

This project uses Maven as build tool, Java 8 (1.8) and Maven 3 (newer version) 

```sh 
mvn clean package
```

## Run

Run the application using Maven Cargo on wildfly

```sh 
mvn cargo:run
```
 
which will start the wildfly application server, listening on port 7001 and debug port is available at port 5000.
The context root of the application will be 

```sh
http://localhost:7001/petstore
```


## Tasks

* Add a REST resource at path /pets
    * GET operation for /pets/{id} which consumes "application/json" and produces "application/json"
    * PUT operation for /pets/{id} which consumes "application/json" and produces "application/json"

The project includes a very simple PetRepository that may be injected into the resource exposure class. This repository will just keep instances in a non-persistent Map

## Tests

Using e.g. POSTMAN I should be able to:

PUT http://localhost:7001/petstore/pets/mydog

```JSON
{
	"name": "My Pet",
	"type": "DOG"
}
```

GET http://localhost:7001/petstore/pets/mydog should return

```JSON
{
    "id": "mydog",
    "name": "King",
    "type": "DOG"
}
```

## When done

Either ZIP (remember to do a "mvn clean" before) the solution and send it to me (LAJE) OR upload sources to a git repository of your choice and send me a link




