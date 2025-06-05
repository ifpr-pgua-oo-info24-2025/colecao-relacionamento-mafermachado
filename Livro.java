public class Livro {
    private String titulo;
    private Integer anoPublicacao;
    private Autor autor;

    public Livro(String titulo, Integer anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Nacionalidade do Autor: " + autor.getNacionalidade());
    }
}
