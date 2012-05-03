package org.ymini.mayooran.modelClasses;

import java.util.HashMap;

public class ClassRoom {
    
    String grade;
    private static HashMap <String,Student> students = new HashMap();

    public ClassRoom() { 
	
       	students.put("Mayooran",new Student("Mayooran","A","Somasundaram","Velanai"));
        students.put("Thenuzan",new Student("Thenuzan","B","Sriskanathan","Jaffna"));
        students.put("Nilashan",new Student("Nilashan","C","Namasivayam","Vavuniya"));
        students.put("Lukshica",new Student("Lukshica","D","Dhayaparan","Moolai"));
        students.put("Vanaja",new Student("Vanaja","A","Kirushnathasan","Punlaalaikadduvan"));
        students.put("Niroshan",new Student("Niroshan","B","Sepastiyampillai","Chundukkuli"));
        students.put("Keerthika",new Student("Keerthika","A","Mahendralingam","Kopay")); 
    }

    public ClassRoom(String grade) {
        this.grade = grade;
    }
    
    public Student getDetails(String name){
        Student mystudent=students.get(name);
        return mystudent;
        
    }
    
    
        
}
