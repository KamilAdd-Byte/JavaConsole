package com.responsywnie.database;

import com.responsywnie.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleDataBase {

    List<Vehicle> vehicleList = new ArrayList<>();

//    int index = 0;

    public void addVehicle(Vehicle vehicle){
        if (vehicleList == null){
            throw new NullPointerException("Nie można dodać do bazy");
        } else
            vehicleList.add(vehicle);
        System.out.println("Dodano pojazd do bazy");
        System.out.println("W bazie jest już pojazdów: "+ sizeList());
    }
    public void removeVehicle(int index){
        vehicleList.remove(index);
    }

    public Vehicle getVehicle (int index){
        if (vehicleList == null){
            System.out.println("Nie ma pojazdów w bazie");
        }else
            for (Vehicle vehicle : vehicleList) {
                System.out.println(vehicle);
            }
        return vehicleList.get(index);
    }

    public void getAllVehicle(int index){
        if (vehicleList == null){
            System.out.println("Nie ma pojazdów w bazie");
        }else
            vehicleList.get(index);
        System.out.println("W bazie jest już pojazdów: "+vehicleList.size());
    }

    public int sizeList() {
        System.out.println(vehicleList.size());
        return vehicleList.size();
  }
}