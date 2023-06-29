package projeto;

import java.util.Scanner;

public class Cidadao extends Pessoa{

  public Cidadao(String nome, String cpf, Endereco endereco) {
    super(nome, cpf, endereco);
  }

  public void setNome(String newVar) {
    nome = newVar;
  }

  public String getNome() {
    return nome;
  }

  public void setCpf(String newVar) {
    cpf = newVar;
  }

  public String getCpf() {
    return cpf;
  }
  
  public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    @Override
    public String exibirDetalhes(){
        return super.exibirDetalhes();
    }

  /*public void menuCidadao(Cadastro cadastros) {
    int opcao;
    String busca;

    Scanner scan = new Scanner(System.in);
    System.out.println("-=-=-=-=-=- MENU CIDADAO -=-=-=-=-=-");
    System.out.println("Escolha a opcao:");
    System.out.println("1- Pesquisar funcionario");
    System.out.println("2- Pesquisar empresa");
    System.out.println("3- Denunciar Irregularidades");
    System.out.println("4- Acompanhar Orcamento");
    System.out.println("5- Listar licitacoes");

    opcao = scan.nextInt();
    scan.nextLine();

    switch (opcao) {
      case 1:
          System.out.print("Digite o nome do funcionario: ");
          busca = scan.nextLine();
          cadastros.buscarFuncionario(busca);
        break;
      case 2:
          System.out.print("Digite o nome do empresa: ");
          busca = scan.nextLine();
          cadastros.buscarEmpresa(busca);
        break;
      case 3:
        // Código para denunciar irregularidades
        break;
      case 4:
        // Código para acompanhar orçamento
        break;
      case 5:
        // Código para listar licitações
        break;
      default:
        System.out.println("Opção inválida");
        break;
    }
    //scan.close();
  }*/
}

