package GreenestHotel;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    String inputPlant = JOptionPane.showInputDialog("Vilken växt ska få mat?"); // byta namn på input variablen

    Cactus igge = new Cactus("Kaktus", "Igge", 0.2);
    Palm laura = new Palm("Plam", "Laura", 3);
    Palm olof = new Palm("Plam", "Olof", 0.5);
    CarnivorousPlant meatloaf = new CarnivorousPlant("Köttätande växt", "Meatloaf", 0.5);

    List<Plant> plants = Arrays.asList(igge, laura, olof, meatloaf);

    boolean plantFound = false;

        for(Plant plant :plants){
        if (plant.getName().equalsIgnoreCase(inputPlant)) {
            printMessage(plant);
            plantFound = true;
            break;
        }
    }

        if(!plantFound){
            JOptionPane.showMessageDialog(null, "Plantan '" + inputPlant + "' finns inte.");
        }

    public void printMessage(Plant plant) {
        JOptionPane.showMessageDialog(null, plant.getFluidRequirement());
    }

}

