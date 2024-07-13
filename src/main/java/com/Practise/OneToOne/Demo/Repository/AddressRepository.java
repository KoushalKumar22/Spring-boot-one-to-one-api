package com.Practise.OneToOne.Demo.Repository;

import com.Practise.OneToOne.Demo.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
