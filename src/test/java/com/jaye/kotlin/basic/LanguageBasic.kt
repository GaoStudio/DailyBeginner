package com.jaye.kotlin.basic

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import com.jaye.kotlin.basic.what
@RunWith(JUnit4::class)
class LanguageBasic{
    @Test
    fun testWaht(){
        what();
    }
    @Test
    fun testIfelse(){
        ifelse();
    }
    @Test
    fun testOperator(){
        val  p = Point(1,1);
        val np = -p;
        println(np);
    }

}