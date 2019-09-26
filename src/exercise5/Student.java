package exercise5;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

class StudentSort implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        int agecompare=Integer.compare(s1.getAge(),s2.getAge());
        int namecompare=s1.getName().compareToIgnoreCase(s2.getName());
        int idcompare=Integer.compare(s1.getAge(),s2.getAge());
        if(agecompare!=0){
            return agecompare;
        }
        else if(namecompare!=0){
            return namecompare;
        }
        else return idcompare;

    }


}


class Maintest {
    public static void main(String[] args) {
        Student s1=new Student(1,"Pankaj",23);
        Student s2=new Student(2,"Shikhar",24);
        Student s3=new Student(3,"Arun",27);
        Student s4=new Student(4,"Ayush",20);
        Student s5=new Student(5,"Dileep",23);
        Student s6=new Student(6,"Aman",23);
        Student s7=new Student(7,"Aman",23);

        List<Student> list=new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);

        System.out.println("List before sorting : ");
        for(Student l: list){
            System.out.println(l.toString());
        }
        System.out.println();


        StudentSort stusort=new StudentSort();
        Collections.sort(list,stusort);
        Collections.reverse(list);

        System.out.println("List after sorting : ");
        for(Student l: list){
            System.out.println(l.toString());
        }

    }
}

