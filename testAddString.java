package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitTestfunctions junitstring = new jUnitTestfunctions();
		String result = junitstring.addstring("Capstone", "Project");
		assertEquals ("CapstoneProject", result); 
	}

}
