package com.company;

public class Main {

    public static void main(String[] args) {
//	  BaseLogger[] baseLoggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//	  for(BaseLogger logger:baseLoggers){
//	      logger.Log("Log mesajı");
//      }

        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.add();


    }
}
