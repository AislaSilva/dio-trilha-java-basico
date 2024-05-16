public class CaixaEetronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17;

        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
    
}
