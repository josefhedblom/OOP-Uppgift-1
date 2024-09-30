import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String vilkenVäxtInput = JOptionPane.showInputDialog("Vilken växt ska få mat?");

        List<Plant> plants = new ArrayList<>();

        Cactus igge = new Cactus("Kaktus", "Igge", 0.2);
        Palm laura = new Palm("Plam", "Laura", 3);
        Palm olof = new Palm("Plam", "Olof", 0.5);
        CarnivorousPlant meatloaf = new CarnivorousPlant("Köttätande växt", "Meatloaf", 0.5);

        plants.add(meatloaf);
        plants.add(igge);
        plants.add(laura);
        plants.add(olof);

        for (Plant plant : plants) {
            if(plant.getName().equalsIgnoreCase(vilkenVäxtInput)){
                printMessage(plant);
            }
        }

    }

    public static void printMessage(Plant plant){
        JOptionPane.showMessageDialog(null, plant.getFluidType());
    }
}