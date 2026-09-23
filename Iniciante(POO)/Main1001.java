import java.io.IOException;
import java.util.Scanner;

public class Main1001 {
    public static void main(String[] args) throws IOException {
        try (var scanner = new Scanner(System.in)) {

            var inputReader = new ConsoleInputReader(scanner);
            var outputDevice = new StandardConsoleOutput();
            var calculator = new BasicSumCalculator();

            var app = new Application(inputReader, outputDevice, calculator);
            app.run();
        }
    }
}

record CalculationResult(int valueA, int valueB, int sum) {
    public String getFormattedOutput() {
        return "X = " + sum;
    }
}

interface InputReader {
    int readNextInt();
}

interface OutputDevice {
    void printLine(String message);
}

interface Calculator {
    CalculationResult calculateSum(int a, int b);
}

class ConsoleInputReader implements InputReader {
    private final Scanner scanner;

    public ConsoleInputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int readNextInt() {
        return scanner.nextInt(); // Lê o próximo número inteiro digitado
    }
}

class StandardConsoleOutput implements OutputDevice {
    @Override
    public void printLine(String message) {
        System.out.println(message);
    }
}

class BasicSumCalculator implements Calculator {
    @Override
    public CalculationResult calculateSum(int a, int b) {
        return new CalculationResult(a, b, a + b);
    }
}

class Application {
    private final InputReader inputReader;
    private final OutputDevice outputDevice;
    private final Calculator calculator;

    public Application(InputReader inputReader, OutputDevice outputDevice, Calculator calculator) {
        this.inputReader = inputReader;
        this.outputDevice = outputDevice;
        this.calculator = calculator;
    }

    public void run() {
        int a = inputReader.readNextInt();
        int b = inputReader.readNextInt();

        CalculationResult result = calculator.calculateSum(a, b);

        outputDevice.printLine(result.getFormattedOutput());
    }
}