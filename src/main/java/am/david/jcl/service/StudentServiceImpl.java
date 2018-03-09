package am.david.jcl.service;

import am.david.jcl.dao.StudentDao;
import am.david.jcl.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by David on 9/9/2017.
 */
@Service ("Student")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student findByStudentName(String studentName) {
        return studentDao.findByStudentName(studentName);
    }

    @Override
    public Student findById(Long id) {
        return studentDao.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
