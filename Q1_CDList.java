
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Q1_CDList {
    public class CDList {

    ArrayList<Q1_CD> CDs = new ArrayList<>();

    public CDList() {

    }

    public void displayAllCDs() {
        for (int i = 0; i < CDs.size(); i++) {
            CDs.get(i).print();
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of CDs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Q1_CD cd = new Q1_CD();
            cd.input();
            CDs.add(cd);
        }
    }

    public void searchTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD title: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getTitle().equalsIgnoreCase(n)) {
                CDs.get(i).print();
                break;
            }
        }
    }

    public void searchCollection() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the collection: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDcollection().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void searchType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDtype().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void deleteId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.remove(i);
            }
        }
    }

    public void editInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.get(i).input();
                CDs.get(i).setCDId(n);
            }
        }
    }

    public void sort() {
        Comparator<Q1_CD> com = new Comparator<Q1_CD>() {
            public int (compareQ1_CD o1, Q1_CD o2) {
                return o1.getYearOfRelease() - o2.getYearOfRelease();
            }
        };
        CDs.sort(com);
        displayAllCDs();
    }

}
}
