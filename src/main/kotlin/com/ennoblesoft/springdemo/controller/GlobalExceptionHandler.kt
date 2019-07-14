package com.ennoblesoft.springdemo.controller

import com.ennoblesoft.springdemo.exception.CustomException
import com.ennoblesoft.springdemo.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(CustomException::class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    fun showCustomException(ex: CustomException): ErrorResponse {
        return ErrorResponse(ex.errorMessage)
    }
}
