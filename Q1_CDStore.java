/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author admin
 */
public class Q1_CDStore {
    public class CDStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CDList cd = new CDList();
        int menu;
        do {
            System.out.printf("1. Add CD\n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection(game/ movie/ music)\n"
                    + "4. Search CDs by type(audio/ video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit\nInput: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    cd.add();
                    break;
                case 2:
                    cd.searchTitle();
                    break;
                case 3:
                    cd.searchCollection();
                    break;
                case 4:
                    cd.searchType();
                    break;
                case 5:
                    cd.deleteId();
                    break;
                case 6:
                    cd.editInformation();
                    break;
                case 7:
                    cd.displayAllCDs();
                    break;
                case 8:
                    cd.sort();
                    break;
                case 9:
                    break;
            }

        } while (menu != 9);
    }

}

}
