package projeto;

import java.util.Scanner;

public class Prefeitura{
  private String nome;
  private Endereco endereco;
  private String documento;
  private String senha;

  public Prefeitura(String nome, String rua, String bairro, int numero, String cidade, String documento, String senha) {
      endereco = new Endereco(rua, bairro, numero, cidade);
      this.nome = nome;
      this.documento = documento;
      this.senha = senha;
  }

  public void setNome(String newVar) {
      nome = newVar;
  }

  public String getNome() {
      return nome;
  }

  public void setEndereco(Endereco newVar) {
      endereco = newVar;
  }

  public Endereco getEndereco() {
      return endereco;
  }

  public void setDocumento(String newVar) {
      documento = newVar;
  }

  public String getDocumento() {
      return documento;
  }

  public void setSenha(String newVar) {
      senha = newVar;
  }

  public String getSenha() {
      return senha;
  }
  
  public String exibirDetalhes(){
        return "Nome: " + nome + "\n" + documento;
    }
 

  /*public void menuPrefeitura(Cadastro cadastros){
    int opcao; //menu
    String nome, rua, bairro, documento, ramoAtividade, senha, cidade, cargo; //cadastros
    String busca; //buscar
    int num; //cadastro
    Scanner scan1 = new Scanner(System.in);
    do{
        System.out.println("-=-=-=-=-=- MENU PREFEITURA -=-=-=-=-=-");
        System.out.println("1- Cadastrar funcionario");
        System.out.println("2- Alterar Cadastro de Funcionario");
        System.out.println("3- Cadastrar Empresa");
        System.out.println("4- Alterar Cadastro Empresa");
        System.out.println("5- Atualizar Orcamento");
        System.out.println("6- Listar Licitacoes");
        System.out.println("7- Sair");

        opcao = scan1.nextInt();

        switch (opcao) {
            case 1:
                scan1.nextLine();
                System.out.println("-=-=-=-=-=- MENU CADASTRO FUNCIONARIO-=-=-=-=-=-");
                System.out.print("Nome do funcionario: ");
                nome = scan1.nextLine();
                System.out.print("Nome da rua: ");
                rua = scan1.nextLine();
                System.out.print("Nome da bairro: ");
                bairro = scan1.nextLine();
                System.out.print("Nome da numero: ");
                num = scan1.nextInt();
                scan1.nextLine();
                System.out.print("Nome da cidade: ");
                cidade = scan1.nextLine();
                System.out.print("CPF: ");
                documento = scan1.nextLine();
                System.out.print("Cargo: ");
                cargo = scan1.nextLine();
                System.out.print("Crie uma senha: ");
                senha = scan1.nextLine();

                Funcionario funcionario = new Funcionario(nome, rua, bairro, num, cidade, documento, cargo, senha);
                cadastros.cadastrarFuncionario(funcionario);
                break;
            case 2:
                System.out.println("-=-=-=-=-=- MENU ALTERA FUNCIONARIO-=-=-=-=-=-");
                cadastros.imprimirFuncionarios();
                System.out.println("Qual funcionario voce gostaria de alterar? ");
                scan1.nextLine();
                busca = scan1.nextLine();
                cadastros.alterarFuncionario(busca);

                break;
            case 3:

                scan1.nextLine();
                System.out.println("-=-=-=-=-=- MENU CADASTRO EMPRESA-=-=-=-=-=-");
                System.out.print("Nome da empresa: ");
                nome = scan1.nextLine();
                System.out.print("Nome da rua: ");
                rua = scan1.nextLine();
                System.out.print("Nome da bairro: ");
                bairro = scan1.nextLine();
                System.out.print("Nome da numero: ");
                num = scan1.nextInt();
                scan1.nextLine();
                System.out.print("Nome da cidade: ");
                cidade = scan1.nextLine();
                System.out.print("CNPJ: ");
                documento = scan1.nextLine();
                System.out.print("Ramo de Atividade: ");
                ramoAtividade = scan1.nextLine();
                System.out.print("Crie uma senha: ");
                senha = scan1.nextLine();

                Empresa empresa = new Empresa(nome, rua, bairro, num, cidade, documento, ramoAtividade, senha);
                cadastros.cadastrarEmpresa(empresa);

                break;
            case 4:
                System.out.println("-=-=-=-=-=- MENU ALTERA EMPRESA-=-=-=-=-=-");
                cadastros.imprimirEmpresas();
                System.out.println("Qual empresa voce gostaria de alterar? ");
                scan1.nextLine();
                busca = scan1.nextLine();
                cadastros.alterarEmpresa(busca);
                
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }while(opcao!=7);
    //scan1.close();

  }*/
}

