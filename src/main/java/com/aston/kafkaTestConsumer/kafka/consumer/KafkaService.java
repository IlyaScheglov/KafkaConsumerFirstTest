package com.aston.kafkaTestConsumer.kafka.consumer;

import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    public void printMessage(String message){
        System.out.println("Сообщение: " + message);
    }
}
