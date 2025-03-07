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
    PhonemanagementRepository phonemanagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reportedlost'"
    )
    public void wheneverReportedlost_LossReportProcessing(
        @Payload Reportedlost reportedlost
    ) {
        Reportedlost event = reportedlost;
        System.out.println(
            "\n\n##### listener LossReportProcessing : " + reportedlost + "\n\n"
        );

        // Sample Logic //

        // ReportLossCommand command = new ReportLossCommand();
        // Phonemanagement.reportLoss(command);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Cancellationoflossreport'"
    )
    public void wheneverCancellationoflossreport_LossReportCancellationProcessing(
        @Payload Cancellationoflossreport cancellationoflossreport
    ) {
        Cancellationoflossreport event = cancellationoflossreport;
        System.out.println(
            "\n\n##### listener LossReportCancellationProcessing : " +
            cancellationoflossreport +
            "\n\n"
        );

        // Sample Logic //

        // CancellationOfLossReportCommand command = new CancellationOfLossReportCommand();
        // Phonemanagement.cancellationOfLossReport(command);
    }
}
//>>> Clean Arch / Inbound Adaptor
