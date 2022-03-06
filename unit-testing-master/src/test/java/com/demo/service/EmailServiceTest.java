package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @InjectMocks
    EmailService emailServiceMock;

    @Test(expected = RuntimeException.class)
    public void sendEmail() {
        //Given
        EmailService emailService = new EmailService();
        Order order = new Order(5, "Lays", 50);

        //When
        emailService.sendEmail(order);

        //Then
        verify(emailServiceMock).sendEmail(order);
    }

    @Test
    public void testSendEmail() {
        //Given
        EmailService emailService = new EmailService();
        Order order = new Order(5, "Lays", 50);

        //When
        emailServiceMock.sendEmail(order, "sarveshh.arora@tothenew.com");

        //Then
        assertEquals(true, emailService.sendEmail(order,"sarveshh.arora@tothenew.com"));
    }
}