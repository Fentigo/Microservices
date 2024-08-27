package com.Fentigo.charityMicroservice.service;

import com.Fentigo.charityMicroservice.model.Donation;
import com.Fentigo.charityMicroservice.repository.DonationRepository;
import com.Fentigo.charityMicroservice.dto.DonationRequest;
import com.Fentigo.charityMicroservice.dto.DonationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    public DonationResponse createDonation(DonationRequest request) {
        // Create and save the donation
        Donation donation = new Donation();
        donation.setAccountId(request.getAccountId());
        donation.setAmount(request.getAmount());
        donation.setStatus("PENDING");

        donationRepository.save(donation);

        // Prepare the response
        DonationResponse response = new DonationResponse();
        response.setDonationId(donation.getId());
        response.setAccountId(donation.getAccountId());
        response.setAmount(donation.getAmount());
        response.setStatus(donation.getStatus());

        return response;
    }
}
