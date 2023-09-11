package javahongkong.bootcamp.exercise;
import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        if (ordersOfFurnitures.containsKey(type)) {
            int currentCount = ordersOfFurnitures.get(type);
            ordersOfFurnitures.put(type, currentCount + furnitureCount);
        } else {
            ordersOfFurnitures.put(type, furnitureCount);
        }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        float totalCost = 0.0f;
        for (Furniture type : ordersOfFurnitures.keySet()) {
            int quantity = ordersOfFurnitures.get(type);
            totalCost += type.cost() * quantity;
        }
        return totalCost;
    }

    public int getTypeCount(Furniture type) {
        return ordersOfFurnitures.getOrDefault(type, 0);
    }

    public float getTypeCost(Furniture type) {
        int quantity = ordersOfFurnitures.getOrDefault(type, 0);
        return type.cost() * quantity;
    }

    public int getTotalOrderQuantity() {
        int totalQuantity = 0;
        for (int quantity : ordersOfFurnitures.values()) {
            totalQuantity += quantity;
        }
        return totalQuantity;
    }
}