public class Printer {
    void print(String text) {
        System.out.println(" The Printer Print Text: " + text);
    }
    void print(int number) {
        System.out.println(" The Printer Print Integer: " + number);
    }
    void print(double number) {
        System.out.println(" The Printer Print Double: " + number);
    }
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print("Hello Usman");
        p.print(25);
        p.print(5.75);
    }
}
