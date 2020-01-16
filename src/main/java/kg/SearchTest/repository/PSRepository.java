package kg.SearchTest.repository;

import kg.SearchTest.entity.PS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PSRepository extends JpaRepository<PS, Long> {
    @Query("SELECT p FROM PS p WHERE lower(p.name) LIKE coalesce(lower(cast(CONCAT('%', :name, '%')as text)), lower(p.name)) ")
    List<PS> findPSByName(@Param("name") String name);
}
