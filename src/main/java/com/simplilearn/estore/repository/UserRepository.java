package com.simplilearn.estore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.estore.jpa.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByEmailAndPassword(String email, String password);
}
