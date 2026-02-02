package OPPS.session_23;



class Circle{
 float radius;
 float pi = 3.14f;

    //Area of the circle 
    void area(){
        System.out.println("Area of the circle is " + (pi * radius * radius));
    }
    // Circumference of Circle 
    void Circumference(){
        System.out.println("Circumference of circle is " + (2 * pi * radius));
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

        c1.setradius(5.0f);
        c1.getradius();
        c1.area();
        c1.Circumference();

        Circle c2 = new Circle();
        c2.setradius(6.0f);

        c2.getradius();
        c2.Circumference();
        c2.area();

    }
}
