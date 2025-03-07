package lostphoneproject.domain;

import lostphoneproject.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "rentalPhones",
    path = "rentalPhones"
)
public interface RentalPhoneRepository
    extends PagingAndSortingRepository<RentalPhone, Long> {}
