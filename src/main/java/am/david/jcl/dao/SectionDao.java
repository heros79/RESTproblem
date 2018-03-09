package am.david.jcl.dao;

import am.david.jcl.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by David on 9/8/2017.
 */
public interface SectionDao extends JpaRepository <Section, Long>{

    Section findById (Long id);

    Section findBySectionName (String sectionName);

    List <Section> findAll ();
}
