package OPPS.session_23;


class dog {

    String name;
    String Breed;

    dog(String name, String Breed) {
        this.name = name;
        this.Breed = Breed;
    }

    // Setter & Getter Methods
    // setter:
    void setName(String name) {
        this.name = name;
    }

    void setBreed(String Breed) {
        this.Breed = Breed;
    }

    // getter:
    void getName() {
            System.out.println("New Name of Dog is: " + name);
        }

    void getBreed() {
            System.out.println("New Breed of Dog is: " + Breed);
        }

}


public class constructor_2 {
    public static void main(String[] args) {
        
        dog dog1 = new dog("Joey", "Husky");
        dog dog2 = new dog("Rocky", "German Shepherd");

        System.out.println(dog1.name + " is the Name of Dog & the Breed is " + dog1.Breed);
        System.out.println(dog2.name + " is the Breed of Dog & the Breed is " + dog2.Breed);

        // Using Setter Method

        dog1.setName("Max");
        dog1.getName();

        dog2.setName("Buddy");
        dog2.getName();
        
        dog1.setBreed("Lab");
        dog1.getBreed();

        dog2.setBreed("Bulldog");
        dog2.getBreed();


    }
}
