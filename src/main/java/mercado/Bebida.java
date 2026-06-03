package mercado;

/** Producto gravado con IVA del 13% (Costa Rica). */
public class Bebida extends Producto {

    public Bebida(String nombre, double precioBase, int cantidad) {
        super(nombre, precioBase, cantidad);
    }

    @Override
    public double precioFinal() {
        return getPrecioBase() * getCantidad() * 1.13;
    }
}
