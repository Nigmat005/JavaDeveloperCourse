package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Long> {

    // Display all regions in Canada
    List<Region> findByCountry(String country);

    // Display all regions in Canada, without duplicates
    List<Region> findDistinctByCountry(String country);

    // Display all regions with country name includes 'United'
    List<Region> findByCountryContains(String country);

    //Display all regions with country name include 'United' in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    // Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);
}
