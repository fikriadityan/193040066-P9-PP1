/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class StrukturStack {
    private int[] array;
    private int capacity;
    private int top;
    public final int MIN = -1;

    // Konstruktor untuk inisialisasi stack dengan kapasitas tertentu
    public StrukturStack(int size) {
        capacity = size;
        array = new int[capacity];
        top = MIN;
    }

    // Method untuk mengecek apakah stack penuh
    public boolean isFull() {
        return (top == capacity - 1);
    }

    // Method untuk menambahkan elemen ke dalam stack (operasi push)
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            array[top] = data;
        }
    }

    // Method untuk menghapus elemen teratas dari stack (operasi pop)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; // Nilai kembalian default jika stack kosong
        } else {
            int poppedElement = array[top];
            top--;
            return poppedElement;
        }
    }

    // Method untuk mengecek ukuran stack
    public int size() {
        return top + 1;
    }

    // Method untuk mendapatkan nilai elemen teratas stack (top)
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; // Nilai kembalian default jika stack kosong
        } else {
            return array[top];
        }
    }

    // Method untuk mengecek apakah stack kosong
    public boolean isEmpty() {
        return (top == MIN);
    }
}
