package ejercicio2;

/*2--- Crea una lista de precios con un hashMap, de una tienda de informatica,
el carrito de la compra o lo que sea, que puedas añadir productos y precios.
¿Cómo lo recorres?  Usa el tipo double para los precios.
¿Qué ocurre al mostrar el listado si usas LinkedHashMap? ¿Y  TreeMap? (no hay que ordenar por precio)*/

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> precios = new HashMap<>();
        precios.put("Teclado", 49.99);
        precios.put("Ratón", 19.95);
        precios.put("Monitor", 149.00);

        for (Map.Entry<String, Double> item : precios.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue() + "€");
        }
    }
}
