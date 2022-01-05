package io.github.artemptushkin.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerIncrementalTask implements Runnable {
	private AtomicInteger value;

	IntegerIncrementalTask() {
	}

	IntegerIncrementalTask(AtomicInteger value) {
		this.value = value;
	}

	AtomicInteger getValue() {
		return value;
	}

	void setValue(AtomicInteger value) {
		this.value = value;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I'm the thread [" + Thread.currentThread().getName() + "], incrementing to: " + value.incrementAndGet());
		}
	}
}
