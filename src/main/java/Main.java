public class Main {

    static void main() {
        printHello();
        getGreeting();

        System.out.println(getGreeting());
        System.out.println("Willkommen im Java-Kurs");
        String str = getGreeting();
        str = str.toLowerCase();
        System.out.println(str);
        printName("Max");

        int sum = add(5, 2);
        System.out.println(sum);

        double area = calculateArea(5, 2)
        System.out.println(area);

        int negative = -2;
        checkPositive(negative);

    }
}
