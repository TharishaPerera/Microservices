package com.example.suppliermicroservice;

public class RecordNotFoundException extends Exception{
    public RecordNotFoundException(String msg){
        super(msg);
    }
}
