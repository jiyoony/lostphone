package lostphoneproject.domain;

import lostphoneproject.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "lossmanagements",
    path = "lossmanagements"
)
public interface LossmanagementRepository
    extends PagingAndSortingRepository<Lossmanagement, Long> {}
