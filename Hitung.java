/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author dimas
    */
public class Hitung {
    int beratBadan; 
    int tinggiBadan; 
    

    public Hitung(int beratBadan, int tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }
    

    public void BMI(){
        double bmi = beratBadan / Math.pow(tinggiBadan / 100.0, 2);
        System.out.println("Hasil BMI Anda: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Kategori: Berat badan berlebih");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
