package com.hello.Ch11;

/**
 * A thread safe queue class.
 */

public class SyncQueueClass {
	// Instance variables go here

	public void enqueue(Object item) {
		synchronized (SyncQueueClass.class) {
			// Code to enqueue goes here
		}
	}

	public Object dequeue() {
		synchronized (SyncQueueClass.class) {
			// Code to dequeue goes here
		}
		return null;
	}

} // SyncQueueClass
