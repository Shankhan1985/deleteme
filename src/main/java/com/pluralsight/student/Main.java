package com.pluralsight.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        execute();
    }

    static void execute(){


        //Build courses
        ArrayList<String> scientific_courses = new ArrayList<>();
        scientific_courses.add("Chemistry");
        scientific_courses.add("Mathematics");
        scientific_courses.add("Physics");

        List<String> arts_courses = new ArrayList<>();
        arts_courses.add("Arts and Crafts");
        arts_courses.add("Literature");
        arts_courses.add("Poetry");

        List<String> philosphy_courses = new ArrayList<>();
        philosphy_courses.add("History of Philosophy");
        philosphy_courses.add("Philosophy 101");
        philosphy_courses.add("The Dawn of Western Civilization");


        //Build students
        Student adam = createStudent("Adam West", 3.2, scientific_courses);
        Student bruce = createStudent("Bruce Wayne", 6.0, arts_courses);
        Student diana = createStudent("Diana Prince", 4.0, philosphy_courses);

        //Build roster
        List<Student> roster = new ArrayList<>();
        roster.add(adam);
        roster.add(bruce);
        roster.add(diana);

        printAllStudentsRoster(roster);
        printSmartStudents(3.5, roster);
    }

    static void printSmartStudents(double gpa, List<Student> roster){
        System.out.println("----------------------Printing Smart Students ------------------------");

        for (Student student : roster) {
            if(student == null){
                //do nothing
            }else if(student.getGpa() > gpa){
                printStudent(student);
            }
        }
    }


    static void printAllStudentsRoster(List<Student> roster){
        System.out.println("----------------------Printing Entire Roster ------------------------");
        for (Student student : roster) {
            printStudent(student);
        }
    }


    static void printStudent(Student student){
        /*StringBuilder courses = new StringBuilder();
        for(String course : student.getCourses()){
            courses.append(course).append(", ");
        }*/

        try{
            System.out.println(student.toString());
        }catch (Exception ignored){
                //do nothing
        }

    }

    static Student createStudent(String name, double gpa, List<String> courses){
        Student std = null;
        try {
            std = new Student(name, gpa);
            std.setCourses(courses);
            System.out.println("Student " + std.getName() + " succesfully created.");
        }catch (Exception ex){
            System.out.println(ex + " | Couldn't initialize student " + name + " | Program still running safely");
        }
        return std;
    }

}
