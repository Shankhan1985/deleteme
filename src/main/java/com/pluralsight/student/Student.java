package com.pluralsight.student;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private double gpa;
    private List<String> courses;

    public Student(String name, double gpa) {
        if(isNameValid(name)){
            this.name = name;
        } else throw new IllegalArgumentException("Name is not valid");

        if(isGPAValid(gpa)){
            this.gpa = gpa;
        } else throw new IllegalArgumentException("GPA is not valid");
    }

    private static boolean isNameValid(String name){
        return name != null &&  name.length() > 0;
    }

    private static boolean isGPAValid(double gpa){
        return gpa >= 0.0 && gpa <= 5.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isNameValid(name)){
            this.name = name;
        }else throw new IllegalArgumentException("Name is not valid");
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(isGPAValid(gpa)){
            this.gpa = gpa;
        }else throw new IllegalArgumentException("GPA is not valid");

    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public boolean addCourse(String course){
        if(course != null &&  course.length() > 0){
            this.courses.add(course);
            return true;
        }else throw new IllegalArgumentException("Course is not valid");
    }

    public boolean removeCourse(String course){
        if(course != null &&  course.length() > 0){
            if(this.courses.contains(course)){
                this.courses.remove(course);
                return true;
            }else return false;
        } else throw new IllegalArgumentException("Course is not valid");
    }


    @Override
    public String toString(){
        return  "Name: " + this.getName()
                         + " | GPA: " + this.getGpa()
                         + " | Courses: " + this.getCourses();
    }
}
