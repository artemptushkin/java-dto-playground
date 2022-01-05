package io.github.artemptushkin.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.SneakyThrows;

public class ConcurrencyApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("We have " + Runtime.getRuntime().availableProcessors() + " cores");
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		AtomicInteger value = new AtomicInteger(0);

		for (int i = 0; i < Runtime.getRuntime().availableProcessors() * 2; i++) {
			executorService.submit(new Runnable() {
				@Override
				@SneakyThrows
				public void run() {
					Thread.sleep(200);
					value.incrementAndGet();
					System.out.println("I'm the thread[" + Thread.currentThread().getName() + "]. I woke up");
				}
			});
		}
		Thread.sleep(2000);
		System.out.println("We received " + value.get());
		executorService.shutdown();
	}

	public static void main1(String[] args) {
		AtomicInteger value = new AtomicInteger(0);
		IntegerIncrementalTask task = new IntegerIncrementalTask();
		task.setValue(value);

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		Thread thread3 = new Thread(task);
		Thread thread4 = new Thread(task);
		Thread thread5 = new Thread(task);

		System.out.println("Let's start thread1 from the thread [" + Thread.currentThread().getName() + "]");
		thread1.start();
		System.out.println("Let's start thread2 from the thread [" + Thread.currentThread().getName() + "]");
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
