package SOLID.SRP.JAVA;

// Classe separada para gerar relatórios
class GeradorDeRelatorio {
    public String gerarRelatorio(Funcionario funcionario) {
        return "Nome: " + funcionario.getNome() + "\nSalário: " + funcionario.getSalario();
    }
}