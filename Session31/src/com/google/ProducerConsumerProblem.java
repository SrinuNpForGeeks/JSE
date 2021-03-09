package com.google;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {

  public static void main(String[] args) {
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    Thread producer = new Thread(

        () -> {
          int count = 1;
          while (true) {
            if (queue.size() > 5) {
              try {
                Thread.sleep(5000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            queue.add(count);
            System.out.println("[" + Thread.currentThread().getName() + "] Added => " + count);
            count++;
          }
        }

    );

    Thread consumer = new Thread(

        () -> {

          while (true) {
            if (queue.size() > 0) {
              System.out.println(
                  "[" + Thread.currentThread().getName() + "] consumed => " + queue.remove());
            }

          }
        }

    );

    producer.setName("PRODUCER THREAD");
    consumer.setName(" CONSUMER THREAD");

    producer.start();
    consumer.start();
  }
}



