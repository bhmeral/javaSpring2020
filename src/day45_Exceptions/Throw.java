package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Throw {
    public static void main(String[] args) throws Exception {
       NoSuchElementException obj = new NoSuchElementException();

       // throw new NoSuchElementException();

        /*
        boolean breakTime = true;
        if(breakTime){
            throw new RuntimeException("It's break time, we should take break");

        }
         */

       // throw  new IOException();

        int [] arr = {5,4,3};
        //System.out.println(arr[100]);
        //System.out.println(9/0);

       // throw new RuntimeException();\
        try{
            throw new RuntimeException();
        }catch (Exception e){}


    }
}
