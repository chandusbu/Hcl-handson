package org.cv;

import java.util.*;
import java.time.LocalDate;
public class Main14
{
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   Employee[] e = new Employee[5];
	   for(int i=0;i<5;i++){
	       e[i] = getEmpData();
	   }
       checkBirthday(e);
	}
	public static Employee getEmpData(){
	    int employee_code,Salary;
       String employee_name,Designation;
       char dept_code;
       LocalDate birth_date;
       
       Employee emp;
       
      // for(int i=0; i<5; i++){
           
           String input = sc.nextLine();
           String[] inputArr = input.split(", ");
           employee_code=Integer.parseInt(inputArr[0]);employee_name=inputArr[1];birth_date=LocalDate.parse(inputArr[2]);
           dept_code=inputArr[3].charAt(0);
           Designation=inputArr[4];
           Salary=Integer.parseInt(inputArr[5]);
           
           emp = new Employee(employee_code,employee_name,birth_date,dept_code,Designation,Salary);
        //}
        
        return emp;
	}
	
	public static void checkBirthday(Employee[] em){
	    
	    for(int i=0;i<5;i++){
	        //System.out.println(em[i].getEmployee_code());
	         System.out.println(Employee.wishBirthday(em[i]));
	       // System.out.println("a");
	    }
	}
}

