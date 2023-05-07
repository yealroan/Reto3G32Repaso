package com.Grupo32.reto3R.repository;

import com.Grupo32.reto3R.model.ScoreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreModel,Integer> {

}
