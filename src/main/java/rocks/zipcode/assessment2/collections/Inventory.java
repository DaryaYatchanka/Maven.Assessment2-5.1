package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    HashMap<String, Integer> inventory;




    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
//        inventory = new HashMap<>();
//        for (String item : strings) {
//            addItemToInventory(item);


    }

    /**
     * nullary constructor initializes a new list
//     */
    public Inventory() {
        this.inventory = new HashMap<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        inventory.put(item, inventory.getOrDefault(item, 0) + 1);

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(inventory.containsKey(item)){
            int count = inventory.get(item);
            if(count >1){
                inventory.put(item, count -1 );
            }else {
                inventory.remove(item);
            }
        }


    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inventory.getOrDefault(item, 0);
    }
}
