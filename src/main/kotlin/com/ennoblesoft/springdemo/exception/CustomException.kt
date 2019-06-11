package com.ennoblesoft.springdemo.exception

class CustomException(
        var errorMessage: String? = null,
        var page: String? = null
) : Exception()
