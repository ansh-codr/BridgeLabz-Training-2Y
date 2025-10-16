/**
 * Functional interface for light activation behaviors
 */
@FunctionalInterface
public interface LightActivation {
    void activate(SmartLight light);
}