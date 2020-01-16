package kg.SearchTest.model;

import kg.SearchTest.entity.NoteBook;
import kg.SearchTest.entity.PC;
import kg.SearchTest.entity.PS;
import kg.SearchTest.entity.Phone;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Search {
    @ElementCollection(fetch = FetchType.EAGER)
    private List<NoteBook> noteBooksList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<PC> PCsList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Phone> phonesList = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private List<PS> PSsList = new ArrayList<>();

    public Search() {
    }

    public List<NoteBook> getNoteBooksList() {
        return noteBooksList;
    }

    public void setNoteBooksList(List<NoteBook> noteBooksList) {
        this.noteBooksList = noteBooksList;
    }

    public List<PC> getPCsList() {
        return PCsList;
    }

    public void setPCsList(List<PC> PCsList) {
        this.PCsList = PCsList;
    }

    public List<Phone> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(List<Phone> phonesList) {
        this.phonesList = phonesList;
    }

    public List<PS> getPSsList() {
        return PSsList;
    }

    public void setPSsList(List<PS> PSsList) {
        this.PSsList = PSsList;
    }
}