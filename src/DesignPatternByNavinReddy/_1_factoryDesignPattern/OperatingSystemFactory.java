package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class OperatingSystemFactory {
    public OS getInstance(String str) {
       if (str.equals("Open")){
           return new Android();
       }else{
           return  new WIndows();
       }
    }
}