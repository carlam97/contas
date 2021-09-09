import java.util.Scanner;
public class Principal{
    public static void main(String args[]){

        Scanner ler=new Scanner(System.in);
        Conta minhaConta=new Conta();

       // ler.netLine()         //texto
       // ler.nextIn()          //inteiro
       // ler.nextDouble()      //double
        System.out.println("Digite o nome do titular: ");
        minhaConta.titular=ler.nextLine();
        System.out.println("Digite o número da conta: ");
        minhaConta.numero=ler.nextInt();
        System.out.println("Digite o saldo disponível: ");
        minhaConta.saldo=ler.nextDouble();
        
        //minhaConta.numero=12345;
        //minhaConta.saldo=20;

    System.out.println("Senhor(a)" + minhaConta.titular + ". O numero da sua respectiva conta é " 
    + minhaConta.numero + ". Cujo saldo disponível é equivalente à " + minhaConta.saldo);
    
        
        
    }
}