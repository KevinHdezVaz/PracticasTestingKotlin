package com.kevin.fundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

import org.junit.Test

class AssertionUserTestTest {


    private lateinit var bot: Model

  companion object{
    private lateinit var juan: Model


    @BeforeClass @JvmStatic
    fun setupCommon(){
        juan = Model("16bit",10,true)
        println("Before")
    }

    //despues de cada prueba
    @AfterClass @JvmStatic
    fun tearDownCommon (){
        juan= Model()
        println("AfterClass")
    }

}


    @Before
    fun setup(){
         bot = Model("16bit",10,false)
    println("Before")
    }

    //despues de cada prueba
    @After
    fun tearDown(){
         bot= Model()
        println("After")
    }

    @Test
    fun checkHumansTest( ) {

        val assertion  = Assertion()
        assertFalse(assertion.checkHuman(bot))
        assertTrue(assertion.checkHuman(juan))
        println("CheckHumanTest")
    }
    @Test
    fun checkNotNull(){

        assertNotNull(juan)
        println("CheckNotNull")
    }
    @Test
    fun chekNotSameUserTest(){

        assertNotSame(bot,juan)
        println("ChcekNOTSameUserTest")
    }
    @Test
    fun chekSameUserTest(){
        val copyjuna = juan
        assertSame(copyjuna,juan)
        println("ChcekSameUserTest")
    }

}