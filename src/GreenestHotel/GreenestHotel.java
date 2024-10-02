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

        boolean running = true;


        try {
            while (running) {
                String menuInput = printMenu();
                switch (menuInput) {
                    case "1":
                        showAllPlants(plants);
                        break;
                    case "2":
                        String input = showInputDialog();
                        findPlant(plants, input);
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null,"Avslutar programmet");
                        running = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Ogitligt val. Försök igen");
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ett fel har uppstått: " + e.getMessage());
        }
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

    public String printMenu() {
        String input = JOptionPane.showInputDialog("Välj ett alternativ:\n1. Visa alla växter\n2. Vattna en växt:\n3. Avsluta");
        return input;
    }

    public void showAllPlants(List<Plant> plants) {
        StringBuilder allPlants = new StringBuilder();
        for (Plant plant : plants) {
            allPlants.append(plant.getName())
                    .append(" (")
                    .append(plant.getType())
                    .append(") - ")
                    .append(plant.calculateFluidRequirement())
                    .append(" liter/dag\n");
        }
        JOptionPane.showMessageDialog(null, allPlants.toString());
    }


    public static void main(String[] args) {
        new GreenestHotel();
    }

}
