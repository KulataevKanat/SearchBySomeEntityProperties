package kg.SearchTest.repository;

import kg.SearchTest.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
    @Query("SELECT p FROM Phone p WHERE lower(p.name) LIKE coalesce(lower(cast(CONCAT('%', :name, '%')as text)), lower(p.name)) ")
    List<Phone> findPhoneByName(@Param("name") String name);
}
