package com.wirpro.multi_threads;

class Consumer implements Runnable {
    private final Operations buffer;
 
    public Consumer(Operations buffer) {
        this.buffer = buffer;
    }
 
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
     //Consumer: This is a thread or process that takes data from the buffer and processes it.
                buffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

