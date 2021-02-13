package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class _Exm_2_AnimalFactory {
    public _Exm_2_Animal getInstance(String s){
        if (s.equals("Horse")){
            return new _Exm_2_Horse();
        }else if(s.equals("Cow")){
            return  new _Exm_2_Cow();
        }else{
            return new _Exm_2_Lion();
        }
    }
}
