package com.aston.kafkaTestConsumer.kafka.consumer;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final KafkaService kafkaService;

    @KafkaListener(topics = "first-test-topic", groupId = "test_consumer")
    public void listen(ConsumerRecord<String, Object> consumerRecord){
        kafkaService.printMessage(consumerRecord.value().toString());
    }
}
