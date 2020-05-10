package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		//fail("Not yet implemented");
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addStrings("mrinalini","bansal");
		assertEquals ("mrinalinibansal",result);
	}

}
