package com.dharn.registerservice.repository;

import com.dharn.registerservice.entity.DateModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DateRepository extends CrudRepository<DateModel, Integer> {
    /*@Query("SELECT * FROM DateModel WHERE user")
    List<DateModel> findDateModelByUserId(int UserId);*/
    List<DateModel> findAllByUserId(int userId);
}
