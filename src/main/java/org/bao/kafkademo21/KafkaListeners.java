package org.bao.kafkademo21;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "topic1", groupId = "group1")
    void listen(String data) {
        System.out.println("Received: " + data);
    }
}
