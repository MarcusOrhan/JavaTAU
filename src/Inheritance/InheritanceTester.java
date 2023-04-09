package Inheritance;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Emine");
        System.out.println(mom.getName()+"is my mom and She is a "+ mom.getGender());
    }
    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(6);
        rectangle.setWidth(7);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        rectangle.setLength(6);
        rectangle.setWidth(7);
        System.out.println(square.calculatePerimeter());
    }
    public static void testInheritance(){
        Employee employee = new Employee();
        employee.setTitle("Mr. Ord. Prof. Dr. ");
    }
    public static void testOverload(){
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("S Q U A R E ");
    }
}
