package kg.SearchTest.service;

import kg.SearchTest.entity.NoteBook;
import kg.SearchTest.entity.PC;
import kg.SearchTest.entity.PS;
import kg.SearchTest.entity.Phone;

import java.util.List;

public interface SearchService {
    List<NoteBook> findNoteBookByName(String name);

    List<PC> findPCByName(String name);

    List<Phone> findPhoneByName(String name);

    List<PS> findPSBookByName(String name);

}
