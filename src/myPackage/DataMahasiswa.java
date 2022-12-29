package myPackage;
	

public class DataMahasiswa {

    public String Name;
    public int Age;
    public String NIM;
    public String City;

    
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

    public DataMahasiswa(){
        
    }

    public DataMahasiswa(  String Name,int Age,String NIM,String City){

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
