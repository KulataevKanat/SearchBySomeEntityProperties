package kg.SearchTest.bootstrap;

import kg.SearchTest.entity.NoteBook;
import kg.SearchTest.entity.PC;
import kg.SearchTest.entity.PS;
import kg.SearchTest.entity.Phone;
import kg.SearchTest.repository.NoteBookRepository;
import kg.SearchTest.repository.PCRepository;
import kg.SearchTest.repository.PSRepository;
import kg.SearchTest.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Data implements CommandLineRunner {
    @Autowired
    private NoteBookRepository noteBookRepository;

    @Autowired
    private PCRepository pcRepository;

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private PSRepository psRepository;


    @Override
    public void run(String... args) throws Exception {
        NoteBook noteBook = new NoteBook();
        noteBook.setName("SONY");
        noteBookRepository.save(noteBook);

        NoteBook secondNoteBook = new NoteBook();
        secondNoteBook.setName("LG");
        noteBookRepository.save(secondNoteBook);

        PC pc = new PC();
        pc.setName("SONY");
        pcRepository.save(pc);

        PC secondPc = new PC();
        secondPc.setName("LG");
        pcRepository.save(secondPc);

        Phone phone = new Phone();
        phone.setName("SONY");
        phoneRepository.save(phone);

        Phone secondPhone = new Phone();
        secondPhone.setName("LG");
        phoneRepository.save(secondPhone);

        PS ps = new PS();
        ps.setName("SONY");
        psRepository.save(ps);

        PS secondPs = new PS();
        secondPs.setName("LG");
        psRepository.save(secondPs);

    }
}
