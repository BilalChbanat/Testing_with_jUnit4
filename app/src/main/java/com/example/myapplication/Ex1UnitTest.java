package com.example.myapplication;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

public class Ex1UnitTest {
    @Before
    public void setUp() throws Exception{
        System.out.println("Before");
    }
    @After
    public void tearDown () throws Exception{
        System.out.println("After");
    }
    @Test
    public void equalString() {
        System.out.println("Je developpeur Mobile");
        String str1="Je developpeurMobile";
        assertEquals("Je developpeurMobile", str1);
    }
}