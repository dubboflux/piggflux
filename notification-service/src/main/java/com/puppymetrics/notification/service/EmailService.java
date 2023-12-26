package com.puppymetrics.notification.service;

import com.puppymetrics.notification.domain.NotificationType;
import com.puppymetrics.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
