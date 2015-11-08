package com.hello.Ch11;

/**
 * Demonstrate different ways to invoke sleep.
 */
public class SleepingMain2 {
	public static final int ONE_SECOND = 1000;

	static Thread me;

	public static void main(String args[]) {
		Thread t = new Thread(); // Create a thread Thread
		me = Thread.currentThread(); // A reference to the thread
										// executing main()

		t.start(); // Start the thread

		// Sleep for a total of 3 seconds.
		try {
			Thread.sleep(ONE_SECOND);
			me.sleep(ONE_SECOND);

			t.sleep(ONE_SECOND); // This puts main to sleep - NOT t!!
		} catch (InterruptedException e) {
		}
	}

} // SleepingMain
