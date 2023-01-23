package com.kevin.fundamentosjunit

import com.cursosandroidant.auth.AuthEvent
import com.cursosandroidant.auth.userAuthenticationTDD
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

class AuthTestTDD {

@Test
fun login_completeFrom_existUser_return(){
    val isAuthenticated = userAuthenticationTDD("ant@gmail.com","1234")
    assertEquals(AuthEvent.USER_EXIST, isAuthenticated)
}

    @Test
    fun login_completeForm_notExistUser_returnFailesEvent(){
        val isAuthenticated = userAuthenticationTDD("nt@gmail.com","1234")
        assertEquals(AuthEvent.NOT_USER_EXIST, isAuthenticated)
    }

    @Test
    fun login_emptyEmail_returnsFailEvent(){
        val isAuthenticated = userAuthenticationTDD("","1234")
        assertEquals(AuthEvent.EMPTY_EMAIL, isAuthenticated)
    }

    @Test
    fun login_emptyPassword_returnFailsEvent(){
        val isAuthenticated = userAuthenticationTDD("ant@gmail.com","")
        assertEquals(AuthEvent.EMPTY_PASSWORD, isAuthenticated)
    }

    @Test
    fun login_emptyForm_returnFailEvent(){
        val isAuthenticated = userAuthenticationTDD("","")
        assertEquals(AuthEvent.EMPTY_EMAIL_PASSWORD, isAuthenticated)
    }
    @Test
    fun login_completeForm_invalidEmail_returnFailEvent(){
        val isAuthenticated = userAuthenticationTDD("ant@gmailcom","1234")
        assertEquals(AuthEvent.INVALID_EMAIL, isAuthenticated)
    }

    @Test
    fun login_completeForm_invalidPassword_returnFailEvent(){
        val isAuthenticated = userAuthenticationTDD("ant@gmail.com","124e")
        assertEquals(AuthEvent.INVALID_PASSWORD, isAuthenticated)
    }
}