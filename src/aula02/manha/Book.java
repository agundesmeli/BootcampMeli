package aula02.manha;

public class Book {

    private String titulo;
    private String isbn;
    private String autor;
    private String genero;
    private String status;

    public Book() {}

    public Book(String titulo, String isbn, String autor, String genero) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.genero = genero;
        this.status = "Disponível";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void emprestimo() {
        if (this.status.equalsIgnoreCase("Disponível")) {
            this.status = "Emprestado";
            System.out.println("Livro emprestado");
            return;
        }
        System.out.println("O livro já foi emprestado e não está disponível");
    }

    public void devolver() {
        if (this.status.equalsIgnoreCase("Emprestado")) {
            this.status = "Disponível";
            System.out.println("Livro entregue");
            return;
        }
    }

    @Override
    public String toString() {
        return titulo + ", " + isbn + ", " + autor;
    }
}
