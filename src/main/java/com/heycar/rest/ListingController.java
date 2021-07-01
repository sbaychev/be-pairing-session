package com.heycar.rest;

import com.heycar.services.ListingService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ListingController.class);

    private final ListingService listingService;

    @Autowired
    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @PostMapping
    public ResponseEntity<?> saveListing(
        @RequestParam("dealerId") String dealerId,
        @RequestBody List<ListingRequest> listingRequests) {

        try {

            this.listingService.saveListingRequest(listingRequests, dealerId);

        } catch (Exception exception) {

            LOGGER.error("Something went wrong the Listing was not saved", exception);

            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
