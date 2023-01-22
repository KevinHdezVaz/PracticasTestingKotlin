package com.kevin.fundamentosjunit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

import org.junit.Test

class AssertionUserTestTest {

    private lateinit var bot : Model
 
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
        println("After")
    }

}


    @Before
    fun setup(){
         juan = Model("16bit",10,true)
    println("Before")
    }

    //despues de cada prueba
    @After
    fun tearDown(){
         juan= Model()
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
    fun chekSameUserTest(){
        val copyjuna = juan
        assertSame(copyjuna,juan)
        println("ChcekSameUserTest")
    }

}