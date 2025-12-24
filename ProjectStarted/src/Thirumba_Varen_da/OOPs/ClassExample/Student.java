package Thirumba_Varen_da.OOPs.ClassExample;

public class Student{
    String name;
    int yob;

    public int check(){
        return yob;
    }

    Student(String var1, int var2){
        name = var1;
        yob = var2;
    }

    Student(){

    }

    Student(Student s1){
        name = s1.name;
        yob = s1.yob;
    }
}








