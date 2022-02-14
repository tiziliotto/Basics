public class TemperatureException extends Exception
{
    //atributos
    private String mensagem;
    
    //construtor
    public TemperatureException(String mensagem){
        super(mensagem);
    }
}
