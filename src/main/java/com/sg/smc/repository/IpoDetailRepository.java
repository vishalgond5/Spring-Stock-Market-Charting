package com.sg.smc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.smc.bean.IpoDetail;

@Repository
public interface IpoDetailRepository extends JpaRepository<IpoDetail, Long> {

}
