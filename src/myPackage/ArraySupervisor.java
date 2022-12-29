package myPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySupervisor {

  
      ArrayList<DataSupervisor> dataS1 = new ArrayList<DataSupervisor>();
   
      public Scanner input = new Scanner(System.in);
  

    public void tambahData(DataSupervisor NewData){
       this.dataS1.add(NewData);
    }
     
   public void hapusData(String NipCari){
        this.dataS1.removeIf(item->item.NIP == NipCari );
   }

   public void cariData(String NamaCari){
        int i = 0;
        boolean ditemukan = false;

        for (int j = 0; j < dataS1.size(); j++) {
            
          if (this.dataS1.get(j).Name == NamaCari) {
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
      for (DataSupervisor data: this.dataS1) {
        data.display(); 
      }

   }

    
}
