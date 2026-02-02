package OPPS.session_23;


class Rectangle{
    float length;
    float breadth;

    Rectangle(float length, float breadth){
        this.length=length;
        this.breadth=breadth;
    }

    // setter 
    void setlength(float length){
        this.length= length;

    }

    void getlength(){
        System.out.println( " The new length of body is : " + length);
    }



}






public class constructor_3 {
    
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(11.5f, 13f);


        System.out.println(R1.length + "& " + R1.breadth);

        R1.setlength(20.2f);
        R1.getlength();
    }
}
