package OOPs.Abstraction;

public class ak_33_RepairShop {
    public static void repairCar(ak_33_Car car){
        System.out.println("Car is Repaired");
    }

    public static void main(String[] args) {
        ak_33_WagonR wagonR = new ak_33_WagonR();
        ak_33_Audi audi = new ak_33_Audi();
        repairCar(wagonR);
        repairCar(audi);
    }
}
