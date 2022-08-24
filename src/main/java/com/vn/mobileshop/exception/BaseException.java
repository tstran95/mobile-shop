package com.vn.mobileshop.exception;

import java.util.function.Supplier;

public class BaseException extends RuntimeException{
    public BaseException(String message) {
        super(message);
    }
}
