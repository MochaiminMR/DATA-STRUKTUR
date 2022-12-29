import myPackage.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws Exception {

        ArrayMahasiswa mhs1 = new ArrayMahasiswa();
        ArraySupervisor spr1 = new ArraySupervisor();
        LinkedLisMahasiswa mhsl1 = new LinkedLisMahasiswa();
        LinkedListSupervisor sprl1 = new LinkedListSupervisor();

        Scanner input = new Scanner(System.in);

        int i = 1;

        while (i != 0) {

            System.out.println("[1]ARRAY\n[2]QUEUE\n[3]LINKED LIST");
            System.out.print("Menu : ");int pilihan = input.nextInt();
            System.out.println();


            if (pilihan == 1) {

                mhs1.tambahData(new DataMahasiswa("Cimin", 19, "2108983", "Bekasi"));
                mhs1.tambahData(new DataMahasiswa("Irham", 20, "2108984", "Bekasi"));
                mhs1.tambahData(new DataMahasiswa("Galvin", 20, "2108985", "Bekasi"));
                mhs1.hapusData("2108985");
                System.out.println("-----Mencari Data-----");
                mhs1.cariData("Cimin");
                System.out.println();
                mhs1.tampilData();

                spr1.tambahData(new DataSupervisor("Pak Thoriq Ajiz", 40, "2125574"));
                spr1.tambahData(new DataSupervisor("Pak Kharisma", 30, "2125575"));
                spr1.tambahData(new DataSupervisor("Pak Razif", 20, "2125576"));
                System.out.println("-----Mencari Data-----");
                spr1.cariData("Kharisma");
                System.out.println();
                spr1.hapusData("2125576");
                System.out.println("-----DATA SUPERVISOR-----");
                spr1.tampilData();
                System.out.println();

            } else if (pilihan == 2) {

               DataMahasiswa mahasiswa1 = new DataMahasiswa("Satria",70,"2100808","Bekasi");
               DataMahasiswa mahasiswa2 = new DataMahasiswa("Joni",70,"2100809","Bekasi");
               DataMahasiswa mahasiswa3 = new DataMahasiswa("Ihsan",70,"2100810","Bekasi");

               DataSupervisor supervisor1 = new DataSupervisor("Bu Kris",70,"2100808");
               DataSupervisor supervisor2 = new DataSupervisor("Pak Topan",70,"2100809");
               DataSupervisor supervisor3 = new DataSupervisor("Bu Jihan",70,"2100810");
                
               Queue<String> mhsque = new PriorityBlockingQueue<String>();
               Queue<String> sprque = new PriorityBlockingQueue<String>();

                mhsque.add(mahasiswa1.Name);
                mhsque.add(mahasiswa2.Name);
                mhsque.add(mahasiswa3.Name);

                sprque.add(supervisor1.Name);
                sprque.add(supervisor2.Name);
                sprque.add(supervisor3.Name);

                Iterator<String> temp = mhsque.iterator();
                Iterator<String> temp2 = sprque.iterator();
                while(temp.hasNext() || temp2.hasNext()){
                    System.out.println(temp.next());
                    System.out.println(temp2.next());
                }
                System.out.println();

                HashMap<String,String> waldos = new HashMap<String, String>();
                waldos.put(mahasiswa1.Name,supervisor1.Name);
                waldos.put(mahasiswa2.Name,supervisor2.Name);
                waldos.put(mahasiswa3.Name,supervisor3.Name);

                System.out.println("Ini adalah Hash Map");
                System.out.println("Mahaiswa dengan nama "+ mahasiswa1.Name + " Akan di bimbing oleh " + waldos.get(mahasiswa1.Name));
                System.out.println("Mahaiswa dengan nama "+ mahasiswa2.Name + " Akan di bimbing oleh " + waldos.get(mahasiswa2.Name));
                System.out.println("Mahaiswa dengan nama "+ mahasiswa3.Name + " Akan di bimbing oleh " + waldos.get(mahasiswa3.Name));


                // Queue<QueueMahasiswa> mhsque1 = new PriorityBlockingQueue<QueueMahasiswa>();
                // mhsque1.add(new QueueMahasiswa("Cimin", 19, "2108983", "Bekasi"));
                // mhsque1.add(new QueueMahasiswa("Cimin", 19, "2108983", "Bekasi"));

            } else if (pilihan == 3) {

                mhsl1.tambahData(new DataMahasiswa("Hassan", 20, "2108983", "Bekasi"));
                mhsl1.tambahData(new DataMahasiswa("Bima", 20, "2108983", "Bekasi"));
                mhsl1.tambahUtama(new DataMahasiswa("Sasa", 20, "2108984", "Bekasi"));
                mhsl1.tambahAkhir(new DataMahasiswa("Rehan", 20, "2108985", "Bekasi"));
                mhsl1.tambahUtama(new DataMahasiswa("Sutejo", 20, "2108984", "Bekasi"));
                mhsl1.hapusAkhir();
                mhsl1.hapusAwal();
                mhsl1.tampilData();

                sprl1.tambahData(new DataSupervisor("Pak Bandri",40,"212121"));
                sprl1.tambahData(new DataSupervisor("Buk Ruri",40,"212122"));
                sprl1.tambahData(new DataSupervisor("Bu Andin",40,"212122"));
            

            }

        }

        input.close();
    }

}
