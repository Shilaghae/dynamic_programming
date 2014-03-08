package dynamic.programming;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonSubstringTest {

	private LongestCommonSubstring lcs;

	@Before
	public void setUp() throws Exception {
		lcs = new LongestCommonSubstring();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int max = lcs.lcs(new char[]{'k','n','u','t','h'}, new char[]{'d','j','k','s', 't', 'r', 'a'});
		assertEquals(2, max);
	}
	@Test
	public void test2() {
		int max = lcs.lcs(new char[]{'a','b','c','d'}, new char[]{'a','c','d','b'});
		assertEquals(3, max);
	}

}
