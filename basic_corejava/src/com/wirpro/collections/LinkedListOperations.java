package com.wirpro.collections;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

	//private LinkedList<String> list;
    private LinkedList<String> list;//=new LinkedList<>();

    public LinkedListOperations() {
        list = new LinkedList<>();
    }

    // Add items to the linked list
    public void addItem(String item) {
        list.add(item);
        System.out.println("Added: " + item);
    }

    // Update an item in the linked list
    public void updateItem(int index, String newItem) {
        if (index >= 0 && index < list.size()) {
            String oldItem = list.set(index, newItem);
            System.out.println("Updated: " + oldItem + " to " + newItem);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // List all items in the linked list
    public void listItems() {
        System.out.println("Listing all items:");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Delete an item from the linked list
    public void deleteItem(String item) {
        if (list.remove(item)) {
            System.out.println("Deleted: " + item);
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();

        // Add items
        operations.addItem("Mobile");
        operations.addItem("Laptop");
        operations.addItem("Mouse");

        // List items
        operations.listItems();

        // Update an item
        operations.updateItem(2, "Mouse1");

        // List items again to see the update
        operations.listItems();

        // Delete an item
        operations.deleteItem("Laptop");

        // List items again to see the deletion
        operations.listItems();
    }

}
