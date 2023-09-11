package JAVA;
// package PADROES - GOF.Estrutura - PROXY;
class ProxyRecurso implements IRecurso {
    private RecursoReal recursoReal;
    private String nomeRecurso;
    private String nomeUsuario;
    private String senha;

    public ProxyRecurso(String nomeRecurso, String nomeUsuario, String senha) {
        this.nomeRecurso = nomeRecurso;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void acessar() {
        if (autenticar()) {
            if (recursoReal == null) {
                recursoReal = new RecursoReal(nomeRecurso);
            }
            System.out.println("------------------------------------------------");
            System.out.println(" [ OK ] Acesso Permitido: Credenciais Corretas  ");
            System.out.println("------------------------------------------------");
            recursoReal.acessar();
        } else {
            System.out.println("------------------------------------------------");
            System.out.println(" [ X ] Acesso negado: Credenciais Inválidas     ");
            System.out.println("------------------------------------------------");
            System.out.println("Você não tem permissão para acessar o recurso: " + this.nomeRecurso);
        }
    }

    private boolean autenticar() {
        return "usuario".equals(nomeUsuario) && "senha123".equals(senha);
    }
}