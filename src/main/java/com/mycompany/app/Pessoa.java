public class Pessoa {
    protected String nome;
    protected Livro[] livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new Livro[0]; // Inicialmente, sem livros
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
