package am.david.jcl.controller;

import am.david.jcl.model.Section;
import am.david.jcl.model.Student;
import am.david.jcl.service.SectionService;
import am.david.jcl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by David on 9/9/2017.
 */
@Controller
public class PageController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SectionService sectionService;

    @Autowired
    private HttpServletRequest req;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String selectStudent(Model model) {

        Student student = new Student();
        model.addAttribute("selectStudent", student);
        model.addAttribute("studentsList", studentService.findAll());

        Section section = new Section(studentService.findAll());

        model.addAttribute("selectSection", section);
        model.addAttribute("sectionsList", student.getSections());

        model.addAttribute("studentForm", new Student());

        return "main";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String selectStudent(@ModelAttribute("selectStudent") Student selectStudent, Model model) {

        Section section = new Section(studentService.findAll());

        model.addAttribute("selectSection", section);


        model.addAttribute("studentsList", studentService.findAll());

        for (Student students : section.getStudents()) {

            if (students.getId().equals(selectStudent.getId())) {
                model.addAttribute("sectionsList", students.getSections());
            }
        }

        model.addAttribute("studentForm", new Student());

        return "main";
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public String saveStudent(@ModelAttribute("studentForm") Student studentForm) {
        studentService.save(studentForm);

        return "main";
    }


}
