package com.heycar.services;

import com.heycar.model.Listing;
import com.heycar.repository.ListingRepo;
import com.heycar.rest.ListingRequest;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ListingService.class);

    private final ListingRepo listingRepo;

    @Autowired
    public ListingService(ListingRepo listingRepo) {
        this.listingRepo = listingRepo;
    }

    public void saveListingRequest(List<ListingRequest> listingRequests, String dealerId) {

        List<Listing> listings = new ArrayList<>();

        for (ListingRequest listingRequest : listingRequests) {

            Listing listing = new Listing();

            listing.setCode(listingRequest.getCode());
            listing.setColor(listingRequest.getColor());
            listing.setMake(listingRequest.getMake());
            listing.setModel(listingRequest.getModel());
            listing.setPrice(listingRequest.getPrice());
            listing.setYear(listingRequest.getYear());

            listing.setDealerId(dealerId);

            listings.add(listing);
        }

        LOGGER.info("About to save to DB listingRequests # {} for dealer {}", listings.size(), dealerId);

        this.listingRepo.saveAll(listings);
    }
}
