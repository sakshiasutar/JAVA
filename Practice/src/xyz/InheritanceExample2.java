package xyz;

//Base or Super Class
class Employee{
	int salary = 160000;
}

//Inherited or Sub Class
class Engineer extends Employee{
	int benefits = 1000;
}

public class InheritanceExample2 {
    public static void main(String[] args) {
    	Engineer e1 = new Engineer();
    	System.out.println("Salary : " + e1.salary + "\nBenefits : " + e1.benefits);
    }
}
