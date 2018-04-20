package com.springdb.springdatabase.repository;

import com.springdb.springdatabase.model.TimeKeeper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeKeeperRepository extends CrudRepository<TimeKeeper, String> {
}
