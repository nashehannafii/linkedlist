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

public class Insertion_Input {
    public static void AddData() {        
        System.out.println("INPUT DATA :");
        String temp = Linkedlist.input().nextLine();
        Linkedlist.data.add(temp);
        Linkedlist.tampilan();
    }
    public static void AtLocation() {
        boolean keadaan = true;
        int isidata = 0;
        Linkedlist.tampilan();
        while (keadaan) {            
            System.out.println("SELECT THE DATA YOU WANT TO INSERT DATA INTO [0-"+(Linkedlist.data.size()-1)+"]:");
        try {
            keadaan = false;
            isidata = Linkedlist.input().nextInt();
        } catch (Exception e) {
            System.out.println("MUST NUMBER TYPE");
            keadaan = true;
            }
        }
        System.out.println("SELECT THE DATA YOU WANT TO INSERT DATA INTO - "+ isidata + ":");
        String temp = Linkedlist.input().nextLine();
        Linkedlist.data.add(isidata,temp);
        Linkedlist.tampilan();
    }
    public static void AddFirst() {
        System.out.println("INPUT DATA :");
        String temp = Linkedlist.input().nextLine();
        Linkedlist.data.addFirst(temp);
        Linkedlist.tampilan();
    }
    public static void AddLast() {
        System.out.println("INPUT DATA :");
        String temp = Linkedlist.input().nextLine();
        Linkedlist.data.addLast(temp);
        Linkedlist.tampilan();
    }    
}
