package com.heycar.repository;

import com.heycar.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepo extends JpaRepository<Listing, Long> {

}
