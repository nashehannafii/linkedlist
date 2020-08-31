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
public class search {
    
    public static boolean cari(String nama){
        return Linkedlist.data.contains(nama);
    }
    
    public static void search() {
        System.out.println("ENTER THE DATA YOU WANT TO FIND :");
        String temp = Linkedlist.input().nextLine();
        if (cari(temp)) {
            System.out.println(temp);
        }else{
            System.out.println("YOU ENTERED AN INCORRECT DATA NAME !!");
        }
        Linkedlist.tampilan();
    }
}
