# Spring-CRUD-operation

In this project all the crud operation related operation are added and leter I wil convert it into a LMS project. 
I have use Thymeleaf for UI of the data

JPA Query
```java
@Query(value = "SELECT * FROM student s where s.collage_name = ?1", nativeQuery = true)
List<Student> getAllStudentWithCollageName(String collageName);

@Query(value = "SELECT DISTINCT s.collage_name  FROM student s", nativeQuery = true)
List<String> getAllCollageName();

```
