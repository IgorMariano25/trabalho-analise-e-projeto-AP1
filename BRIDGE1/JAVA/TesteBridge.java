package JAVA;
public class TesteBridge {
    public static void main(String[] args) {
        Persistencia bd_livro = new LivroBD();
        Persistencia xml_livro = new LivroXML();
        Persistencia bd_revista = new RevistaBD();
        Persistencia xml_revista = new RevistaXML();

        Livro lvl = new Livro("Design Patterns", "GoF", "234567", bd_livro);
        Livro lv2 = new Livro("GRASP", "Larman", "543210", bd_livro);
        Livro lv3 = new Livro("Programação 00", "Deitel", "453287", xml_livro);
        Livro lv4 = new Livro("Teste Erro XML Revista", "Teste", "123456789", xml_revista);
        Livro lv5 = new Livro("Teste Erro BD Revista", "Teste", "123456789", bd_revista);

        lvl.salvar();
        lv2.salvar();
        lv3.salvar();
        lv4.salvar();
        lv5.salvar();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("                                    FIM LIVROS                                        ");
        System.out.println("--------------------------------------------------------------------------------------");

        Revista revista1 = new Revista("Forber Under 30 - Igor Mariano", 4, 2027, bd_revista);
        Revista revista2 = new Revista("TIME - The Rocky", 1, 2019, bd_revista);
        Revista revista3 = new Revista("Playboy - Joana Prado (Feiticeira)", 12, 1999, xml_revista);
        Revista revista4 = new Revista("Teste Erro XML Livro", 1, 1998, xml_livro);
        Revista revista5 = new Revista("Teste Erro BD Livro", 1, 1998, bd_livro);
        
        revista1.salvar();
        revista2.salvar();
        revista3.salvar();
        revista4.salvar();
        revista5.salvar();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("                                    FIM REVISTAS                                      ");
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
