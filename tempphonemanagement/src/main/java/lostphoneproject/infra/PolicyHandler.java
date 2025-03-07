package lostphoneproject.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import lostphoneproject.config.kafka.KafkaProcessor;
import lostphoneproject.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    RentalPhoneRepository rentalPhoneRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Appliedforatemporaryphone'"
    )
    public void wheneverAppliedforatemporaryphone_TemporaryPhoneApplicationProcessUnderway(
        @Payload Appliedforatemporaryphone appliedforatemporaryphone
    ) {
        Appliedforatemporaryphone event = appliedforatemporaryphone;
        System.out.println(
            "\n\n##### listener TemporaryPhoneApplicationProcessUnderway : " +
            appliedforatemporaryphone +
            "\n\n"
        );

        // Sample Logic //

        // TemporaryPhoneApplicationCommand command = new TemporaryPhoneApplicationCommand();
        // RentalPhone.temporaryPhoneApplication(command);
    }
}
//>>> Clean Arch / Inbound Adaptor
