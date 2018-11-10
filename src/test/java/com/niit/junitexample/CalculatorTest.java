package com.niit.junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("JUnit 5 Example")
class CalculatorTest {

	 @BeforeAll
	    static void beforeAll() {
	        System.out.println("Before all test methods");
	    }
	 
	    @BeforeEach
	    void beforeEach() {
	        System.out.println("Before each test method");
	    }
	 
	    @AfterEach
	    void afterEach() {
	        System.out.println("After each test method");
	    }
	 
	    @AfterAll
	    static void afterAll() {
	        System.out.println("After all test methods");
	    }
	
	    @Test
	    @DisplayName("First test")
	    void firstTest() {
	        System.out.println("First test method");
	    }
	 
	    @Test
	    @DisplayName("Second test")
	    void secondTest() {
	        System.out.println("Second test method");
	    }
	    
	
	    @DisplayName("Should pass a non-null message to our test method")
	    @ParameterizedTest
	    @ValueSource(strings = {"Hello", "World"})
	    void shouldPassNonNullMessageAsMethodParameter(String message) {
	        assertNotNull(message);
	    }

}
