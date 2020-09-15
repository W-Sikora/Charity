package pl.coderslab.charity.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.model.entities.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query(nativeQuery = true, value = "select coalesce (count(distinct institution_id), 0) from donations")
    int noOfSupportedInstitutions();

    @Query(nativeQuery = true, value = "select coalesce (sum(quantity), 0) from donations")
    int noOfDonations();

}
