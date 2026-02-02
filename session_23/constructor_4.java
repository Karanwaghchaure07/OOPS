package OPPS.session_23;



class Circle{
 float radius;
 float pi = 3.14f;

    //Area of the circle 
    void area(){
        System.out.println("Area of the circle is " + (pi * radius * radius));
    }
    


    //setter 
    void setradius(float radius){
        this.radius = radius;
    }
    void getradius(){
        System.out.println("This is the radius of Circle " + radius);
    }
    
}






public class constructor_4 {
    
    public static void main(String[] args) {
        
      Circle c1 = new Circle();

        c1.setradius(20.2f);
        c1.getradius();


    }
}
