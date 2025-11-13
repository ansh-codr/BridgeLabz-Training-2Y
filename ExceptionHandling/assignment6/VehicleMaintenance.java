package assignment6;

import java.time.LocalDate;

public class VehicleMaintenance {
    public void checkMaintenance(LocalDate serviceDate, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage: Mileage cannot be negative");
        }
        if (serviceDate.isBefore(LocalDate.now())) {
            throw new ServiceOverdueException("Service is overdue! Last service date: " + serviceDate);
        }
        System.out.println("Vehicle maintenance is up to date");
    }
}
