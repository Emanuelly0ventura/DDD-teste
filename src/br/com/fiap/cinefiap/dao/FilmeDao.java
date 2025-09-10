package br.com.fiap.cinefiap.dao;

import br.com.fiap.cinefiap.model.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDao {
    private Connection conexao;
    public void  CadastrarFilme(Filme filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        try{
            String SQL = "INSERT INTO TBL_CONTATO (ID_CONTATO, nome_contato, celular_contato, email_contato, instagram, tipo)" +
                    "values (?, ?, ?, ?, ?, ?);";
            ps = conexao.prepareStatement(SQL);
            ps.setInt(1,filme.getId());
            ps.setString(2,filme.getNome());
            ps.setDouble(3,filme.getDuracao());
            ps.setString(4, filme.getGenero());
            ps.setString(5, filme.getClassifcacao());
            ps.setInt(6, filme.getAno());
            ps.setString(7,filme.getDiretor());
            ps.setString(8,filme.getElenco());
            ps.setString(9, filme.getDescricao());
            ps.setInt(10, filme.getAvaliacao());
            ps.executeUpdate();
            ps.close();
            conexao.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Filme buscarPorId(int id){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        Filme filme = new Filme();
        try {
            ps = conexao.prepareStatement("select * from tbl_filme" + "where id_filme = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                filme.setId(rs.getInt(1));
                filme.setNome(rs.getString(2));
                filme.setDuracao(rs.getDouble(3));
                filme.setGenero(rs.getString(4));
                filme.setClassifcacao(rs.getString(5));
                filme.setAno(rs.getInt(6));
                filme.setDiretor(rs.getString(7));
                filme.setElenco(rs.getString(8));
                filme.setDescricao(rs.getString(9));
                filme.setAvaliacao(rs.getInt(10));

            }
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return filme;
    }

    public List<Filme> ListarFilmes(){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        List<Filme> filmes = new ArrayList<Filme>();
        try{
            ps = conexao.prepareStatement("select * from tbl_filme;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt(1));
                filme.setNome(rs.getString(2));
                filme.setDuracao(rs.getDouble(3));
                filme.setGenero(rs.getString(4));
                filme.setClassifcacao(rs.getString(5));
                filme.setAno(rs.getInt(6));
                filme.setDiretor(rs.getString(7));
                filme.setElenco(rs.getString(8));
                filme.setDescricao(rs.getString(9));
                filme.setAvaliacao(rs.getInt(10));
//                filme.add(filme);
            }
            ps.close();
            conexao.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return filmes;
    }

    public void alterarFilme(Filme filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        try{
            String sql = "UPDATE tbl_contato SET nome_contato = ?, celular_contato = ?," +
                    " email_contato = ?, instagram = ?, tipo = ?" +
                    "where id_contato = ?";
            ps = conexao.prepareStatement(sql);
            ps.setString(1, filme.getNome());
            ps.setDouble(2, filme.getDuracao());
            ps.setString(3, filme.getGenero());
            ps.setString(4, filme.getClassifcacao());
            ps.setInt(5, filme.getAno());
            ps.setString(6, filme.getDiretor());
            ps.setString(7, filme.getElenco());
            ps.setString(8, filme.getDescricao());
            ps.setInt(9, filme.getAvaliacao());
            ps.executeUpdate();
            ps.close();
            conexao.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void excluirFilme(Filme filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = null;
        try{
            ps = conexao.prepareStatement("delete from tbl_filme where id_filme = ?" + "tbl_contato where id_contato = ?");
            ps.setInt(1, filme.getId());
            ps.executeUpdate();
            ps.close();
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
