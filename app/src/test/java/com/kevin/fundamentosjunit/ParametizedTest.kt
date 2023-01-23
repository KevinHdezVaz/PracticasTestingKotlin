package com.kevin.fundamentosjunit

import com.kevin.fundamentosjunit.ParametizedTest.Companion.assertion
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.Runnable
import org.junit.After
import org.junit.AfterClass
import org.junit.Assert
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParametizedTest(var currentValue: Boolean, var currentUser: Model) {

     @get:Rule
    val locationesRule = LocationES_Rule()

    companion object{


var assertion : Assertion? = null
      @BeforeClass @JvmStatic
        fun setupCommon(){
        assertion = Assertion()
      }

      @AfterClass @JvmStatic
      fun tearCommon(){
          assertion = null
      }


        @Parameterized.Parameters @JvmStatic
        fun getUsersUS() = arrayOf(
            arrayOf(false,Model("Pedro",12)),
                 arrayOf(true,  Model("Clara",21))   ,
                     arrayOf(true,  Model("conchi",33)),
                         arrayOf(true,  Model("kevin",4, false)),
                             arrayOf(true,  Model("adi",22)))



        fun getUsersES() = arrayOf(
            arrayOf(false,Model("Pedro",19)),
            arrayOf(false,  Model("Clara",14))   ,
            arrayOf(true,  Model("conchi",4)),
            arrayOf(true,  Model("kevin",4, false)),
            arrayOf(true,  Model("adi",18)))


    }
    @Test
    fun isAdult() {


        //assertEquals(currentValue, assertion?.isAdult(currentUser) )
    assertEquals(currentValue, locationesRule.assetion?.isAdult(currentUser))

    }
    }





