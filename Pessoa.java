/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author vitor
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    
    public Pessoa(String nome, String cpf, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String exibirDetalhes(){
        return "Nome: " + nome + "\n" + "Documento:" +cpf;
    }
}
