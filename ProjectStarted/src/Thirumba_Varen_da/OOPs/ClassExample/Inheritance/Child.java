package Thirumba_Varen_da.OOPs.ClassExample.Inheritance;

public class Child extends Dad{
    int childmoney = 20;
    Child(int a){
        System.out.println("Inside Child "+a);
    }
    void childproperty(){
        System.out.println("This is child property");
        System.out.println("new data");
    }
}
