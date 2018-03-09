package am.david.jcl.service;

import am.david.jcl.model.Student;

import java.util.List;

/**
 * Created by David on 9/9/2017.
 */
public interface StudentService {

    Student save (Student student);

    Student findByStudentName (String studentName);

    Student findById (Long id);

    List <Student> findAll();
}
