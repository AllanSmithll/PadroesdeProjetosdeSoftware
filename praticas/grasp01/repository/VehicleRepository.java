package repository;

import models.classes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }

    public void add(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void remove(String identification) {
        vehicles.removeIf(vehicle -> vehicle.getIdentification().equals(identification));
    }

    public int fleetSize() {
        return this.vehicles.size();
    }

    public <T extends Vehicle> List<T> generateListByType(Class<T> type) {
        List<T> listByType = new ArrayList<>();
        for (Vehicle vehicle : this.vehicles) {
            if (type.isInstance(vehicle)) {
                listByType.add(type.cast(vehicle));
            }
        }
        return listByType;
    }
}
