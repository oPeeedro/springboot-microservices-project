package com.microservices.notificationservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailSender {

    public void sendEmail(String orderNumber) {
        log.info("Pedido bem sucedido - Numero do pedido: {}", orderNumber);
        log.info("Email Sent For Order Id {}", orderNumber);

    }
}
