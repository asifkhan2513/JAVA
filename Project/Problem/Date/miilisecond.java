import java.util.*;
import java.lang.*;
import java.lang.Object;
class miilisecond {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        //it will telling  since from 1jan,1970
        System.out.println(System.currentTimeMillis()+"\n");
        System.out.println("----------------------------\n");

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("----------------------------\n");
        Date d = new Date();
        System.out.println(d);
        System.out.println("----------------------------\n");
       
    }
}