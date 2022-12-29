package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMahasiswa extends DataMahasiswa {

  
  ArrayList<DataMahasiswa> data1 = new ArrayList<DataMahasiswa>();
  public Scanner input = new Scanner(System.in);
  

    public void tambahData(DataMahasiswa NewData){
       this.data1.add(NewData);
    }
     
   public void hapusData(String NimCari){
        this.data1.removeIf(item->item.NIM == NimCari );
   }

   public void cariData(String NamaCari){
        int i = 0;
        boolean ditemukan = false;

        for (int j = 0; j < data1.size(); j++) {
            
          if (this.data1.get(j).Name == NamaCari) {
                i = j;
                ditemukan = true;
          }
        }

        if (ditemukan == true) {
            
            System.out.println("Data ketemu di index ke - "+ i);

        } else {
            
            System.out.println("Data tidak ditemukan");
        }

   }

   public void tampilData(){
      for (DataMahasiswa data: this.data1) {
        data.display(); 
      }
   }

    
}
