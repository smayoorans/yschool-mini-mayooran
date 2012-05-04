package org.ymini.mayooran.modelClasses;
import java.util.ArrayList;

public class StudentSearchService {
    
    private static ArrayList <Student> students = new ArrayList();
    
    public StudentSearchService() {               
        
	Student s1=new Student("Mayooran","1","Somasundaram","Velanai");
        Student s2=new Student("Thenuzan","12","Sriskanathan","Jaffna");
        Student s3=new Student("Nilashan","2","Namasivayam","Vavuniya");
        Student s4=new Student("Lukshica","3","Dhayaparan","Moolai");
        Student s5=new Student("Vanaja","8","Kirushnathasan","Punlaalaikadduvan");
        Student s6=new Student("Niroshan","5","Sepastiyampillai","Chundukkuli");
        Student s7=new Student("Keerthika","6","Mahendralingam","Kopay");
        Student s8=new Student("Vijay","9","Gnanes","Point Pedro");
        Student s9=new Student("Tharo","12","Thaya","Sunnagam");
        Student s10=new Student("Ramanan","13","Velummylum","Achchuvely");
        Student s11=new Student("Kirishanthan","6","Kaneshamoorthy","Idaikkadu");
        Student s12=new Student("Logan","5","Ramachnthiran","Mullaitheevu");
        Student s13=new Student("Sukir","2","Sivasakthy","Neervely");
        Student s14=new Student("Meera","1","Velauthppilai","Alaveddy");
        Student s15=new Student("Manivasagan","9","Manokaran","Chavekachchery");
        
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
                students.add(s8);
                students.add(s9);
                students.add(s10);
                students.add(s11);
                students.add(s12);
                students.add(s13);
                students.add(s14);
                students.add(s15);
                
      
    }
    
	public Student findStudent(String name,String grade){
      
	Student s=null;
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getStudentname().equals(name) && students.get(i).getGrade().equals(grade)){				
			s=students.get(i);
	}
			
        }
        return s;
        
    }
       
    
}
