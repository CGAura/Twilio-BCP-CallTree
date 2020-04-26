package org.wicket.calltree.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.wicket.calltree.service.TwilioServiceImpl;
import org.wicket.calltree.services.utils.MessageMapper;

/**
 * @author Alessandro Arosio - 13/04/2020 11:06
 */
@ExtendWith(SpringExtension.class)
class CallTreeServiceImplTest {
    @Mock
    TwilioServiceImpl twilioService;

    @Mock
    MessageMapper mapper;

    @Mock
    ContactService contactService;

    @InjectMocks
    CallTreeServiceImpl callTreeService;

    final String BODY = "ToCountry=US&ToState=DC&SmsMessageSid=test&NumMedia=0&ToCity=&FromZip=&SmsSid=test&FromState=&SmsStatus=received&FromCity=&Body=3&FromCountry=GB&To=%2B000&MessagingServiceSid=test&ToZip=&NumSegments=1&MessageSid=test&AccountSid=test&From=%2B441234&ApiVersion=2010-04-01";

    @Test
    void testSmsParser_WillMapBodyToInboundSmsDto() {
        //@todo write more complete tests
    }
}