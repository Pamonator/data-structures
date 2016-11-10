/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao02;

/**
 *
 * @author a1402072
 */
public class NoLivro {

    private String autor;
    private String titulo;
    private String edicao;
    private String estado;
    private String editora;
    private int ano;

    private NoLivro previous;
    private NoLivro next;

    public NoLivro(String autor, String titulo, String edicao, String estado, String editora, int ano) {

        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.estado = estado;
        this.editora = editora;
        this.ano = ano;

    }

    public NoLivro() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public NoLivro getPrevious() {
        return previous;
    }

    public void setPrevious(NoLivro previous) {
        this.previous = previous;
    }

    public void setNext(NoLivro next) {

        this.next = next;

    }

    public NoLivro getNext() {

        return this.next;

    }

}
