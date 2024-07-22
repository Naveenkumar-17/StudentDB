package com.Crud.Sudentapp;

public class Student {
     private int rollno;
     private String name;
     private int age;
     private float marks;
     
     public int getRoll() {
    	 return rollno;
     }
     public void setRoll(int r) {
    	 this.rollno=r;
     }
     public String getName() {
    	 return name;
     }
     public void setName(String n) {
    	 this.name=n;
     }
     public int getAge() {
    	 return age;
     }
     public void setAge(int a) {
    	 this.age=a;
     }
     public float getMarks() {
    	 return marks;
     }
     public void setMarks(float m) {
    	 this.marks=m;
     }
     @Override
    public String toString(){
    	 return "Rollno:"+this.rollno+" "+"Name:"+this.name+" "+"Age"+this.age+" "+" "+"Marks:"+" "+this.marks;
     }
}
