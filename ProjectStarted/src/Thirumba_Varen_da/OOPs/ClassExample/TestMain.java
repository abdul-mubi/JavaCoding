package Thirumba_Varen_da.OOPs.ClassExample;

public class TestMain {
    public static void main(String[] args){
        Student obj1 = new Student("Abdul", 1996);
        System.out.println(obj1.yob);
        System.out.println(obj1.name);
        System.out.println(obj1.check());
        obj1.yob = 1996;
        obj1.name = "Abdul";
        System.out.println(obj1.yob);
        System.out.println(obj1.name);
        System.out.println(obj1.check());

        Student obj2 = new Student();
        System.out.println(obj2.yob);
        System.out.println(obj2.name);
        System.out.println(obj2.check());


        Student obj3 = new Student(obj1);
        System.out.println(obj3.name);
        System.out.println(obj3.yob);
    }
}
