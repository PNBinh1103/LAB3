
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Q1_CD {
    public class CD {

    private String CDId;
    private String CDcollection;
    private String CDtype;
    private String Title;
    private double Price;
    private int yearOfRelease;

    public CD() {

    }

    public CD(String CDId, String CDcollection, String CDtype, String Title, double Price, int yearOfRelease) {
        this.CDId = CDId;
        this.CDcollection = CDcollection;
        this.CDtype = CDtype;
        this.Title = Title;
        this.Price = Price;
        this.yearOfRelease = yearOfRelease;
    }

    public String getCDId() {
        return CDId;
    }

    public void setCDId(String CDId) {
        this.CDId = CDId;
    }

    public String getCDcollection() {
        return CDcollection;
    }

    public void setCDcollection(String CDcollection) {
        this.CDcollection = CDcollection;
    }

    public String getCDtype() {
        return CDtype;
    }

    public void setCDtype(String CDtype) {
        this.CDtype = CDtype;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("CD Id: ");
        CDId = sc.nextLine();
        System.out.print("CD collection: ");
        CDcollection = sc.nextLine();
        System.out.print("CD type: ");
        CDtype = sc.nextLine();
        System.out.print("Title: ");
        Title = sc.nextLine();
        System.out.print("Price: ");
        Price = sc.nextDouble();
        System.out.print("Year of release: ");
        yearOfRelease = sc.nextInt();
    }

    public void print() {
        System.out.println(" - CD Id: " + CDId
                + " -  CD collection: " + CDcollection
                + " - CD type: " + CDtype
                + " - Title: " + Title
                + " - Price: " + Price
                + " - Year of release: " + yearOfRelease);
    }
}

}
