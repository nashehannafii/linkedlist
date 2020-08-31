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
public class Delete_Remove {
    
    private static boolean Search(String data){
        return Linkedlist.data.contains(data);
    }
    
    public static void AtRemove() {
        boolean keadaan = true;
        int isidata = 0;
        Linkedlist.tampilan();
        while (keadaan) {            
            System.out.println("SELECT THE INDEX TO BE DELETED [0-"+(Linkedlist.data.size()-1)+"]:");
        try {
            keadaan = false;
            isidata = Linkedlist.input().nextInt();
        } catch (Exception e) {
            System.out.println("DATA MUST BE A SPECIFIED NUMBER !!");
            keadaan = true;
        }
        }
        Linkedlist.data.remove(isidata);
        Linkedlist.tampilan();
    }
    
    public static void RemoveFirst() {
        Linkedlist.data.removeFirst();
        Linkedlist.tampilan();
    }
    
    public static void RemoveLast() {
        Linkedlist.data.removeLast();
        Linkedlist.tampilan();
    }
}
