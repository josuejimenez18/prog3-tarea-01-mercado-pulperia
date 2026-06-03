package mercado;

/**
 * Producto seco/empacado: gravado con IVA 13%.
 * Si se compran 12 o más unidades (docena), aplica 10% de descuento.
 */
public class Abarrote extends Producto {

    public Abarrote(String nombre, double precioBase, int cantidad) {
        super(nombre, precioBase, cantidad);
    }

    @Override
    public double precioFinal() {
        double total = getPrecioBase() * getCantidad() * 1.13;
        if (getCantidad() >= 12) {
            total *= 0.90; // descuento por docena
        }
        return total;
    }
}
