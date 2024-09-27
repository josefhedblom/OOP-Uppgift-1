public class Main {
    public static void main(String[] args) {
        Cactus cactus = new Cactus("Kaktus","Igge", 20);
        Palm plam1 = new Palm("Plam","Laura", 5);
        Palm plam2 = new Palm("Plam","Olof", 5);
        CarnivorousPlant carnivorousPlant = new CarnivorousPlant("Köttätande växt","Meatloaf", 0.7);

        System.out.println(cactus);
        System.out.println(plam1);
        System.out.println(plam2);
        System.out.println(carnivorousPlant);
    }
}