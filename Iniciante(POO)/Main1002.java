import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main1002 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US); 
        
        try (var scanner = new Scanner(System.in)) {
            var inputReader = new ConsoleDoubleReader(scanner);
            var outputDevice = new StandardConsoleOutput();
            var calculator = new BeecrowdCircleAreaCalculator();
            
            var app = new Application(inputReader, outputDevice, calculator);
            app.run();
        }
    }
}

record Circle(double radius) {}

record AreaResult(double area) {
    public String getFormattedOutput() {
        return String.format(Locale.US, "A=%.4f", area);
    }
}

interface InputReader {
    double readNextDouble();
}

interface OutputDevice {
    void printLine(String message);
}

interface CircleAreaCalculator {
    AreaResult calculateArea(Circle circle);
}

class ConsoleDoubleReader implements InputReader {
    private final Scanner scanner;

    public ConsoleDoubleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public double readNextDouble() {
        return scanner.nextDouble();
    }
}

class StandardConsoleOutput implements OutputDevice {
    @Override
    public void printLine(String message) {
        System.out.println(message);
    }
}

class BeecrowdCircleAreaCalculator implements CircleAreaCalculator {
    private static final double PI = 3.14159;

    @Override
    public AreaResult calculateArea(Circle circle) {
        double area = PI * Math.pow(circle.radius(), 2);
        return new AreaResult(area);
    }
}

class Application {
    private final InputReader inputReader;
    private final OutputDevice outputDevice;
    private final CircleAreaCalculator calculator;

    public Application(InputReader inputReader, OutputDevice outputDevice, CircleAreaCalculator calculator) {
        this.inputReader = inputReader;
        this.outputDevice = outputDevice;
        this.calculator = calculator;
    }

    public void run() {
        double radiusValue = inputReader.readNextDouble();
        var circle = new Circle(radiusValue);
        AreaResult result = calculator.calculateArea(circle);
        outputDevice.printLine(result.getFormattedOutput());
    }
}