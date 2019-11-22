package PracticTasks;

public class Ex13 {
    public static void main(String[] args) {

        final double width = 10.1;
        final double height = 11.7575;

        double perimeter = 2 * (width + height);
        double area = width * height;
        System.out.printf("Perimeter is 2*(%.1f + %.1f)= %.2f \n", height, width, perimeter);
        System.out.println(perimeter);
        ;
        System.out.printf("Area is %.1f+ %.1f= %2f", width, height, area);
    }
}
