public interface CobroTwitsh {
    /**
     * Cobro por el servicio de Twitsh
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue utilizando el servicio
     */ 
    public boolean cobrar(Cliente cliente);
    
}
