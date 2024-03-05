package service;

import models.classes.Vehicle;
import repository.VehicleRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Facade {
    private static Facade instance;

    private final VehicleRepository vehicleRepository;

    private Facade(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public static Facade getInstance(VehicleRepository vehicleRepository) {
        if (instance == null) {
            instance = new Facade(vehicleRepository);
        }
        return instance;
    }

    public void addVehicle(Vehicle vehicle) throws Exception {
        try {
            vehicleRepository.add(vehicle);
        } catch (Exception e) {
            throw new Exception("Erro ao adicionar veículo.", e);
        }
    }

    public double getDailyRate(String identification) throws Exception {
        try {
            Vehicle vehicle = findVehicleByIdentification(identification);
            return (vehicle != null) ? vehicle.getDiaryRate() : -1;
        } catch (Exception e) {
            throw new Exception("Erro ao obter taxa diária.", e);
        }
    }

    public int getNumberOfVehicles() throws Exception {
        try {
            return vehicleRepository.fleetSize();
        } catch (Exception e) {
            throw new Exception("Erro ao obter número de veículos.", e);
        }
    }

    public List<? extends Vehicle> getListByType(Class<? extends Vehicle> type) throws Exception {
        try {
            return vehicleRepository.generateListByType(type);
        } catch (Exception e) {
            throw new Exception("Erro ao obter lista por tipo.", e);
        }
    }

    public Vehicle getMostExpensiveVehicle() throws Exception {
        try {
            Optional<Vehicle> mostExpensive = vehicleRepository.getVehicles().stream()
                    .max(Comparator.comparing(Vehicle::getDiaryRate));

            return mostExpensive.orElse(null);
        } catch (Exception e) {
            throw new Exception("Erro ao obter veículo com diária mais cara.", e);
        }
    }

    private Vehicle findVehicleByIdentification(String identification) throws Exception {
        try {
            return vehicleRepository.getVehicles().stream()
                    .filter(vehicle -> vehicle.getIdentification().equalsIgnoreCase(identification))
                    .findFirst()
                    .orElse(null);
        } catch (Exception e) {
            throw new Exception("Erro ao procurar veículo por identificação.", e);
        }
    }
}