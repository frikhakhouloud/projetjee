package com.ppe.bestdeal.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ppe.bestdeal.entities.Deal;

public interface DealRepository extends JpaRepository<Deal,Long>{

}
