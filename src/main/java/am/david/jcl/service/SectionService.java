package am.david.jcl.service;

import am.david.jcl.model.Section;

import java.util.List;

/**
 * Created by David on 9/9/2017.
 */
public interface SectionService {

    Section saveSection (Section section);

    Section findById (Long id);

    Section findBySectionName (String sectionName);

    List <Section> findAll();
}
