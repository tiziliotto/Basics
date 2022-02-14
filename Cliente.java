public class Cliente
{
    public void bebeCafe(XicaraCafe xic) throws ColdException, HotException{
        if(xic.getTemp()<65){
            throw new ColdException("O cafe esta frio");
        }
        else if(xic.getTemp()>85){
            throw new HotException("O cafe esta quente");
        }
        else{
            System.out.println("O cafe esta na temperatura ideal");
        }
    }
}
