package myPackage;
import java.util.Scanner;


public class QueueMahasiswa{

    
    public String Name;
    public int Age;
    public String NIM;
    public String City;
    public Scanner input = new Scanner(System.in);
    
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getNIM() {
        return NIM;
    }

    public String getCity() {
        return City;
    }

    public Scanner getInput() {
        return input;
    }

    public QueueMahasiswa(){
        
    }

    public QueueMahasiswa(  String Name,int Age,String NIM,String City){

        this.Name = Name;
        this.Age = Age;
        this.NIM = NIM;
        this.City = City;

    }


    public void display(){
            
        System.out.println("Nama: " + this.Name);
        System.out.println("Umur: " + this.Age);
        System.out.println("NIM: " + this.NIM);
        System.out.println("Kota: " + this.City);
        System.out.println();
    
    }


}

