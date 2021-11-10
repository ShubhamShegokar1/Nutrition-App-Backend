package com.Nutrition.NutritionApp.Twillio;
import com.Nutrition.NutritionApp.Entity.User;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
   class TwilioSmsSender implements SmsSender {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);
    private final TwilioConfiguration twilioConfiguration;
    @Autowired
    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }
    @Override
    public String sendSms(User smsRequest) {
        if (isPhoneNumberValid(smsRequest.getPhoneNumber()))
        {
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message="";
            for(int i=0;i<4;i++) {
                int randomNum = 0 + (int) (Math.random() * 10);
                message+=randomNum;
            }
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            LOGGER.info("Send sms {}", smsRequest);
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + smsRequest.getPhoneNumber() + "] is not a valid number"
            );
        }
        return "done";
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
                return true;
    }
}