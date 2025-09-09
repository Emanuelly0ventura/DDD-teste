package br.com.fiap.cinefiap.dao;

import br.com.fiap.cinefiap.model.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDao {
    private Connection conexao;
    public void cadastrarFilme(Filme filme){
        conexao = ConnectionFactory.obterConexao();
        PreparedStatement comandoSQL = null;
        try{
            String sql = "insert into tbl_filme(id_filme, tx_nome, nr_duracao, tp_genero, tp_classificacao, nr_ano, tx_diretor, tx_elenco, tx_descricao, nr_avaliacao)" +
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            comandoSQL = conexao.prepareStatement(sql);
            comandoSQL.setInt(1, filme.getId());
            comandoSQL.setString(2, filme.getNome());
            comandoSQL.setDouble(3, filme.getDuracao());
            comandoSQL.setString(4, filme.getGenero());
            comandoSQL.setString(5, filme.getClassifcacao());
            comandoSQL.setInt(6, filme.getAno());
            comandoSQL.setString(7, filme.getDiretor());
            comandoSQL.setString(8, filme.getElenco());
            comandoSQL.setString(9, filme.getDescricao());
            comandoSQL.setInt(10, filme.getAvaliacao());


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public Filme buscarProid(int id){
//        conexao = ConnectionFactory.obterConexao();
//        PreparedStatement ps = null;
//        Filme filme = new Filme();
//        try{
//            ps = conexao.prepareStatement("select *")
//        }
//    }



}
