package com.example;

import com.example.generated.Payment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {
    @KafkaListener(topics = "topic1")
    public void listenTopic1(Payment payment) {
        System.out.println("coucou, message reçu (topic1): " + payment.toString());
    }

    @KafkaListener(topics = "topic2")
    public void listenTopic2(Payment payment) {
        System.out.println("coucou, message reçu (topic2): " + payment.toString());
    }
}
