package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {


    @InjectMocks
    OrderService orderServiceMock;

    @Test
    public void getInstance() {

    }

    @Test(expected = RuntimeException.class)
    public void placeOrder() {
        //Given
        Order order = new Order(5, "Lays", 50);

        //When
        orderServiceMock.placeOrder(order);

        //Then
        verify(orderServiceMock).placeOrder(order);
    }

    @Test
    public void testPlaceOrder() {
        //Given
        Order order = new Order(5, "Lays", 50);

        //When
        when(orderServiceMock.placeOrder(order, "sarveshh.arora@tothenew.com")).thenReturn(true);

        //Then
        assertEquals(true, orderServiceMock.placeOrder(order, "sarveshh.arora@tothenew.com"));
    }
}
