package lostphoneproject.domain;

import lostphoneproject.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "phonemanagements",
    path = "phonemanagements"
)
public interface PhonemanagementRepository
    extends PagingAndSortingRepository<Phonemanagement, Long> {}
