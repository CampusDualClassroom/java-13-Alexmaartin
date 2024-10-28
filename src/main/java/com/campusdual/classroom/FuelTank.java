package com.campusdual.classroom;

public class FuelTank {
  private int actualFuel;


  public FuelTank() {
  }


  public int getActualFuel() {
    return actualFuel;
  }


  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("El valor de combustible no puede ser negativo. No se ha modificado.");
    } else {
      this.actualFuel = fuel;
    }
  }


  public void showDetails() {
    System.out.println("Combustible actual: " + getActualFuel());
  }
}