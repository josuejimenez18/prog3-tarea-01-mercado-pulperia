package mercado;

/**
 * Capacidad que solo algunos productos tienen: vencerse.
 * Una fruta es perecedera; un abarrote enlatado no se modela así.
 */
public interface Perecedero {
    int diasParaVencer();
}
