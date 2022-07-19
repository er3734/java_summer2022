package OOB_1;

public class Student {
    String name;
    int age;
    String phone;

    Student(String name,int age,String phone){
        this.name=name;
        this.phone=phone;

    }

    public static void main(String[] args) {
        //Student s1=new Student();
        Student s2=new Student("john",25,"748493929");
        System.out.println(s2.name+","+s2.age+","+s2.phone);

    }
}
