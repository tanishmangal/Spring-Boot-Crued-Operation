package SpringDemo.Controller;

import SpringDemo.Model.Student;
import SpringDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable int id){
        return studentService.updateStudent(student, id);
    }


    @GetMapping("/collage")
    public List<Student> getAllStudentWithCollageName(@RequestParam String collageName){
        return studentService.getAllStudentWithCollageName(collageName);
    }


    @GetMapping("/collageList")
    public List<String> getAllCollageName(){
        return studentService.getAllCollageName();
    }

}
