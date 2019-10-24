/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Kalkulator {
    private double v1,v2;

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }
    public void setNameProject(){}
    public void setNoteProject(String note){}
    public double add(double val1, double val2){
        return val1 + val2;
    }
    public double minus(double val1, double val2){
        return val1 - val2;
    }
    public double multiplication(double val1, double val2){
        return val1 * val2;
    }
    public double division(double val1, double val2){
        return val1 / val2;
    }
    public void cetak(){
        System.out.println("ADD\t\t: "+add(v1, v2));
        System.out.println("MINUS\t\t: "+minus(v1, v2));
        System.out.println("MULTIPLE\t: "+multiplication(v1, v2));
        System.out.println("Division\t: "+division(v1, v2));
    }
}
