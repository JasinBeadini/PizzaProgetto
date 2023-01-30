package com.myrestaurant.store.notificationservice.listner.impl;


import com.myrestaurant.store.notificationservice.listner.NotificationListner;
import com.myrestaurant.store.notificationservice.service.SMSService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@Profile("sms")
public class SMSListenerImpl implements NotificationListner {

    private SMSService smsService;

    @RabbitListener(queues = {"${app.rabbitmq.notify-pizzas-added-routingkey}"})
    @Override
    public void onNotifyPizzasToRestaurantAdded(String message) {
        log.info("Into SMSListenerImpl - onNotifyPizzasToRestaurant method.");
        smsService.sendMessagge(message);
    }
}
