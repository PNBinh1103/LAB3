
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Q2_PartTimeEmployee {
    public class PartTimeEmployee extends Employee {

    private int workingHour;
    private float payRate;

    public PartTimeEmployee(){
        
    }
    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Working hour: ");
        workingHour = sc.nextInt();
        System.out.print("Pay rate: ");
        payRate = sc.nextFloat();
    }

    @Override
    public float getPayment() {
        return getWorkingHour()* getPayRate();
    }

    @Override
    public String getInfo() {
        return " - Employee ID: " + employeeID
                + " - Employee name: " + employeeName
                + " - Year of birth: " + yearOfBirth
                + " - Address: " + address
                + " - Phone: " + phone
                + " - Working hour: " + workingHour
                + " - Pay rate: " + payRate;

    }
}
}
