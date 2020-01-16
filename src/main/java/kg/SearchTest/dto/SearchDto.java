package kg.SearchTest.dto;

import kg.SearchTest.entity.NoteBook;
import kg.SearchTest.entity.PC;
import kg.SearchTest.entity.PS;
import kg.SearchTest.entity.Phone;
import kg.SearchTest.model.Search;

import java.util.LinkedList;
import java.util.List;

public class SearchDto {
    private NoteBook noteBooksList;

    private PC PCsList;

    private Phone phonesList;

    private PS PSsList;

    public SearchDto(NoteBook noteBooksList, PC PCsList, Phone phonesList, PS PSsList) {
        this.noteBooksList = noteBooksList;
        this.PCsList = PCsList;
        this.phonesList = phonesList;
        this.PSsList = PSsList;
    }

    public static List<SearchDto> toList(List<NoteBook> noteBooksList, List<PC> PCsList, List<Phone> phonesList, List<PS> PSsList) {
        List<SearchDto> result = new LinkedList<>();
        for (NoteBook noteBook : noteBooksList) {
            for (PC pc : PCsList) {
                for (Phone phone : phonesList) {
                    for (PS ps : PSsList) {
                        result.add(new SearchDto(noteBook, pc, phone, ps));
                    }
                }
            }
        }
        return result;
    }

    public NoteBook getNoteBooksList() {
        return noteBooksList;
    }

    public void setNoteBooksList(NoteBook noteBooksList) {
        this.noteBooksList = noteBooksList;
    }

    public PC getPCsList() {
        return PCsList;
    }

    public void setPCsList(PC PCsList) {
        this.PCsList = PCsList;
    }

    public Phone getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(Phone phonesList) {
        this.phonesList = phonesList;
    }

    public PS getPSsList() {
        return PSsList;
    }

    public void setPSsList(PS PSsList) {
        this.PSsList = PSsList;
    }
}
