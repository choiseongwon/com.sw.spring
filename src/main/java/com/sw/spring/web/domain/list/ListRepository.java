package com.sw.spring.web.domain.list;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListRepository extends JpaRepository<MyList, Long>{
    @Query("SELECT l FROM MyList l ORDER BY l.id DESC")
    List<MyList> findAllDesc();

}
