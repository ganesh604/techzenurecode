package com.techzenure.day7;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalindrromeTest {
	private String input;
	private boolean expectedResult;
	
	public PalindrromeTest(String input, boolean expectedResult) {
		super();
		this.input =input;
		this.expectedResult = expectedResult;
		
	}
	//@parameters(name = "{index}] ===> testAdd({0} + {1} = {2})")
	@Parameters
	public static Collection<Object[]> generateData(){
		return Arrays.asList(new Object[][]{
			{"eye",true},
			{"java",false},
			{"malayalam",true},
			{"techzenure",false},
			{"madam",true}
			
		});	
		}
	

	@Test
	public void testCheckPalindrrome() {
		Palindrrome pa1Obj = new Palindrrome();
		boolean actual = pa1Obj.isPalindrome(input);
		assertEquals(expectedResult, actual);
		
		
	}

}