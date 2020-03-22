import java.util.*;
import java.io.*;
class cake{
    private String flavour;
    
    void fun(){
        System.out.println("Asd");
    }
    cake(String fl){
        flavour=fl;
    }
    void bake(){
        System.out.println(flavour+"cake is baking");
    }
    void frost(){
        System.out.println("now cake is going for froasting");
    }
}
class weddingcake extends cake{
    weddingcake(String flac){
        super(flac);
        // System.out.println(flac);
    } 
    void totalfloor(int tot){
        System.out.println("total floor confirmed"+tot);
    }


}
class birthdaycake extends cake{
    birthdaycake(String a){
        super(a);
        // System.out.println(a);
    }
    
    void fun(){
        super.fun();
        System.out.println("sdaasdwn,");
    }
    void candles(int n){
        System.out.println("total number of candles"+n);
    }
}





class Main{
    public static void main(String[] args) {
        
       birthdaycake rahulscake=new birthdaycake("vanila");
       rahulscake.bake();
        rahulscake.fun();




    }
}