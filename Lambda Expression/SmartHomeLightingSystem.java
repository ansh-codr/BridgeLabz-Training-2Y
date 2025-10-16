import java.time.LocalTime;
import java.util.*;

/**
 * Smart Home Lighting Automation System using Lambda Expressions
 * Demonstrates different triggers for light activation behaviors
 */
public class SmartHomeLightingSystem {
    private List<SmartLight> lights;
    private Map<String, LightActivation> lightPatterns;
    
    public SmartHomeLightingSystem() {
        lights = new ArrayList<>();
        lightPatterns = new HashMap<>();
        initializeLights();
        initializeLightPatterns();
    }
    
    private void initializeLights() {
        lights.add(new SmartLight("Living Room"));
        lights.add(new SmartLight("Bedroom"));
        lights.add(new SmartLight("Kitchen"));
        lights.add(new SmartLight("Bathroom"));
        lights.add(new SmartLight("Hallway"));
    }
    
    private void initializeLightPatterns() {
        // Motion detection pattern - bright white light
        lightPatterns.put("motion", (light) -> {
            light.activateLight(100, "white");
            System.out.println("Motion detected! Bright lighting activated.");
        });
        
        // Evening/night pattern - warm dim light
        lightPatterns.put("evening", (light) -> {
            light.activateLight(30, "warm yellow");
            System.out.println("Evening mode: Cozy dim lighting activated.");
        });
        
        // Morning pattern - bright cool light
        lightPatterns.put("morning", (light) -> {
            light.activateLight(80, "cool white");
            System.out.println("Good morning! Energizing bright lighting activated.");
        });
        
        // Voice command pattern - customizable
        lightPatterns.put("party", (light) -> {
            light.activateLight(70, "rainbow");
            System.out.println("Party mode activated! Let's celebrate!");
        });
        
        // Reading pattern - focused bright light
        lightPatterns.put("reading", (light) -> {
            light.activateLight(90, "neutral white");
            System.out.println("Reading mode: Focus lighting activated.");
        });
        
        // Sleep pattern - very dim red light
        lightPatterns.put("sleep", (light) -> {
            light.activateLight(10, "red");
            System.out.println("Sleep mode: Gentle red lighting for better sleep.");
        });
        
        // Security pattern - flashing bright light
        lightPatterns.put("security", (light) -> {
            light.activateLight(100, "white");
            System.out.println("SECURITY ALERT: Full brightness activated!");
        });
    }
    
    // Trigger light based on motion detection
    public void motionDetected(String room) {
        System.out.println("\n=== Motion Detection Trigger ===");
        SmartLight light = findLightByRoom(room);
        if (light != null) {
            lightPatterns.get("motion").activate(light);
        }
    }
    
    // Trigger light based on time of day
    public void timeBasedActivation() {
        System.out.println("\n=== Time-based Activation ===");
        LocalTime currentTime = LocalTime.now();
        String pattern;
        
        if (currentTime.isBefore(LocalTime.of(7, 0))) {
            pattern = "sleep";
        } else if (currentTime.isBefore(LocalTime.of(18, 0))) {
            pattern = "morning";
        } else {
            pattern = "evening";
        }
        
        System.out.println("Current time: " + currentTime + " - Activating " + pattern + " mode");
        lights.forEach(light -> lightPatterns.get(pattern).activate(light));
    }
    
    // Trigger light based on voice commands
    public void voiceCommand(String command, String room) {
        System.out.println("\n=== Voice Command Trigger ===");
        System.out.println("Voice command received: '" + command + "' for " + room);
        
        SmartLight light = findLightByRoom(room);
        if (light != null && lightPatterns.containsKey(command.toLowerCase())) {
            lightPatterns.get(command.toLowerCase()).activate(light);
        } else {
            System.out.println("Command not recognized or room not found!");
        }
    }
    
    // Dynamic pattern addition using lambda
    public void addCustomPattern(String patternName, LightActivation pattern) {
        lightPatterns.put(patternName, pattern);
        System.out.println("Custom pattern '" + patternName + "' added successfully!");
    }
    
    // Apply pattern to specific room
    public void applyPattern(String patternName, String room) {
        System.out.println("\n=== Manual Pattern Application ===");
        SmartLight light = findLightByRoom(room);
        if (light != null && lightPatterns.containsKey(patternName)) {
            lightPatterns.get(patternName).activate(light);
        } else {
            System.out.println("Pattern or room not found!");
        }
    }
    
    // Apply pattern to all lights
    public void applyPatternToAll(String patternName) {
        System.out.println("\n=== Applying Pattern to All Lights ===");
        if (lightPatterns.containsKey(patternName)) {
            lights.forEach(light -> lightPatterns.get(patternName).activate(light));
        } else {
            System.out.println("Pattern not found!");
        }
    }
    
    // Turn off all lights
    public void turnOffAllLights() {
        System.out.println("\n=== Turning Off All Lights ===");
        lights.forEach(SmartLight::turnOff);
    }
    
    // Helper method to find light by room
    private SmartLight findLightByRoom(String room) {
        return lights.stream()
                    .filter(light -> light.getLocation().equalsIgnoreCase(room))
                    .findFirst()
                    .orElse(null);
    }
    
    // Display current status of all lights
    public void displayLightStatus() {
        System.out.println("\n=== Current Light Status ===");
        lights.forEach(System.out::println);
    }
    
    // Main method to demonstrate the system
    public static void main(String[] args) {
        SmartHomeLightingSystem system = new SmartHomeLightingSystem();
        
        System.out.println("🏠 Smart Home Lighting Automation System 🏠");
        System.out.println("===============================================");
        
        // Demonstrate motion detection
        system.motionDetected("Living Room");
        system.motionDetected("Kitchen");
        
        // Demonstrate time-based activation
        system.timeBasedActivation();
        
        // Demonstrate voice commands
        system.voiceCommand("party", "Living Room");
        system.voiceCommand("reading", "Bedroom");
        system.voiceCommand("security", "Hallway");
        
        // Demonstrate custom pattern creation using lambda
        system.addCustomPattern("romantic", (light) -> {
            light.activateLight(20, "pink");
            System.out.println("Romantic mood lighting activated! 💕");
        });
        
        system.applyPattern("romantic", "Bedroom");
        
        // Apply pattern to all lights
        system.applyPatternToAll("sleep");
        
        // Display current status
        system.displayLightStatus();
        
        // Turn off all lights
        system.turnOffAllLights();
        
        // Final status
        system.displayLightStatus();
        
        // Demonstrate lambda with conditional logic
        System.out.println("\n=== Advanced Lambda Pattern ===");
        LightActivation adaptivePattern = (light) -> {
            String room = light.getLocation();
            if (room.contains("Bedroom")) {
                light.activateLight(25, "warm white");
                System.out.println("Bedroom detected: Soft lighting for relaxation");
            } else if (room.contains("Kitchen")) {
                light.activateLight(95, "cool white");
                System.out.println("Kitchen detected: Bright task lighting");
            } else {
                light.activateLight(60, "neutral white");
                System.out.println("Default room lighting applied");
            }
        };
        
        system.addCustomPattern("adaptive", adaptivePattern);
        system.applyPatternToAll("adaptive");
    }
}