package mercado;

/**
 * Operaciones de utilidad sobre un carrito (arreglo de productos).
 * Métodos static: no necesitan una instancia de Mercado.
 *
 * POLIMORFISMO en acción: todos estos métodos reciben Producto[] sin importar
 * si contiene Frutas, Bebidas o Limpieza. Llaman precioFinal() en cada elemento
 * y Java decide en tiempo de ejecución qué implementación ejecutar.
 */
public class Mercado {

    /** Suma el precio final de todos los productos del carrito. */
    public static double totalCarrito(Producto[] carrito) {
        double total = 0;
        for (Producto p : carrito) {
            total += p.precioFinal(); // polimorfismo: versión correcta según tipo real
        }
        return total;
    }

    /**
     * TAREA 1: retornar el producto con el mayor precioFinal() del carrito.
     * Use totalCarrito como guía de recorrido.
     */
    public static Producto masCaro(Producto[] carrito) {
        // TODO: recorra guardando el Producto con mayor precioFinal() visto hasta ahora
        return null;
    }

    /**
     * TAREA 2: retornar el producto con el menor precioFinal() del carrito.
     * Misma estructura que masCaro, pero busca el mínimo.
     */
    public static Producto masBarato(Producto[] carrito) {
        // TODO: misma lógica que masCaro, condición invertida
        return null;
    }

    /**
     * TAREA 3: sumar los descuentos de todos los productos Descontable del carrito.
     *
     * POLIMORFISMO + INTERFACE: instanceof verifica en tiempo de ejecución qué tipo
     * real tiene p. El cast a Descontable permite llamar aplicarDescuento(), que
     * cada clase que implementa la interface define de forma diferente.
     */
    public static double totalDescuentos(Producto[] carrito) {
        // TODO: si p instanceof Descontable → cast → sumar aplicarDescuento()
        //   Pista: Descontable d = (Descontable) p;
        return 0;
    }
}
