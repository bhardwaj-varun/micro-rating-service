package com.vb.ratingservice.exceptions;

public class ResourceNotFoundException  extends RuntimeException{
    public ResourceNotFoundException(String s) {
        super(s);
    }
    public ResourceNotFoundException(){

    }
}
