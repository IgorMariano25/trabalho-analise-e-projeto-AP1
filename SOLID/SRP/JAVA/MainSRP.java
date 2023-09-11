package SOLID.SRP.JAVA;

public class MainSRP {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 5000.0);
        
        System.out.println("  Antes de aplicar o SRP  ");
        System.out.println("----------------------------");
        System.out.println("Relatório do Funcionário:");
        System.out.println(funcionario.gerarRelatorio());

        System.out.println("\n  Depois de aplicar o SRP  ");
        System.out.println("----------------------------");
        GeradorDeRelatorio gerador = new GeradorDeRelatorio();
        System.out.println("Relatório do Funcionário:");
        System.out.println(gerador.gerarRelatorio(funcionario));
    }
}