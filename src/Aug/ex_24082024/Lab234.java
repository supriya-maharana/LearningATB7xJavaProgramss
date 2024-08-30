package Aug.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
   Student s1=new Student(1,"Supriya");
   Student s2=new Student(2,"Pramod");
   Student s3=new Student(3,"Bapuji");
   Student s4=new Student(4,"Arpita");
   Student s5=new Student(5,"Kushal");

   List arraylist=new ArrayList();
        {
            arraylist.add(s1);
            arraylist.add(s2);
            arraylist.add(s3);
            arraylist.add(s4);
            arraylist.add(s5);
        }
        System.out.println(arraylist);
        // Collections.sort(arrayList); // Comparable
//        Collections.sort(arrayList, new SortByID());
//        Collections.sort(arrayList, new SortByName());
//        Collections.sort(arrayList, new SortByIDDesc());
        Collections.sort(arraylist, new SortByNameDesc());
        System.out.println(arraylist);


    }
}
class sortById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class sortByName implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class sortByIdDesc implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
class SortByNameDesc implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

//class Student implements Comparable<Student> {
class Student
{
    private int Id;
    private String name;

    public Student(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { //this is Object class method
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
    //    @Override
//    public int compareTo(Student another) {
//        return Integer.compare(this.id, another.id);
//    }
//
//    @Override
//    public int compareTo(Student another) {
//        return CharSequence.compare(this.name, another.name);
//    }
}
