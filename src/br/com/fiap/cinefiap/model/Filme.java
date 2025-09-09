package br.com.fiap.cinefiap.model;

public class Filme {
    private int  id;
    private String nome;
    private double duracao;
    private String genero;
    private String classifcacao;
    private int ano;
    private String capa;
    private String diretor;
    private String elenco;
    private String descricao;
    private int avaliacao;

    public String toString(){
        return "\nFilme: " + id +
                "\nNome: " + nome +
                "\nGenero: " + genero +
                "\nClassificação indicativa: " + classifcacao +
                "\nAno: " + ano +
                "\nDiretor: " + diretor +
                "\nElenco: " + elenco +
                "\nDescrição: " + descricao +
                "\nAvaliação: " + avaliacao +
                "\n============================================";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassifcacao() {
        return classifcacao;
    }

    public void setClassifcacao(String classifcacao) {
        this.classifcacao = classifcacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
