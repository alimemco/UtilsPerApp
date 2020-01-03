package com.alirnp.utilsperappdemo;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.alirnp.utilsperapp.base.UtilsPerApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private Context context;


    @Before
    public void init (){
        context = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }
    @Test
    public void useAppContext() {

        context = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.alirnp.utilsperappdemo", context.getPackageName());
    }

    @Test
    public void checkContextNonNull (){
        assertNotNull(context);
    }


    @Test
    public void checkConnection (){
        boolean connected = UtilsPerApp.isConnected(context);

        assertTrue(connected);
    }
}
