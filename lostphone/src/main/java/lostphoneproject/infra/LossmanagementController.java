package lostphoneproject.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import lostphoneproject.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/lossmanagements")
@Transactional
public class LossmanagementController {

    @Autowired
    LossmanagementRepository lossmanagementRepository;

    @RequestMapping(
        value = "/lossmanagements/{id}/applyfor a temporary phone",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Lossmanagement applyForATemporaryPhone(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /lossmanagement/applyForATemporaryPhone  called #####"
        );
        Optional<Lossmanagement> optionalLossmanagement = lossmanagementRepository.findById(
            id
        );

        optionalLossmanagement.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        Lossmanagement lossmanagement = optionalLossmanagement.get();
        lossmanagement.applyForATemporaryPhone();

        lossmanagementRepository.save(lossmanagement);
        return lossmanagement;
    }
}
//>>> Clean Arch / Inbound Adaptor
