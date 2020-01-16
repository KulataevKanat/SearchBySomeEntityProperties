package kg.SearchTest.repository;

import kg.SearchTest.entity.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteBookRepository extends JpaRepository<NoteBook, Long> {
    @Query("SELECT nb FROM NoteBook nb WHERE lower(nb.name) LIKE coalesce(lower(cast(CONCAT('%',:name,'%') as text)), lower(nb.name)) ")
    List<NoteBook> findNoteBookByName(@Param("name") String name);
}
