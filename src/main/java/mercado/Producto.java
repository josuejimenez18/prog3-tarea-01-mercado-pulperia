package mercado;

/**
 * Clase base abstracta de todo producto del mercado.
 * Define el estado común y obliga a cada subclase a calcular su precio final.
 */
public abstract class Producto {

    private String nombre;
    private double precioBase;
    private int cantidad;

    public Producto(String nombre, double precioBase, int cantidad) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
    }

    /** Cada subclase decide cómo se calcula su precio final (impuestos, descuentos, etc.). */
    public abstract double precioFinal();

    /** Aumenta el stock. Necesario porque 'cantidad' es private (encapsulamiento). */
    public void agregarStock(int n) {
        this.cantidad += n;
    }

    // Overloading: misma operación, distinto contrato
    public void mostrar() {
        System.out.println(nombre + " x" + cantidad + " | Total: ₡" + precioFinal());
    }

    public void mostrar(boolean detalle) {
        if (detalle) {
            System.out.println("Producto : " + nombre);
            System.out.println("  Precio base : ₡" + precioBase);
            System.out.println("  Cantidad    : " + cantidad);
            System.out.println("  Total       : ₡" + precioFinal());
            System.out.println("  Tipo        : " + getClass().getSimpleName());
        } else {
            mostrar();
        }
    }

    public String getNombre()     { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public int getCantidad()      { return cantidad; }
}
