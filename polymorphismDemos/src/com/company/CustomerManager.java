package com.company;

public class CustomerManager {
    private BaseLogger logger;
    //Bu constructor newlerken çalışıyor
    public  CustomerManager(BaseLogger logger){
          this.logger=logger;
    }
    public void add(){
        System.out.println("Müteri eklendi");

        this.logger.log("Log mesajı");

    }

}
