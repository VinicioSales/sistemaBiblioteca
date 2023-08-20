public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(int livrosQuantidade) {
        livros = new Livro[livrosQuantidade];
    }

    public boolean adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                return true;
            } else if (livros[i].getIsnb().equals(livro.getIsnb())) {
                return false;
            }
        }
        return false;
    }

    public boolean removerLivro(String isbn) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                return false;
            }
            else if (livros[i].getIsnb().equals(isbn)) {
                livros[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Livro buscarLivro(String isbn) {
        for (int i = 0; i < livros.length; i ++) {
            if (livros[i] == null) {
                return null;
            } else if (livros[i].getIsnb().equals(isbn)) {
                return livros[i];
            }
        }
        return null;
    }

    public boolean emprestarLivro(String isbn) throws Exception {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                throw new Exception("Livro não cadastrado!");
            }
            else if (livros[i].getIsnb().equals(isbn)) {
                if (livros[i].getEmprestado() == false) {
                    livros[i].setEmprestado(true);
                    return true;
                }
            }
        }
        throw new Exception("Livro não Encontrado!");
    }

    public boolean devolverLivro(String isbn) throws Exception {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getIsnb().equals(isbn)) {
                livros[i].setEmprestado(false);
                return true;
            }
        }
        throw new Exception("Livro não cadastrado!");
    }

    public String[] listarLivrosDisponiveis() {
        String[] livrosDisponiveis = new String[livros.length];
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && !livros[i].getEmprestado()) {
                for (int j = 0; j < livrosDisponiveis.length; j++) {
                    if (livrosDisponiveis[j] == null) {
                        livrosDisponiveis[j] = livros[i].getTitulo();
                        break;
                    }
                }
            }
        }
        return livrosDisponiveis;
    }

}