package OPPS;

class phone {

    String company;
    String model_name;
    int ram;
    int rom;
    int storage;
    int rare_cam;

    void displayphoneInfo(){
        System.out.println("The mobile is " + company + model_name + "is having " + ram + "GB ram "+ rom +"GB rom "+ storage + "" + "and having it's rare camera of " + rare_cam + "megapixels");
    }
}

public class mobile {
    
    public static void main(String[]args){

        phone m1 = new phone();
        m1.company = "Redmi";
        m1.model_name = "Note 14";
        m1.ram = 16;
        m1.rom = 1000;
        m1.storage = 1 ; 
        m1.rare_cam = 100; 


        m1.displayphoneInfo();

    }

}
