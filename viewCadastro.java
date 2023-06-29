package projeto;

import java.util.Scanner;

public class viewCadastro {

  private final controlCadastro controller;

  public viewCadastro(controlCadastro control) {
    controller = new controlCadastro();
  }

  private void cadastrarEmpresa(Scanner scanner) {
    System.out.println("----- Cadastro de Empresa -----");
   System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("CPF: ");
     System.out.print("Rua: ");
    String rua = scanner.nextLine();

    System.out.print("Bairro: ");
    String bairro = scanner.nextLine();

    System.out.print("Número: ");
    int numero = scanner.nextInt();
    System.out.print("Cidade: ");
    String cidade = scanner.nextLine();
    String cnpj = scanner.nextLine();
    System.out.print("Cargo: ");
    String ramo = scanner.nextLine();
    System.out.print("Crie uma senha:: ");
    String senha = scanner.nextLine();

    
    //Empresa empresa = new Empresa(nome,rua, bairro, numero, cidade,cnpj, ramo, senha);
    //controller.cadastrarEmpresa(empresa);

    System.out.println("Empresa cadastrada com sucesso!");
    System.out.println("--------------------------------");
  }

  private void buscarFuncionario(Scanner scanner) {
    System.out.println("----- Buscar Funcionário -----");
    System.out.print("Digite o nome do funcionário: ");
    String busca = scanner.nextLine();

    Funcionario funcionario = controller.buscarFuncionario(busca);
    if (funcionario != null) {
      System.out.println("Funcionário encontrado:");
      System.out.println(funcionario);
    } else {
      System.out.println("Funcionário não encontrado.");
    }

    System.out.println("-------------------------------");
  }

  private void buscarEmpresa(Scanner scanner) {
    System.out.println("----- Buscar Empresa -----");
    System.out.print("Digite o nome da empresa: ");
    String busca = scanner.nextLine();

    Empresa empresa = controller.buscarEmpresa(busca);
    if (empresa != null) {
      System.out.println("Empresa encontrada:");
      System.out.println(empresa);
    } else {
      System.out.println("Empresa não encontrada.");
    }

    System.out.println("--------------------------");
  }

  public void alterarFuncionario(String busca){
     Funcionario funcionario = controller.buscarFuncionario(busca);
     MenuAlteraCadastroFuncionario.getInstance();
     
      
      
    /*System.out.println("----- Alterar Funcionário -----");
    System.out.print("Digite o nome do funcionário a ser alterado: ");
    String busca = scanner.nextLine();

    Funcionario funcionario = controller.buscarFuncionario(busca);
    if (funcionario != null) {
      int opcao;
      String altera;
      int troca;

      do {
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1. Nome");
        System.out.println("2. CPF");
        System.out.println("3. Cargo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
          case 1:
            System.out.print("Digite o novo nome: ");
            altera = scanner.nextLine();
            funcionario.setNome(altera);
            break;
          case 2:
            System.out.print("Digite o novo CPF: ");
            altera = scanner.nextLine();
            funcionario.setCpf(altera);
            break;
          case 3:
            System.out.print("Digite o novo cargo: ");
            altera = scanner.nextLine();
            funcionario.setCargo(altera);
            break;
          case 4:
            break;
          default:
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            break;
        }

      } while (opcao != 4);

      System.out.println("Dados do funcionário alterados com sucesso!");
    } else {
      System.out.println("Funcionário não encontrado.");
    }

    System.out.println("--------------------------------");*/
  }

  public void alterarEmpresa(String busca) {
     
     Empresa empresa = controller.buscarEmpresa(busca);
     MenuAlteraCadastroEmpresa.getInstance();
     
   
      
    /*System.out.println("----- Alterar Empresa -----");
    System.out.print("Digite o nome da empresa a ser alterada: ");
    String busca = scanner.nextLine();

    Empresa empresa = controller.buscarEmpresa(busca);
    if (empresa != null) {
      int opcao;
      String altera;
      int troca;

      do {
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1. Nome");
        System.out.println("2. CNPJ");
        System.out.println("3. Ramo de Atividade");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
          case 1:
            System.out.print("Digite o novo nome: ");
            altera = scanner.nextLine();
            empresa.setNome(altera);
            break;
          case 2:
            System.out.print("Digite o novo CNPJ: ");
            altera = scanner.nextLine();
            empresa.setCnpj(altera);
            break;
          case 3:
            System.out.print("Digite o novo ramo de atividade: ");
            altera = scanner.nextLine();
            empresa.setRamoAtividade(altera);
            break;
          case 4:
            break;
          default:
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            break;
        }

      } while (opcao != 4);

      System.out.println("Dados da empresa alterados com sucesso!");
    } else {
      System.out.println("Empresa não encontrada.");
    }

    System.out.println("--------------------------");*/
  }

  private void imprimirEmpresas() {
    System.out.println("----- Lista de Empresas -----");
    controller.imprimirEmpresas();
    System.out.println("----------------------------");
  }
}
