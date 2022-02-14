import java.util.*;
public class Main {
    public static void main(String[] args) {
        int temp;
        try{
            temp = Integer.parseInt(args[0]);
            Cliente cli = new Cliente();
            XicaraCafe xicara = new XicaraCafe(temp);
            CafeVirtual cafeteria = new CafeVirtual();
            cafeteria.serveCliente(cli,xicara); 
        }
        catch (NumberFormatException e)
        {
            System.out.println("Valor invalido! Voce deve informar um numero inteiro");
        }
    }
}