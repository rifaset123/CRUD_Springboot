package com.xtramile.exception;

public class StudentNotFoundException extends  RuntimeException{
    public StudentNotFoundException(String msg){
        super(msg);
    }
}
