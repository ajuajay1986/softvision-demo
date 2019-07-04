# softvision-demo

Here I have use H2 database. Also in the pom I have added the dependencies for spring-boot-devtools. 
This spring boot dependency provides us with a H2-DB UI interface. Late we will make of this UI to populate data in H2. 

I have define a RestController which maps the request /booklist to the method bookPageable. 
This method takes the Spring Pageable as parameter. 

Compile and the run the SoftvisionDemoApplication.java as a Spring boot application.
We now use the H2-console to insert data in H2 database. Go to localhost:8080/h2-console/login.do.
In the JDBC url use jdbc:h2:mem:testdb. Keep the password blank.Click on Connect. 

Then select the Books table. Run the select query. Next add test data to the table. 

Then go to http://localhost:8080/booklist?page=0&size=2&sort=title
