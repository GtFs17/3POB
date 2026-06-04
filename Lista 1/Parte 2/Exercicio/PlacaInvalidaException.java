public class PlacaInvalidaException extends RuntimeException {
    public PlacaInvalidaException(String placa) {
        super("Placa inválida: " + placa + ". A placa deve conter exatamente 7 caracteres.");
    }

}
