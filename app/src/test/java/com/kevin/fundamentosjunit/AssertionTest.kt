package com.kevin.fundamentosjunit

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionTest{


    @Test
    fun getArrayTest()
    {
        val assertions = Assertion()
        val array = arrayOf(23,32) //valor esperado
        assertArrayEquals("Mensaje de error",array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertion = Assertion()
        val name = "Kevin"
        val otherName = "Fede"
        assertEquals(name, assertion.getName())
        //assertEquals(otherName, assertion.getName())
    }

    @Test
    fun checkHumans(user: Model? = null) : Boolean?{
        if(user == null ) return null
        return user.isHuman
    }

    @Test
    fun checkNull(){

        val user = null
        assertNull(user)
        val assertion = Assertion()
        assertNull(assertion.checkHuman(user ))
    }

    @Test
    fun checkNotNull(){
        val juan = Model("KEVIN", 23, true)

        val assertion = Assertion()
        assertNotNull(assertion.checkHuman(juan))
    }

    @Test(timeout = 1000)
    fun getCitiesTest(){

        val cities = arrayOf("MExico","Peru","Argentina")
        Thread.sleep(Random.nextLong(950,1_050))
        assertEquals(3, cities.size)

       }
}