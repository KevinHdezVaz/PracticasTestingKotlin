package com.kevin.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionAdultTest {



    private lateinit var bot: Model
    private lateinit var juan: Model

@get:Rule val locationesRule = LocationES_Rule()

    @Before
    fun setup(){
        bot = Model("1botit",11,false)
        juan = Model("16bit",20,true)

        println("Before")
    }

    @After
    fun tearDown(){
        juan= Model()
        bot= Model()
        println("After")
    }


    @Test
    fun isAdult() {

        assertEquals(true,locationesRule.assetion?.isAdult(juan))
        assertEquals(true,locationesRule.assetion?.isAdult(bot))

        /*
        val assertion = Assertion()
        assertion.setlocation("Mexico")
        assertTrue(assertion.isAdult(bot))
        assertTrue(assertion.isAdult(juan)) */
    }
}