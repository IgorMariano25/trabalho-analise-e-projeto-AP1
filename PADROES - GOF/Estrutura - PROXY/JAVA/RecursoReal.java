package JAVA;
class RecursoReal implements IRecurso {
    private String nomeRecurso;

    public RecursoReal(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }

    public void acessar() {
        System.out.println("Acessando o recurso real: " + nomeRecurso);
    }
}