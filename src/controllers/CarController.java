package controllers;

import models.Car;

public class CarController {
  // Burbuja avanzado
  public void sortByName(Car[] cars) {
    for (int i = 0; i < cars.length; i++) {
      boolean cambio = false;
      for (int j = 0; j < cars.length - 1 - i; j++) {
        // 5 3 4
        if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0) {
          Car aux = cars[j]; // 5 = aux
          cars[j] = cars[j + 1]; // 3 3 4
          cars[j + 1] = aux; // 3 5 4
          cambio = true;
        }
      }
      if (!cambio) {
        return;
      }
    }
  }
}
