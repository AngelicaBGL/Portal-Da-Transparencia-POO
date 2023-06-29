package projeto;


import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
    
    

public class Principal{
    

    public static Orcamento orcamento;
    public static Prefeitura apucarana;
    public static controlCadastro control;
    public static viewCadastro view;
    public static Cadastro cadastro;
    public static MenuPrincipal menu1;
    
    public Principal(){
        
        apucarana = new Prefeitura("Prefeitura de Apucarana", "R. Prof. Erasto Gaertner", "Centro", 25, "Apucarana", "(43)4002-8922", "bone");
        orcamento = new Orcamento(2023, 10000000.0f);
        control= new controlCadastro();
        view = new viewCadastro(control);
        cadastro = new Cadastro(control, view);
        menu1 = new MenuPrincipal();
        
        Endereco endereco = new Endereco("Avenida Brasil", "Rosario", 47, "Apucarana");
        
        Empresa empresa1 = new Empresa("Ambev", endereco, "1234", "Producao de Bebidas", "ambev");
        Empresa empresa2 = new Empresa("Carlos Eletronicos", endereco, "5678", "eletronicos", "carlos");
        
        Funcionario funcionario1 = new Funcionario("Mabylly", endereco, "619", "Prefeita", "mabylly", 5000f);
        Funcionario funcionario2 = new Funcionario("Tiago Bonito", endereco, "789", "Secretaria", "tiago", 1000f);
        
        cadastro.cadastrarEmpresa(empresa1);
        cadastro.cadastrarEmpresa(empresa2);
        
        cadastro.cadastrarFuncionario(funcionario1);
        cadastro.cadastrarFuncionario(funcionario2);
        
        menu1.show();
        /*int opcao;
        String senha, nome, cpf;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Escolha a opcao:");
            System.out.println("1- Entrar como Cidadao");
            System.out.println("2- Entrar como Empresa");
            System.out.println("3- Entrar como Funcionario");
            System.out.println("4- Entrar como Prefeitura");
            System.out.println("5- Sair");

            opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao){
                case 1:{
                    System.out.print("Digite seu nome: ");
                    nome = scan.nextLine();
                    System.out.print("Digite seu CPF: ");
                    cpf = scan.nextLine();
                    Cidadao cidadao = new Cidadao(nome, cpf);
                    cidadao.menuCidadao(cadastros);
                    break;
                }
                case 2:{
                    System.out.print("Digite a da sua empresa: ");
                    senha = scan.nextLine();
                    cadastros.abrirEmpresa(senha);
                    break;
                }
                case 3:{
                    
                    break;
                }
                case 4:{
                    System.out.println("Digite a senha: ");
                    senha = scan.nextLine();
                    if(senha.equals(apucarana.getSenha())){
                        
                        apucarana.menuPrefeitura(cadastros);
                    }
                    else{
                        System.out.println("Senha incorreta");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Encerrando Programa");
                    break;
                }
                default:{
                    System.out.println("Opção inválida");
                    break;
                }
            }
        }while(opcao!=5);
        scan.close();*/
    }
    
    public void Iniciar() {
        new Principal();
    }
    
    public String horaSistema() {
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        return horaAtual.format(formatter);
    }
    
    public String getDescricao(){
        return "O projeto do Painel de Transparência consiste em desenvolver uma plataforma online que oferece um ambiente interativo e informativo para a divulgação de dados e informações relevantes sobre uma organização, empresa ou entidade governamental. O objetivo principal é promover a transparência institucional e facilitar o acesso do público às informações-chave relacionadas às atividades e ao desempenho da entidade.";
        
    }
    
    public String getNomeIntegrantes() {
        return "Angelica Luciano e Vitor Viana";
    }
    
     public static List<String> getClasses() {
        List<String> classNames = new ArrayList<>();
        String packageName = "projeto";

        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = packageName.replace('.', '/');
            Enumeration<URL> resources = classLoader.getResources(path);

            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                File directory = new File(resource.getFile());

                if (directory.exists() && directory.isDirectory()) {
                    File[] files = directory.listFiles();

                    if (files != null) {
                        for (File file : files) {
                            String fileName = file.getName();

                            if (fileName.endsWith(".class")) {
                                String className = packageName + '.' + fileName.substring(0, fileName.length() - 6);
                                classNames.add(className);
                            }
                        }
                    }
                }
                System.out.println(classNames);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return classNames;
    }
    
}