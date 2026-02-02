package OPPS;

public class introduction {
    
    public static int getWage(int baseSalary, int overtime, int unitRate) {

        return baseSalary + (overtime * unitRate);
    }


    public static void main(String[] args) {
        
        // what is OOPS ? 
        // it is a programing paradim (Blueprints)

        //Imperial Perediam 
        //Procedural Paradim 
        //Fucntional Paradim 
        //Object-Oriented Paradim

        int baseSalary = 3000;
        int overtime = 20;
        int unitRate = 250;

        System.out.println(getWage(baseSalary, overtime, unitRate));

       
    }
}
