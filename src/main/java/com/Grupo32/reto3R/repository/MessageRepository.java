package com.Grupo32.reto3R.repository;

import com.Grupo32.reto3R.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageModel,Integer> {

}
