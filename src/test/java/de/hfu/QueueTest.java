package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class QueueTest {

	@Test
    public void test()
    {
		Queue myQ = new Queue(3);
		try {
			myQ.dequeue();			
		} catch (Exception e) {
			assertNotEquals(e.getMessage(), "");
		}
		myQ.enqueue(0);
		assertEquals(0, myQ.dequeue());
		myQ.enqueue(1);
		assertEquals(1, myQ.dequeue());
		myQ.enqueue(2);
		myQ.enqueue(3);
		myQ.enqueue(4);
		myQ.enqueue(5);
		myQ.enqueue(6);
		assertEquals(2, myQ.dequeue());
		assertEquals(3, myQ.dequeue());
		assertEquals(6, myQ.dequeue());
    }

}
