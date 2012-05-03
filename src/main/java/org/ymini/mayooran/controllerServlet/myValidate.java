package org.ymini.mayooran.controllerServlet;

public class myValidate {
    
    public boolean checkIsempty(String studentname, String grade){
        if("".equals(studentname.trim()) || studentname==null){
            return false;
        }
        return true;
    }
}
