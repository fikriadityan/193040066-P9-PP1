/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class TestStrukturStack {
    public static void main(String[] args) {
        // Membuat objek stack dengan kapasitas 3
        StrukturStack stack = new StrukturStack(3);

        // Menampilkan status stack sebelum push
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        printElements(stack);

        // Melakukan push 3 kali
        System.out.println("\n#Melakukan push 3x: push 2; push 4, push 1");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Menampilkan status stack setelah push
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        printElements(stack);

        // Melakukan pop
        System.out.println("\n#Melakukan pop");
        stack.pop();

        // Menampilkan status stack setelah pop
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        printElements(stack);
    }

    // Method untuk mencetak elemen dari stack, dimulai dari TOP
    private static void printElements(StrukturStack stack) {
        if (stack.isEmpty()) {
            System.out.println();
            return;
        }

        for (int i = stack.top(); i >= 0; i--) {
            System.out.print(stack.top() + " ");
            stack.pop(); // Pop elemen setelah mencetak
        }
        System.out.println();
    }
}
