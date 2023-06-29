package projeto;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Funcionario extends Pessoa{
    
    private double salario;
    private String cargo;
    private String senha;

    public Funcionario(String nome, Endereco endereco, String documento, String cargo, String senha, double salario) {
        super(nome, documento, endereco);
        this.cargo = cargo;
        this.senha = senha;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    @Override
    public String exibirDetalhes(){
        String string = super.exibirDetalhes();
        return string + "\n" + "Cargo: " + cargo;
    }

    public boolean verificarSenha(String tentativa) {
        return tentativa.equals(senha);
    }

    /*public void menuFuncionario(Cadastro cadastro) {
        int opcao;

        do {
            String opcaoString = JOptionPane.showInputDialog(
                null,
                "-=-=-=-=-=- MENU CIDADAO -=-=-=-=-=-\n" +
                "Escolha a opção:\n" +
                "1- Alterar Cadastro\n" +
                "2- Sair"
            );

            opcao = Integer.parseInt(opcaoString);

            switch (opcao) {
                case 1:
                    cadastro.alterarFuncionario(nome);
                    break;
                case 2:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 2);
    }*/
}