package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaMapTest {
	
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testPut () {
		MapADT<String, Integer> abc = new JavaMap<>();
		abc.put("a", 1);
		abc.put("b", 2);
		abc.put("c", 3);
		assertEquals(abc.size(), 3);
	}
	
	@Test
	public void testGet () {
		MapADT<String, Integer> zyx = new JavaMap<>();
		zyx.put("z", 26);
		zyx.put("y", 25);
		zyx.put("x", 24);
		assertIntEq(zyx.get("x"), 24);
	}
	
	@Test
	public void testGet2() {
		MapADT<String, Integer> zyx = new JavaMap<>();
		zyx.put("z", 26);
		zyx.put("y", 25);
		zyx.put("x", 24);
		assertEquals(zyx.get("a"), null);
	}
	
	@Test
	public void testRemove() {
		MapADT<String, Integer> zyx = new JavaMap<>();
		zyx.put("z", 26);
		zyx.put("y", 25);
		zyx.put("x", 24);
		zyx.remove("y");
		assertEquals(zyx.get("y"), null);
	}
	
	@Test
	public void testRemove2() {
		MapADT<String, Integer> letters = new JavaMap<>();
		letters.put("z", 26);
		letters.put("y", 25);
		letters.put("x", 24);
		letters.remove("y");
		assertIntEq(letters.get("z"), 26);
	}
	
	@Test
	public void testRemove3() {
		MapADT<String, Integer> removeNone = new JavaMap<>();
		removeNone.put("a", 1);
		removeNone.put("b", 2);
		removeNone.put("c", 3);
		removeNone.remove("z");
		assertEquals(removeNone.size(), 3);
	}
	
	@Test public void testGetKeys() {
		MapADT<String, Integer> keys = new JavaMap<>();
		keys.put("a", 1);
		keys.put("b", 2);
		keys.put("c", 3);
		assertEquals(keys.getKeys().size(), 3);
	}
	
	@Test public void testGetKeys2() {
		MapADT<String, Integer> keys = new JavaMap<>();
		assertEquals(keys.getKeys().size(), 0);
	}
	
	@Test public void testGetKeys3() {
		MapADT<String, Integer> keys = new JavaMap<>();
		keys.put("a", 1);
		assertEquals(keys.getKeys().size(), 1);
	}
	
	@Test public void testGetKeys4() {
		MapADT<String, Integer> keys = new JavaMap<>();
		keys.put("a", 1);
		assertEquals(keys.getKeys().getFront(), "a");
	}
}
