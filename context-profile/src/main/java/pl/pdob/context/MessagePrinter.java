package pl.pdob.context;

import org.springframework.stereotype.Service;
import pl.pdob.context.producer.MessageProducer;

@Service
public class MessagePrinter {

    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
