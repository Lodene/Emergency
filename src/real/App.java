package real;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import real.models.Actor;
import real.models.Base;
import real.models.TypeActor;
import real.models.TypeBase;
import real.models.TypeVehicle;
import real.models.Vehicle;

public class App {
    private static final List<Vehicle> vehicleList = new ArrayList<>();
    private static final List<Base> baseList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        TypeBase typeBase = new TypeBase("pompier");
        Base base1 = new Base(4.851, 45.760, typeBase);
        Base base2 = new Base(4.894, 45.761, typeBase);
        Base base3 = new Base(4.892, 45.769, typeBase);
        Base base4 = new Base(4.885, 45.780, typeBase);
        Base base5 = new Base(4.867, 45.777, typeBase);
        Base base6 = new Base(4.850, 45.769, typeBase);
        Base base7 = new Base(4.869, 45.769, typeBase);
        baseList.add(base1);
        baseList.add(base2);
        baseList.add(base3);
        baseList.add(base4);
        baseList.add(base5);
        baseList.add(base6);
        baseList.add(base7);

        List<Vehicle> vehicleList = new ArrayList<>();

        for (int i = 1; i <= 21; i++) {
            TypeActor typeActor = new TypeActor("pompier");
            double longitude, latitude;
            TypeVehicle typeVehicle;

            if (i % 3 == 0) {
                typeVehicle = new TypeVehicle(4, "Camion à échelle", typeActor);
            } else {
                typeVehicle = new TypeVehicle(6, "Camion Citerne", typeActor);
            }

            if (i <= 3) {
                longitude = 4.851;
                latitude = 45.760;
            } else if (i <= 6) {
                longitude = 4.894;
                latitude = 45.761;
            } else if (i <= 9) {
                longitude = 4.892;
                latitude = 45.769;
            } else if (i <= 12) {
                longitude = 4.885;
                latitude = 45.780;
            } else if (i <= 15) {
                longitude = 4.867;
                latitude = 45.777;
            } else if (i <= 18) {
                longitude = 4.850;
                latitude = 45.769;
            } else {
                longitude = 4.869;
                latitude = 45.769;
            }
            Vehicle vehicle = new Vehicle(false, longitude, latitude, 100, typeVehicle);
            vehicleList.add(vehicle);
        }
    }
}
