package com.example.SpringDemo.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository  extends JpaRepository<Courses,Long> {
}
