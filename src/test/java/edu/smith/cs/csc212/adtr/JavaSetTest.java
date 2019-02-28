package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testInsert() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		assertEquals(abc.size(), 3);
	}
	
	@Test
	public void testInsertRepeated() {
		SetADT<String> repeated = new JavaSet<>();
		repeated.insert("a");
		repeated.insert("a");
		repeated.insert("a");
		assertEquals(repeated.size(), 1);
	}
	
	@Test
	public void testContains () {
		SetADT<String> has = new JavaSet<>();
		has.insert("a");
		has.insert("b");
		has.insert("c");
		assertEquals(has.contains("a"), true);
	}
	
	@Test
	public void testDoesNotContain() {
		SetADT<String> doesntContain = new JavaSet<>();
		doesntContain.insert("a");
		doesntContain.insert("b");
		doesntContain.insert("c");
		assertEquals(doesntContain.contains("d"), false);
	}
	
	@Test
	public void testRemove() {
		SetADT<String> zyx = new JavaSet<>();
		zyx.insert("z");
		zyx.insert("y");
		zyx.insert("x");
		zyx.remove("y");
		assertEquals(zyx.contains("y"), false);
	}
	
	@Test
	public void testRemove2() {
		SetADT<String> letters = new JavaSet<>();
		letters.insert("z");
		letters.insert("y");
		letters.insert("x");
		letters.remove("y");
		assertEquals(letters.contains("z"), true);
	}
	
	@Test
	public void testRemove3() {
		SetADT<String> removeNone = new JavaSet<>();
		removeNone.insert("a");
		removeNone.insert("b");
		removeNone.insert("c");
		removeNone.remove("z");
		assertEquals(removeNone.size(), 3);
	}
	
	@Test public void testToList() {
		SetADT<String> list = new JavaSet<>();
		list.insert("a");
		list.insert("b");
		list.insert("c");
		assertEquals(list.toList().size(), 3);
	}
	
	@Test public void testToList2() {
		SetADT<String> list = new JavaSet<>();
		assertEquals(list.toList().size(), 0);
	}
	
	@Test public void testToList3() {
		SetADT<String> list = new JavaSet<>();
		list.insert("a");
		assertEquals(list.toList().size(), 1);
	}
	
	@Test public void testToList4() {
		SetADT<String> list = new JavaSet<>();
		list.insert("a");
		assertEquals(list.toList().getFront(), "a");
	}
	
	@Test public void testToJava() {
		SetADT<String> javalist = new JavaSet<>();
		javalist.insert("a");
		javalist.insert("b");
		javalist.insert("c");
		assertEquals(javalist.toJava().size(), 3);
	}
	
	@Test public void testToJava2() {
		SetADT<String> javalist = new JavaSet<>();
		assertEquals(javalist.toJava().size(), 0);
	}
	
	@Test public void testToJava3() {
		SetADT<String> javalist = new JavaSet<>();
		javalist.insert("a");
		assertEquals(javalist.toJava().size(), 1);
	}
	
	@Test public void testToJava4() {
		SetADT<String> javalist = new JavaSet<>();
		javalist.insert("a");
		assertEquals(javalist.toJava().contains("a"), true);
	}
}

