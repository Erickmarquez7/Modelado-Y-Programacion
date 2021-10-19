public interface CobroHVOMax{
    
    /**
     * Cobro por el servicio de HVOMax
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */
    public boolean cobrar(Cliente cliente);
}