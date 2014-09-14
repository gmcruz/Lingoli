package com.lingoli.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		User user = new User();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserLongStringStringCategory() {
		
		//Arrange		
		User userObj = new User(7888, "uusername", "ppassword", new Category(1, "ccategory"));
						
		//Act
		String result = userObj.toString();
		
		//Assert				
		String expectedResult = "User Obj - id: 7888  username: uusername  password: ppassword";
		assertEquals(expectedResult, result);
		
	}

/*	@Test
	public void testGetId() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetUsername() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetUsername() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetPassword() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetPassword() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}*/

}
