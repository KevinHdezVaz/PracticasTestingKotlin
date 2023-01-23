package com.kevin.fundamentosjunit

enum class AuthEvent {

    //success
    USER_EXIST,

    //failed
    NOT_USER_EXIST,

    //vacio
    EMPTY_EMAIL,
    EMPTY_PASSWORD,
    EMPTY_EMAIL_PASSWORD,
    INVALID_EMAIL,
    INVALID_PASSWORD
}