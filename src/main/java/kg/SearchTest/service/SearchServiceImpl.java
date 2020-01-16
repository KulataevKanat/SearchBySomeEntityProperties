package kg.SearchTest.service;

import kg.SearchTest.entity.NoteBook;
import kg.SearchTest.entity.PC;
import kg.SearchTest.entity.PS;
import kg.SearchTest.entity.Phone;
import kg.SearchTest.repository.NoteBookRepository;
import kg.SearchTest.repository.PCRepository;
import kg.SearchTest.repository.PSRepository;
import kg.SearchTest.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private NoteBookRepository noteBookRepository;

    @Autowired
    private PCRepository pcRepository;

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private PSRepository psRepository;

    @Override
    public List<NoteBook> findNoteBookByName(String name) {
        return noteBookRepository.findNoteBookByName(name);
    }

    @Override
    public List<PC> findPCByName(String name) {
        return pcRepository.findPCByName(name);
    }

    @Override
    public List<Phone> findPhoneByName(String name) {
        return phoneRepository.findPhoneByName(name);
    }

    @Override
    public List<PS> findPSBookByName(String name) {
        return psRepository.findPSByName(name);
    }

}
