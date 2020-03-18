package com.example;

import com.example.generated.Payment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {
    @KafkaListener(topics = "topic1", containerFactory = "kafkaListenerContainerFactory")
    public void listen(Payment payment) {
        System.out.println("coucou, message reçu: " + payment.toString());
    }
}
