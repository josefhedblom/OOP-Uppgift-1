package GreenestHotel;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class GreenestHotel {

    public GreenestHotel() {

        Cactus igge = new Cactus("Kaktus", "Igge", 0.2);
        Palm laura = new Palm("Palm", "Laura", 3);
        Palm olof = new Palm("Palm", "Olof", 0.5);
        CarnivorousPlant meatloaf = new CarnivorousPlant("Köttätande växt", "Meatloaf", 0.5);

        List<Plant> plants = Arrays.asList(igge, laura, olof, meatloaf);

        String inputPlant = showInputDialog();
        findPlant(plants, inputPlant);
    }

    public void printMessage(Plant plant) {
        JOptionPane.showMessageDialog(null, plant.getFluidRequirement());
    }

    public String showInputDialog() {
        String inputPlant;

        do {
            inputPlant = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            if (inputPlant == null || inputPlant.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Du får inte lämna fältet tomt. Försök igen.");
            }
        } while (inputPlant == null || inputPlant.isEmpty());

        return inputPlant;
    }


    public void findPlant(List<Plant> plants, String inputPlant) {
        Plant foundPlant = findPlantByName(plants, inputPlant);

        if (foundPlant != null) {
            printMessage(foundPlant);
        } else {
            JOptionPane.showMessageDialog(null, "Plantan '" + inputPlant + "' finns inte.");
        }
    }

    public Plant findPlantByName(List<Plant> plants, String inputPlant) {
        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(inputPlant)) {
                return plant;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        new GreenestHotel();
    }

}
