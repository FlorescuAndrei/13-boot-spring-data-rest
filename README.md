# 13-boot-spring-data-rest
Spring Boot Learning Project.  
CRM app: expose Rest endpoints for: add Customer, get all customer, get customer, update customer, delete customer.  
Use Spring Data JPA and Spring Data Rest.  
Use MySQL database with one table: customer.

Spring Boot Dependency: Spring Web ; Data JPA; DevTools; MySQL Driver; Data REST(Rest Repositories).

Only need 3 items:  
  - Entity: Customer;  
  - JPA Repository interface: EmployeeRepository extends JpaRepository;  
  - Maven Pom dependency : spring-boot-starter-data-rest.

    
| HTTP Method | CRUD   | Action	Edpoint |
| :---------- |:------:| :--------------|
| POST        | CREATE | /api/customers |
| GET         | READ   | <ul><li>/api/customers</li><li> /api/customers/{customerId}</li>|
| PUT         | UPDATE | /api/customers/{customerId} |  
| DELETE      | DELETE | /api/customers/{customerId} |
    

For Update place the id in the url not in the JSON body like befre


Spring Data Rest  
  - **Configuration**:  
      - add entry in application.properties: spring.data.rest.base-path=/newpath    
      - and/or annotate JPA Repository interface: @RepositoryRestResource(path="members").  
      - new access path: http://localhost:8080/newpath/members;
  - **Pagination**:  add entry in application.properties (zerro based);
  - **Sorting**: in url uppend ?sort=lastName, etc....    http://localhost:8080/customers?sort=lastName;  
      
    
[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git) 





