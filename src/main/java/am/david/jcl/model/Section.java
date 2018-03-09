package am.david.jcl.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by David on 9/8/2017.
 */

@Entity
@Table (name = "sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "section_name")
    private String sectionName;

    @Column (name = "section_description")
    private String sectionDescription;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "sections")
    private List<Student> students;

    public Section() {
    }

    public Section  (List<Student> studentsList) {
        this.students = studentsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
