package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
<<<<<<< HEAD
		DefaultRhymer rhymer = new DefaultRhymer();
=======
		DefafultRhymer rhymer = new DefafultRhymer();
>>>>>>> 8133106 (3.1 Changed names of the classes)
		int testValue = 4;
		rhymer.increaseCount(testValue);

		int result = rhymer.checkRhymers();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
<<<<<<< HEAD
		DefaultRhymer rhymer = new DefaultRhymer();
=======
		DefafultRhymer rhymer = new DefafultRhymer();
>>>>>>> 8133106 (3.1 Changed names of the classes)
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.increaseCount(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
<<<<<<< HEAD
		DefaultRhymer rhymer = new DefaultRhymer();
=======
		DefafultRhymer rhymer = new DefafultRhymer();
>>>>>>> 8133106 (3.1 Changed names of the classes)
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.increaseCount(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
<<<<<<< HEAD
		DefaultRhymer rhymer = new DefaultRhymer();
=======
		DefafultRhymer rhymer = new DefafultRhymer();
>>>>>>> 8133106 (3.1 Changed names of the classes)
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.checkRhymers();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.increaseCount(testValue);

		result = rhymer.checkRhymers();
		Assert.assertEquals(testValue, result);
		result = rhymer.checkRhymers();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
<<<<<<< HEAD
		DefaultRhymer rhymer = new DefaultRhymer();
=======
		DefafultRhymer rhymer = new DefafultRhymer();
>>>>>>> 8133106 (3.1 Changed names of the classes)
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.decreaseCount();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.increaseCount(testValue);

		result = rhymer.decreaseCount();
		Assert.assertEquals(testValue, result);
		result = rhymer.decreaseCount();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
