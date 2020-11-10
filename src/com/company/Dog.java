package com.company;

public class Dog extends Animal{
    public void sound(){
        System.out.println("Bark!");
    }
    public void sound(int n){
        for(int i = 0; i < n; i++){
            System.out.print("Bark!");
        }
    }
}
