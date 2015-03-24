/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad4;

public class Clase {

    double x;
    double c1;
    double c2;
    double c3;

    public Clase(double c1, double c2, double c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public double clase() {

        double c1 = 2;
        double c2 = 3;
        double c3 = 0;
        return c1 + c2 + c3;
    }

    public void formula() {

        double formula = ((x * x) / c1) + (c2 * x) + c3;
    }
}
