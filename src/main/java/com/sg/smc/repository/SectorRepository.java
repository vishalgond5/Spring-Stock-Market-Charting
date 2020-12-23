package com.sg.smc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.smc.bean.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {

}
