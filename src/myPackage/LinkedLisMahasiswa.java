package myPackage;

import java.util.LinkedList;


public class LinkedLisMahasiswa {

    LinkedList<DataMahasiswa> dataL1 = new LinkedList<DataMahasiswa>();

    public void tambahData(DataMahasiswa NewData){

        this.dataL1.add(NewData);

    }

    public void tambahUtama(DataMahasiswa NewData){

        this.dataL1.addFirst(NewData);

    }

    public void tambahAkhir(DataMahasiswa NewData){

        this.dataL1.addLast(NewData);

    }

    public void hapusAwal(){

        this.dataL1.removeFirst();

    }

    public void hapusAkhir(){

        this.dataL1.removeLast();

    }

    public void hapusPilih(String NimCari){

        this.dataL1.removeIf(item->item.NIM == NimCari);

    }

    public void tampilData(){
        for (DataMahasiswa data: this.dataL1) {
          data.display(); 
        }
     }

    
}
