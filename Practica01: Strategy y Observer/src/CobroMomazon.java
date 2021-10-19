public interface CobroMomazon{

    /**
     * Cobro por el servicio de Momazon
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */
    public boolean cobrar(Cliente cliente);
}