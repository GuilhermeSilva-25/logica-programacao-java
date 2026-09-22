import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var greetingProvider = new HelloWorldGreeting();
        var outputDevice = new StandardConsoleOutput();
        
        var app = new Application(greetingProvider, outputDevice);
        app.run();
    }
}

interface GreetingProvider {
    String getGreeting();
}

class HelloWorldGreeting implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}

interface OutputDevice {
    void printLine(String message);
}

class StandardConsoleOutput implements OutputDevice {
    @Override
    public void printLine(String message) {
        System.out.println(message);
    }
}

class Application {
    private final GreetingProvider greetingProvider;
    private final OutputDevice outputDevice;

    public Application(GreetingProvider greetingProvider, OutputDevice outputDevice) {
        this.greetingProvider = greetingProvider;
        this.outputDevice = outputDevice;
    }

    public void run() {
        String greeting = greetingProvider.getGreeting();
        outputDevice.printLine(greeting);
    }
}