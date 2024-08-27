package com.Fentigo.charityMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Fentigo.charityMicroservice.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
}

