package com.Grupo32.reto3R.repository;

import com.Grupo32.reto3R.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel,Integer> {

}
