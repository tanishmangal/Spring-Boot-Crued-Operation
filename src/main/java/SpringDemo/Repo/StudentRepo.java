package SpringDemo.Repo;

import SpringDemo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT * FROM student s where s.collage_name = ?1", nativeQuery = true)
    List<Student> getAllStudentWithCollageName(String collageName);

    @Query(value = "SELECT DISTINCT s.collage_name  FROM student s", nativeQuery = true)
    List<String> getAllCollageName();
}
