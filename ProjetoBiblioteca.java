public class ProjetoBiblioteca {
    public static void main(String args[]) throws Exception {

        Biblioteca biblioteca = new Biblioteca(4);
        Livro livro1 = new Livro("O pequeno Principe", "Autor 1", "123", false);
        Livro livro2 = new Livro("Percy Jackson", "Rick Riondan", "456", false);
        Livro livro3 = new Livro("A menina que roubava livros", "Autora", "789", false);
        Livro livro4 = new Livro("Maze Runner", "Autor maze runer", "321", false);

        
        System.out.println("Adicionar Livro: " + biblioteca.adicionarLivro(livro1));
        System.out.println("Adicionar Livro: " + biblioteca.adicionarLivro(livro2));
        System.out.println("Adicionar Livro: " + biblioteca.adicionarLivro(livro3));
        System.out.println("Adicionar Livro: " + biblioteca.adicionarLivro(livro4));

        System.out.println("Remover Livro: " + biblioteca.removerLivro("456"));
        // System.out.println("Buscar Livro: " + biblioteca.buscarLivro("123"));
        System.out.println("Emprestar Livro: " + biblioteca.emprestarLivro("123"));
        // System.out.println("Devolver Livro: " + biblioteca.devolverLivro("123"));
        System.out.println("Listar Livros Disponiveis: " + biblioteca.listarLivrosDisponiveis());
        String[] livrosDisponiveis = biblioteca.listarLivrosDisponiveis();
        for (String item : livrosDisponiveis) {
            System.out.println(item);
        }


        

    }
}
