package com.CollectionGeneric;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        // Implement the logic to calculate the perimeter of a triangle
        // Perimeter = sum of all sides
        // For simplicity, let's assume it's an equilateral triangle
        return 3 * alas;
    }
}
