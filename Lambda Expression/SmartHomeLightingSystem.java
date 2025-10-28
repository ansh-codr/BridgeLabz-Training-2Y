package lambda_Expression;

public class SmartHomeLightingSystem {
    public static void main(String[] args) {
        LightActivation motionTrigger = () -> System.out.println("Motion detected - Bright white lights ON");
        motionTrigger.activate();
        
        LightActivation timeTrigger = () -> System.out.println("Evening time - Dim warm lights ON");
        timeTrigger.activate();
        
        LightActivation voiceCommand = () -> System.out.println("Voice command - Party lights ON");
        voiceCommand.activate();
        
        LightActivation customPattern = () -> {
            System.out.println("Custom pattern activated:");
            System.out.println("- Living room: Bright white");
            System.out.println("- Bedroom: Soft yellow");
            System.out.println("- Kitchen: Cool white");
        };
        customPattern.activate();
    }
}
@FunctionalInterface
interface LightActivation {
    void activate();
}