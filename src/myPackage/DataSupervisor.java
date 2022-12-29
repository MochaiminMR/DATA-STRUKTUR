package myPackage;

public class DataSupervisor {

    public String Name;
    public int Age;
    public String NIP;

    public DataSupervisor() {

    }

    public DataSupervisor(String Name, int Age, String NIP) {

        this.Name = Name;
        this.Age = Age;
        this.NIP = NIP;

    }

    public void display(){
            
        System.out.println("Nama: " + this.Name);
        System.out.println("Umur: " + this.Age);
        System.out.println("NIP: " + this.NIP);
        System.out.println();
    
    }

    

}
