public class CafeVirtual
{
    //metodos
    public void serveCliente(Cliente cli, XicaraCafe xic){
        try{
            cli.bebeCafe(xic);
        }
        catch(TemperatureException e){
            System.out.println(""+e.getMessage());
        }
    }
}