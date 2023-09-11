package SOLID.SRP;

// Classe original com várias responsabilidades
class Funcionario {
    private String nome;
    private double salario;
    
    // Responsabilidade 1: Gerenciamento de dados do funcionário
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    // Responsabilidade 2: Calcular aumento de salário
    public void aplicarAumento(double percentual) {
        double aumento = salario * (percentual / 100);
        salario += aumento;
    }
    
    // Responsabilidade 3: Gerar relatório de funcionário
    public String gerarRelatorio() {
        return "Nome: " + nome + "\nSalário: " + salario;
    }
}