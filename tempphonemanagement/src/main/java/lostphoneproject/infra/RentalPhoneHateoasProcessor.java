package lostphoneproject.infra;

import lostphoneproject.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RentalPhoneHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RentalPhone>> {

    @Override
    public EntityModel<RentalPhone> process(EntityModel<RentalPhone> model) {
        return model;
    }
}
