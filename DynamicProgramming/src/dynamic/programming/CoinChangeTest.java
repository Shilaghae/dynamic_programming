package dynamic.programming;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoinChangeTest {

	private CoinChange coinChange;

	@Before
	public void setUp() throws Exception {
		coinChange = new CoinChange();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCoinChange_1() {
		int f = coinChange.findCombinationsCount(11, new int[]{1,5,10,25,50});
		assertEquals("Wrong combination!", 4, f);
	}
	@Test
	public void testCoinChange_2() {
		int f = coinChange.findCombinationsCount(26, new int[]{1,5,10,25,50});
		assertEquals("Wrong combination!", 13, f);
	}
	@Test
	public void testCoinChange_3() {
		int f = coinChange.findCombinationsCount(7489, new int[]{1,5,10,25,50});
		assertEquals("Wrong combination!", 2146113925, f);
	}

}
