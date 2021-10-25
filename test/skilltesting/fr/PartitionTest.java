package skilltesting.fr;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import skilltesting.fr.Partition;

public class PartitionTest {
	List<Integer> numbers;
	List<Integer> numbers1;
	@Before
	public void setUp() throws Exception {
		numbers = Arrays.asList(1, 2, 3, 4, 5);

	}

	@After
	public void setDown() throws Exception {
		numbers = null;
	}

	@Test
	public void testSubArrayOfOneElement() {
		assertTrue(Partition.ofSize(numbers, 1).size() == 5);
	}

	@Test
	public void testSubArrayOfTwoElements() {
		assertTrue(Partition.ofSize(numbers, 2).size() == 3);
	}

	@Test
	public void testSubArrayOfThreeElements() {
		assertTrue(Partition.ofSize(numbers, 3).size() ==2);
	}






}
