package com.myrestaurant.store.notificationservice.listner.impl;

import com.myrestaurant.store.notificationservice.listner.NotificationListner;
import com.myrestaurant.store.notificationservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
@Profile("email")
public class EmailListenerImpl implements NotificationListner {

    private final EmailService emailService;


    @Override
    @RabbitListener(queues = {"${app.rabbitmq.notify-pizzas-added-routingkey}"})
    public void onNotifyPizzasToRestaurantAdded(String message) {
        log.info("Into EmailListenerImpl - onAddPizzasToRestaurant method.");
        emailService.sendMessagge(message);
    }
}
