package am.david.jcl.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by David on 9/8/2017.
 */

@Entity
@Table (name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "student_name")
    private String studentName;

    @Column (name = "student_last_name")
    private String studentLastName;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "student_sections", joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public Student() {
    }

    public Student (List<Section> sections ) {
        this.sections = sections;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
