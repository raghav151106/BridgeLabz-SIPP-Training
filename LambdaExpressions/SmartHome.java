package LambdaExpressions;

interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {
        // Using lambdas for different triggers
        LightAction motionDetected = () -> System.out.println("Lights ON due to motion!");
        LightAction eveningTime = () -> System.out.println("Dim lights for evening mood.");
        LightAction voiceCommand = () -> System.out.println("Lights set to user's voice command.");

        // Execute actions
        motionDetected.execute();
        eveningTime.execute();
        voiceCommand.execute();
    }
}

