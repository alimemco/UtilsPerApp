package com.alirnp.utilsperappdemo;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.alirnp.utilsperapp.base.UtilsPerApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ConnectionTest {

    private Context context;


    @Before
    public void init (){
        context = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }


    @Test
    public void checkConnection (){
        boolean connected = UtilsPerApp.isConnected(context);

        assertTrue(connected);
    }
}
