package com.example.SpringDemo.onetoone.Repository;

import com.example.SpringDemo.onetoone.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address,Long> {

}
