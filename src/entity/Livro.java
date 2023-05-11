package entity;

public class Livro {

    private int idLivro;
    private String nomeLivro;
    private String temaLivro;
    private String estadoLivro;

    public int getCodigo() {
        return idLivro;
    }

    public void setCodigo(int codigo) {
        this.idLivro = codigo;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getTemaLivro() {
        return temaLivro;
    }

    public void setTemaLivro(String temaLivro) {
        this.temaLivro = temaLivro;
    }

    public String getEstadoLivro() {
        return estadoLivro;
    }

    public void setEstadoLivro(String estadoLivro) {
        this.estadoLivro = estadoLivro;
    }
}