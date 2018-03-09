package am.david.jcl.service;

import am.david.jcl.dao.SectionDao;
import am.david.jcl.model.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by David on 9/9/2017.
 */

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionDao sectionDao;

    @Override
    public Section saveSection(Section section) {
        return sectionDao.save(section);
    }

    @Override
    public Section findById(Long id) {
        return sectionDao.findById(id);
    }

    @Override
    public Section findBySectionName(String sectionName) {
        return sectionDao.findBySectionName(sectionName);
    }

    @Override
    public List<Section> findAll() {
        return sectionDao.findAll();
    }
}
