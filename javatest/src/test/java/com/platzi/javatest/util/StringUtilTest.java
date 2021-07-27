package com.platzi.javatest.util;

/*import static org.junit.Assert.*;*/

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public  void testRepeat_once() {
     Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }

    @Test
    public  void testRepeat_multi() {
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
    }
    @Test
    public  void testRepeat_zero() {
        Assert.assertEquals("",StringUtil.repeat("hola",0));
    }
    @Test(expected =  IllegalArgumentException.class)
    public  void testRepeat_negative() {
        Assert.assertEquals("hola",StringUtil.repeat("hola",-1));
    }



    }
