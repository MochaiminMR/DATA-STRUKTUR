package myPackage;

import java.util.LinkedList;

public class LinkedListSupervisor {

    LinkedList<DataSupervisor> dataL1 = new LinkedList<DataSupervisor>();

    public void tambahData(DataSupervisor NewData){

        this.dataL1.add(NewData);

    }

    public void tambahUtama(DataSupervisor NewData){

        this.dataL1.addFirst(NewData);

    }

    public void tambahAkhir(DataSupervisor NewData){

        this.dataL1.addLast(NewData);

    }

    public void hapusAwal(){

        this.dataL1.removeFirst();

    }

    public void hapusAkhir(){

        this.dataL1.removeLast();

    }

    public void hapusPilih(String NimCari){

        this.dataL1.removeIf(item->item.NIP == NimCari);

    }

    public void tampilData(){
        for (DataSupervisor data: this.dataL1) {
          data.display(); 
        }
     }
    
}
