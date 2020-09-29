package com.company;

public class DatabaseLogger extends BaseLogger {
    //Overroading üzerine yazma
    public void log(String message){
        System.out.println("Logged database: "+message);
    }
}
