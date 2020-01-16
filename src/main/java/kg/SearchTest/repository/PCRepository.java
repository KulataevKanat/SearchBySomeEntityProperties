package kg.SearchTest.repository;

import kg.SearchTest.entity.PC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCRepository extends JpaRepository<PC, Long> {
    @Query("SELECT p FROM PC p WHERE lower(p.name) LIKE coalesce(lower(cast(CONCAT('%', :name, '%')as text)), lower(p.name)) ")
    List<PC> findPCByName(@Param("name") String name);
}
