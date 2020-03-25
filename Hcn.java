import java.util.Scanner;
public class Hcn {
    double width, height;

    public Hcn() {
    }

    public Hcn(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static class Ex14_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();
            Hcn hcn = new Hcn(width,height);
            System.out.println("Your hcn\n" + hcn.display());
            System.out.println("Perimeter of the Hcn:" + hcn.getPerimeter());
            System.out.println("Area of the Hcn:" + hcn.getArea());


        }
    }
}
