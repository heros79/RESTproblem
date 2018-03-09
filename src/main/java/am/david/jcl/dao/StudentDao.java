package am.david.jcl.dao;

import am.david.jcl.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by David on 9/8/2017.
 */
public interface StudentDao extends JpaRepository <Student, Long> {



    Student findById (Long id);

    Student findByStudentName (String studentName);

    List <Student> findAll ();
}
