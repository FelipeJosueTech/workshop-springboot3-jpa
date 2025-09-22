package com.felipejosuetech.studies.repositories;

import com.felipejosuetech.studies.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {


}
