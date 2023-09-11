public class ExemploProxyAutenticacao {
    public static void main(String[] args) {
        // Tentativa de acesso aos recursos protegidos usando um Proxy
        IRecurso recurso1 = new ProxyRecurso("Recurso A", "usuario", "senha123");
        IRecurso recurso2 = new ProxyRecurso("Recurso B", "usuario", "senha_errada");

        // Acesso bem-sucedido ao RecursoA
        recurso1.acessar();

        // Tentativa de acesso ao RecursoB com credenciais inválidas
        recurso2.acessar();
    }
}