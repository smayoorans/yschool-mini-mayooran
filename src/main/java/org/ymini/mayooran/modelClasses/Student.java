package org.ymini.mayooran.modelClasses;

public class Student {

    private String studentname;
    private String grade;
    private String parentname;
    private String address;

    public Student() {
	
		
        
    }

    public Student(String studentname, String grade, String parentname, String address) {
        this.studentname = studentname;
        this.grade = grade;
        this.parentname = parentname;
        this.address = address;
       
    } 
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    
    
}
