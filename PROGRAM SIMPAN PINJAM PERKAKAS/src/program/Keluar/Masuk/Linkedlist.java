/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.Keluar.Masuk;

/**
 *
 * @author xdragon
 */
import java.util.Scanner;
import java.util.LinkedList;

public class Linkedlist {
    
    static LinkedList<String> data = new LinkedList<String>();

    public static void tampilan(){
        System.out.println("\nDATA BARANG");
        System.out.println("DATA LIST    : " + data);
        System.out.println("TOTAL DATA   : " + data.size());
    }
    public static void tampilangui() {
        
    }
    public static void judul(){
        System.out.println(" DATA COLLECTION PROGRAM FOR LOANING AND ENTRY ");
    }
    private static void CASE(){
        boolean keadaan = true;
        int pilihan = 0;
        while (keadaan) {            
            try {
                keadaan = false;
                System.out.println(" CHOICE THE MENU[1-9]:");
                pilihan = input().nextInt();
            } catch (Exception e) {
                System.out.println(" MUST NUMBER TYPE !!");
                keadaan = true;
            }
        }
        switch(pilihan){
            case 1: Insertion_Input.AddData();break;
            case 2: Insertion_Input.AddFirst();break;
            case 3: Insertion_Input.AddLast();break;
            case 4: Insertion_Input.AtLocation();break;
            case 5: Delete_Remove.RemoveFirst();break;
            case 6: Delete_Remove.RemoveLast();break;
            case 7: Delete_Remove.AtRemove();break;
            case 8: search.search();break;
            case 9: exit();break;
        }
        menu();
    }
  
    
    public static void menu() {
        System.out.println(
            "\n[-----------------PROGRAM MENU-----------------]" +
            "\n|1. ADD DATA-----------------------------------|" +
            "\n|2. ADD DATA AT FIRST--------------------------|" +
            "\n|3. ADD DATA AT LAST---------------------------|" +
            "\n|4. ADD DATA ON N INDEX------------------------|" +
            "\n|5. REMOVE DATA AT FIRST-----------------------|" +
            "\n|6. REMOVE DATA AT LAST------------------------|" + 
            "\n|7. REMOVE DATA ON N INDEX---------------------|" +
            "\n|8. SEARCH-------------------------------------|" +
            "\n|9. EXIT---------------------------------------|" +
            "\n[----------------------------------------------]");
        CASE();
    }
    public static Scanner input(){
        return new Scanner(System.in);
    }
    
    public static void pilih() {
        boolean keadaan = true;
        int pilihan = 0;
        while (keadaan) {            
            try {
                keadaan = false;
                System.out.println("CHOICE THE MENU[1 - 9]");
                pilihan = input().nextInt();
            }   catch (Exception e) {
                System.out.println("MUST NUMBER TYPE");
                keadaan = true;
            }
        }
        data.remove(pilihan);
        tampilan();
    }
    public static void exit() {
        System.exit(0);
    }
}
