package SpringDemo.Controller;


import SpringDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public String getAllStudent(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "index";
    }

}
