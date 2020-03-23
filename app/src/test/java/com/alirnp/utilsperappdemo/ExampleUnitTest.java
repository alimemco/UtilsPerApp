package com.alirnp.utilsperappdemo;

import com.alirnp.utilsperapp.base.UtilsPerApp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void isInteger(){
        String txt = "123456484";
          assertTrue(UtilsPerApp.isInteger(txt));


    }



}
