package com.wipro.workspace;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidateRepo extends JpaRepository<InputValues, Long> {

}
