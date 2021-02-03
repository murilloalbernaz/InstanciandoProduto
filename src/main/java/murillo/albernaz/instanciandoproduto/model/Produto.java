/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.instanciandoproduto.model;

import java.time.LocalDate;

/**
 *
 * @author murillo
 */
public class Produto {
    long id;
    String codigoEan;
    String descricao;
    String marca;
    String modelo;
    double preco;
    LocalDate dataCadastro;
    LocalDate dataUltimaAtualizacao;
    int estoque;
    String categoria;
    String urlFoto;

    Produto(long id, String codigoEan, String descricao, String marca, String modelo, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, int estoque, String categoria, String urlFoto) {
        this.id = id;
        this.codigoEan = codigoEan;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.estoque = estoque;
        this.categoria = categoria;
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", codigoEan=" + codigoEan + ", descricao=" + descricao + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", dataCadastro=" + dataCadastro + ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", estoque=" + estoque + ", categoria=" + categoria + ", urlFoto=" + urlFoto + '}';
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public void setCodigoEan(String codigoEan) {
        this.codigoEan = codigoEan;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    
    
    
    
}
