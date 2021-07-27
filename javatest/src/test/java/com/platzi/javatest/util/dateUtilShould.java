package com.platzi.javatest.util;

import org.junit.Test;
import static org.junit.Assert.*;

/*      -Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
        -Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
        -Todos los años divisibles por 4 son bisiestos (1996, 2004, 2012)
        -Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)*/

public class dateUtilShould {

    @Test
    public void return_True_when_year_divise_400(){
        assertTrue(dateUtil.isLeapYear(1600));
        assertTrue(dateUtil.isLeapYear(2000));
        assertTrue(dateUtil.isLeapYear(2400));
    }

    @Test
    public void return_false_when_year_divise_100_but_not_400(){
        assertFalse(dateUtil.isLeapYear(1700));
        assertFalse(dateUtil.isLeapYear(1800));
        assertFalse(dateUtil.isLeapYear(1900));
    }


    @Test
    public void return_True_when_year_divise_4_but_not_100(){
        assertTrue(dateUtil.isLeapYear(1996));
        assertTrue(dateUtil.isLeapYear(2004));
        assertTrue(dateUtil.isLeapYear(2008));
    }

    @Test
    public void return_False_when_year_not_divise_4(){
        assertFalse(dateUtil.isLeapYear(2017));
        assertFalse(dateUtil.isLeapYear(2018));
        assertFalse(dateUtil.isLeapYear(2019));
    }


}