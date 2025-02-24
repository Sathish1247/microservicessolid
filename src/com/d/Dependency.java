package com.d;

//Step 1: Create an abstraction (interface)
interface Database {
 void connect();
}


//added a comment

//Step 2: Implement different database classes
class MySQLDatabase implements Database {
 public void connect() {
     System.out.println("Connected to MySQL Database.");
 }
}

class PostgreSQLDatabase implements Database {
 public void connect() {
     System.out.println("Connected to PostgreSQL Database.");
 }
}

//Step 3: Inject the dependency via constructor
class DataService {
 private Database database;

 public DataService(Database database) {
     this.database = database; // Dependency injected
 }

 void fetchData() {
     database.connect();
     System.out.println("Fetching data...");
 }
}

public class Dependency {
 public static void main(String[] args) {
     Database mySQL = new MySQLDatabase();  // Can be switched easily
     DataService service = new DataService(mySQL);
     service.fetchData();

     System.out.println("Switching database...");

     Database postgreSQL = new PostgreSQLDatabase();  // Easily changeable
     DataService anotherService = new DataService(postgreSQL);
     anotherService.fetchData();
 }
}

