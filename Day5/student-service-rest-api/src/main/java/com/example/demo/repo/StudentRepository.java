package com.example.demo.repo;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
   
	public List<Student> findByStudentName(String srchName);
	
	@Query(nativeQuery = true, 
			value= "update student set markScored=:mark where rollNo=:number")
	@Modifying
	@Transactional
	public int updateMark(@Param("number") int rollNo,@Param("mark") double markToUpdate);
}
