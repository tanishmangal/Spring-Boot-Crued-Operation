package SpringDemo.Service;

import SpringDemo.Model.Student;

import java.util.List;

public interface StudentService {
    public String addStudent(Student student);

    public String updateStudent(Student student, int id);

    public Student getStudentByName(String name);

    public List<Student> getAllStudent();

    public Student getStudentById(int id);

    public List<Student> getAllStudentWithCollageName(String collageName);

    public String deleteStudentById(int id);

    public List<String> getAllCollageName();
}
