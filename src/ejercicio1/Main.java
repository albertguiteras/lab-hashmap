package ejercicio1;

/*SORTEO CIUDADES
Tienes un array o arraylist de 20 ciudades.
Se seleccionan aleatoriamente 3 de ellas y se imprimen (usar Math.random).
+EXTRA: cómo harias para asegurar que no se repite la ciudad?
Visualiza las variables en el debugger. ¿Qué ocurre con el índice del bucle? y con el número random?*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>(Arrays.asList(
                "Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza",
                "Málaga", "Murcia", "Palma", "Bilbao", "Alicante",
                "Córdoba", "Valladolid", "Vigo", "Gijón", "Granada",
                "Vitoria", "A Coruña", "Elche", "Oviedo", "Santander"
        ));

        int cant = 3;

        System.out.println("CIUDADES GANADORAS:");

        for (int i = 0; i < cant; i++) {
            int indiceRandom = (int) (Math.random() * ciudades.size());

            String ciudadElegida = ciudades.remove(indiceRandom); // PARA QUE NO SE REPITA

            System.out.println((i + 1) + ": " + ciudadElegida);
        }
    }
}
