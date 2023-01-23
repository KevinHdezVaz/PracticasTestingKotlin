package com.kevin.fundamentosjunit

class Assertion {

    private val user = Model("Kevin",32)
    private var location = "US"

    fun setlocation(location : String){
        this.location = location
    }

    fun getLuckyNumbers():Array<Int>{
    return arrayOf(23,32)
    }

    fun getName():String{
        return user.name
    }

    fun checkHuman(user: Model):Boolean{
            return user.isHuman
    }
    fun checkHuman(user: Model?= null):Boolean?{
            return user?.isHuman
        if (user == null) {
            return null
        }
        return user.isHuman
    }
    fun isAdult(user:Model): Boolean{
        if(!user.isHuman) return true

        return if (location == "US") user.age >= 21
        else user.age >= 18
    }

}