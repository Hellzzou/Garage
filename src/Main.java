import com.greg.motor.DieselMotor;
import com.greg.motor.ElectricMotor;
import com.greg.motor.GasolineMotor;
import com.greg.motor.HybridMotor;
import com.greg.option.AirConditioner;
import com.greg.option.ElectricWindows;
import com.greg.option.HeatedSeat;
import com.greg.option.GPS;
import com.greg.option.RoofRack;
import com.greg.vehicule.A300B;
import com.greg.vehicule.D4;
import com.greg.vehicule.Laguna;
import com.greg.vehicule.Vehicule;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        Vehicule lag1 = new Laguna();
        lag1.setMotor(new GasolineMotor("150 Chevaux"));
        lag1.addOption(new GPS());
        lag1.addOption(new HeatedSeat());
        lag1.addOption(new ElectricWindows());
        Garage.addVehicule(lag1);

        Vehicule A300B_2 = new A300B();
        A300B_2.setMotor(new ElectricMotor("1500 W"));
        A300B_2.addOption(new AirConditioner());
        A300B_2.addOption(new RoofRack());
        A300B_2.addOption(new HeatedSeat());
        Garage.addVehicule(A300B_2);

        Vehicule d4_1 = new D4();
        d4_1.setMotor(new DieselMotor("200 Hdi"));
        d4_1.addOption(new RoofRack());
        d4_1.addOption(new AirConditioner());
        d4_1.addOption(new GPS());
        Garage.addVehicule(d4_1);

        Vehicule lag2 = new Laguna();
        lag2.setMotor(new DieselMotor("500 Hdi"));
        Garage.addVehicule(lag2);

        Vehicule A300B_1 = new A300B();
        A300B_1.setMotor(new HybridMotor("ESSENCE/Electrique"));
        A300B_1.addOption(new ElectricWindows());
        A300B_1.addOption(new RoofRack());
        Garage.addVehicule(A300B_1);

        Vehicule d4_2 = new D4();
        d4_2.setMotor(new ElectricMotor("100 KW"));
        d4_2.addOption(new HeatedSeat());
        d4_2.addOption(new RoofRack());
        d4_2.addOption(new AirConditioner());
        d4_2.addOption(new GPS());
        d4_2.addOption(new ElectricWindows());
        Garage.addVehicule(d4_2);

        System.out.println(garage);
    }
}