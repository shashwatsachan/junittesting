package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAdd {
	@Test
	public void test() {
		jUnitTestfunctions junit = new jUnitTestfunctions();
		int result = junit.addnumbers(100, 200);
		assertEquals (300, result); 
	}
}
