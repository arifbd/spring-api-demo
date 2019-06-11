package com.ennoblesoft.demo.exception;

public class CustomException extends Exception {

    private String message;
    private String page;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public CustomException(String message, String page) {
        super(message);
        this.message = message;
        this.page = page;
    }

    public CustomException() {
        super();
    }

    public String getErrorMessage() {
        return message;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
