package SpringDemo.Service;

import SpringDemo.Model.Student;
import SpringDemo.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "New Record Added";
    }

    @Override
    public String updateStudent(Student student, int id) {
        Student st1 = studentRepo.findById(id).get();
        st1.setMarks(student.getMarks());
        st1.setCollageName(student.getCollageName());
        st1.setRoll(student.getRoll());
        st1.setName(student.getName());
        studentRepo.save(st1);
        return "Record update with id no "+id;
    }

    @Override
    public Student getStudentByName(String name) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Student> getAllStudentWithCollageName(String collageName) {
        return studentRepo.getAllStudentWithCollageName(collageName);
    }

    @Override
    public String deleteStudentById(int id) {
        studentRepo.deleteById(id);
        return "One Record deleted with id "+id;
    }

    @Override
    public List<String> getAllCollageName() {
        return studentRepo.getAllCollageName();
    }
}
