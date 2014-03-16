package dynamic.programming;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CuttingSticksTest {

	private CuttingSticks cutting;

	@Before
	public void setUp() throws Exception {
		cutting = new CuttingSticks();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCuttingSticks() {
		int[] s = cutting.cuttingSticks(new int[]{0,1,5,8,9,10,17,17,20,24,30}, 10);
		assertArrayEquals(new int[]{0,1,2,3,2,2,6,1,2,3,10}, s);
	}

}
