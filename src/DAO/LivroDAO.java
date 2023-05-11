package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Livro;

public class LivroDAO {
    public void cadastrarLivro(Livro livro) {

        String sql = "INSERT INTO Livros (IDLivro,NomeLivro, TemaLivro, EstadoLivro) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, livro.getCodigo());
            ps.setString(2, livro.getNomeLivro());
            ps.setString(3, livro.getTemaLivro());
            ps.setString(4, livro.getEstadoLivro());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
