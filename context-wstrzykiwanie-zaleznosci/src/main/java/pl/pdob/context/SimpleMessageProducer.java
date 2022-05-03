package pl.pdob.context;

class SimpleMessageProducer {
    String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
