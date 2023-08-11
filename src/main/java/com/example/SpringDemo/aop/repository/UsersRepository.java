//package com.example.SpringDemo.aop.repository;
//import com.example.SpringDemo.aop.entity.Users;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//
//public interface UsersRepository extends JpaRepository <Users,Long>{
//    @Query(value = "select * from fn_login(?1,?2)",nativeQuery = true)
//    String getLoginUser(String userName,String password);
//}
//
