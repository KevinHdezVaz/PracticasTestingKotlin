package com.kevin.fundamentosjunit

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class LocationES_Rule :TestRule{
    var assetion: Assertion?= null


    override fun apply(base: Statement, description: Description): Statement {

        return object: Statement(){
            override fun evaluate() {
                assetion = Assertion()
                assetion?.setlocation("ES")
                try {
                    base.evaluate()
                } finally {
                    assetion = null
                }
            }
        }

    }


}