package com.example.SpringDemo.manytomany;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudRepo extends JpaRepository<Student,Long>  {

}
