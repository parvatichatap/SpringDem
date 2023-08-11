package com.example.SpringDemo.onetoone.Repository;

import com.example.SpringDemo.onetoone.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository  extends JpaRepository<Emp,Long> {
}
