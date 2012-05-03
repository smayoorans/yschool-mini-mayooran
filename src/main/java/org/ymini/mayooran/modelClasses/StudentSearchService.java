package org.ymini.mayooran.modelClasses;

import java.util.HashMap;

public class StudentSearchService {
    
    private static HashMap <String,ClassRoom>classRooms = new HashMap(); 
    
    
    public StudentSearchService() {          
      
      ClassRoom myRooms=new ClassRoom();       
      classRooms.put("A",new ClassRoom("A"));
      classRooms.put("B",new ClassRoom("B"));
      classRooms.put("C",new ClassRoom("C"));
      classRooms.put("D",new ClassRoom("D"));
    }
    
    
    public Student findStudent(String name,String grade){
        //find the class room first;
       // ClassRoom myClass=new ClassRoom();
        ClassRoom myClass=null;
        Student myStudent=null;
        
        myClass =((ClassRoom)classRooms.get(grade));
        
        if(myClass==null)
        {
            return null;
        }
        else{            
        //find the student then
            myStudent=((Student)myClass.getDetails(name));
        }
        
        return myStudent;
        
    }
        
        
        
       
    
}
