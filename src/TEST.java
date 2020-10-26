import com.responsywnie.database.VehicleDataBase;
import com.responsywnie.vehicle.Car;
import com.responsywnie.vehicle.Vehicle;


public class TEST {
    public static void main(String[] args) {

        VehicleDataBase vehicleDataBase = new VehicleDataBase();
        vehicleDataBase.addVehicle(new Vehicle(456.345,"Model","Marka"));
        vehicleDataBase.addVehicle(new Car(777777,"DREW","NIEZNANA","AUTO","SUV",4444569));
        vehicleDataBase.addVehicle(new Car(123777,"QWERTY","NIEZNANA","REW","SEDAN",23459));
        vehicleDataBase.addVehicle(new Car(565656,"CAMEL","Mark","AUTO","SUV",99846432));
        System.out.println("Metoda get: wyświetla listę vehicle");
        vehicleDataBase.getVehicle(args.length);
        System.out.println("metoda Size: ile obiektów na liście");
        vehicleDataBase.sizeList();
        System.out.println("metoda remove");
        vehicleDataBase.removeVehicle(3);
        vehicleDataBase.sizeList();
        vehicleDataBase.getVehicle(args.length);
    }
}
