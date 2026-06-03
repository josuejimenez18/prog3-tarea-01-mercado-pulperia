package mercado;

/** Producto de la canasta básica: exento de IVA. Es perecedero. */
public class Fruta extends Producto implements Perecedero {

    private int diasFrescura;

    public Fruta(String nombre, double precioBase, int cantidad, int diasFrescura) {
        super(nombre, precioBase, cantidad);
        this.diasFrescura = diasFrescura;
    }

    @Override
    public double precioFinal() {
        // Canasta básica: exenta de IVA
        return getPrecioBase() * getCantidad();
    }

    @Override
    public int diasParaVencer() {
        return diasFrescura;
    }
}
