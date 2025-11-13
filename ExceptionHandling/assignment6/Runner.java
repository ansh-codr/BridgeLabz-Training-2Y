package assignment6;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        VehicleMaintenance vehicle = new VehicleMaintenance();
        try {
            vehicle.checkMaintenance(LocalDate.of(2024, 10, 1), 50000);
        } catch (ServiceOverdueException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println(e.getMessage());
        }
    }
}
