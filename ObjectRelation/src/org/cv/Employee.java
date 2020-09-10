package org.cv;
import java.time.LocalDate;
import java.util.*;
public class Employee{
    int employee_code,Salary;
    String employee_name,Designation;
    char dept_code;
    LocalDate birth_date;
    
    Employee(int employee_code,String employee_name,LocalDate birth_date,char dept_code,String Designation,int Salary){
        this.employee_code = employee_code;
        this.employee_name = employee_name;
        this.birth_date = birth_date;
        this.dept_code = dept_code;
        this.Designation = Designation;
        this.Salary = Salary;
    }
    
    public int getEmployee_code(){
        return this.employee_code;
    }
    public void setEmployee_code(int employee_code){
        this.employee_code = employee_code ;
    }
    
    public String getEmployee_name(){
        return this.employee_name;
    }
    public void setEmployee_name(String employee_name){
        this.employee_name = employee_name;
    }
    
    public LocalDate getBirth_date(){
        return this.birth_date;
    }
    public void setBirth_date(LocalDate birth_date){
        this.birth_date = birth_date;
    }
    
    public char getDept_code(){
        return this.dept_code;
    }
    public void setDept_code(char dept_code){
        this.dept_code = dept_code;
    }
    
    public String getDesignation(){
        return this.Designation;
    }
    public void setDesignation(String Designation){
        this.Designation = Designation;
    }
    
    public int getSalary(){
        return this.Salary;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    
    public static String wishBirthday(Employee k){
        LocalDate d = LocalDate.now(); //LocalDate date = LocalDate.of(2020, 9, 9);
        //System.out.println(d.getDayOfMonth()+" "+d.getMonth()+" "+k.getBirth_date().getDayOfMonth()+" "+k.getBirth_date().getMonth());
        if(d.getDayOfMonth()==k.getBirth_date().getDayOfMonth() && d.getMonth()==k.getBirth_date().getMonth())
        return "happy bday, "+k.getEmployee_name();
        else
        return "";
    }
}