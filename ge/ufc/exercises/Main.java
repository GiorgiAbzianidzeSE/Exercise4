package ge.ufc.exercises;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(50.4f); // initializes Height as 50.0
        Rectangle rectangle2 = new Rectangle(5.4d);

        //

        System.out.println(Rectangle.maxArea(new Rectangle[]{new Rectangle() , new Rectangle(20,10), new Rectangle(40,60),new Rectangle(30,6)}).areaCalculator());
    }
}
