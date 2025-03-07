package lostphoneproject.infra;

import lostphoneproject.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class LossmanagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Lossmanagement>> {

    @Override
    public EntityModel<Lossmanagement> process(
        EntityModel<Lossmanagement> model
    ) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/applyfor a temporary phone"
                )
                .withRel("applyfor a temporary phone")
        );

        return model;
    }
}
