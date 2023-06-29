package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Cadastro {
  private List<Funcionario> funcionarios;
  private List<Empresa> empresas;
  private List<Orcamento> orcamentos;
  public List<Denuncia> denuncias;

  public Cadastro(controlCadastro control, viewCadastro view) {
    funcionarios = new ArrayList<>();
    empresas = new ArrayList<>();
    orcamentos = new ArrayList<>();
    denuncias = new ArrayList<>();
  }

  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(List<Funcionario> newVar) {
    funcionarios = newVar;
  }

  public List<Empresa> getEmpresas() {
    return empresas;
  }

  public void setEmpresas(List<Empresa> newVar) {
    empresas = newVar;
  }

  public void cadastrarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void cadastrarEmpresa(Empresa empresa) {
    empresas.add(empresa);
  }
  
  public List<Denuncia> getDenuncia() {
        return denuncias;
    }

    public void setDenuncia(List<Denuncia> denuncia) {
        this.denuncias = denuncia;
    }

    public void addDenuncia(Denuncia novaDenuncia) {
        denuncias.add(novaDenuncia);
    }
    

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public void addOrcamento(Orcamento novoOrcamento) {
        orcamentos.add(novoOrcamento);
    }
    
  public Funcionario buscarFuncionario(String busca) {
    for (Funcionario funcionario : funcionarios) {
      if (funcionario.getNome().equals(busca)) {
        System.out.println("Funcionário encontrado");
        System.out.println(funcionario);
        return funcionario;
      }
    }
    System.out.println("Funcionário não encontrado");
    return null;
  }

  public Empresa buscarEmpresa(String busca) {
    for (Empresa empresa : empresas) {
      if (empresa.getNome().equals(busca)) {
        System.out.println("Empresa encontrada");
        System.out.println(empresa);
        return empresa;
      }
    }
    System.out.println("Empresa não encontrada");
    return null;
  }
  
  public Empresa buscarEmpresaSenha(String busca) {
    for (Empresa empresa : empresas) {
      if (empresa.getSenha().equals(busca)) {
        System.out.println("Empresa encontrada");
        System.out.println(empresa);
        return empresa;
      }
    }
    System.out.println("Empresa não encontrada");
    return null;
  }
  
  public Funcionario buscarFuncionarioSenha(String busca) {
    for (Funcionario funcionario : funcionarios) {
      if (funcionario.getSenha().equals(busca)) {
        System.out.println("Funcionario encontrada");
        System.out.println(funcionario);
        return funcionario;
      }
    }
    System.out.println("Empresa não encontrada");
    return null;
  }

  public void alterarFuncionario(String nome, Endereco endereco, String documento,String cargo,String senha,Double salario) {
    Funcionario funcionario = buscarFuncionario(nome);
    if (funcionario != null) {
      funcionario.setNome(nome);
      funcionario.setCargo(cargo);
      funcionario.setCpf(documento);
      funcionario.setEndereco(endereco);
      funcionario.setSalario(salario);
      funcionario.setSenha(senha);
        
    } else {
      System.out.println("Funcionário não encontrado");
    }
  }
  
  public String imprimirFuncionarios() {
      StringBuilder resultado = new StringBuilder();
    for (Funcionario funcionario : funcionarios) {
      resultado.append(funcionario.exibirDetalhes());
      resultado.append("\n\n\n");
    }
    return resultado.toString();
  }

  public void alterarEmpresa(String nome,Endereco endereco,String cnpj,String ramo, String senha) {
    Empresa empresa = buscarEmpresa(nome);
    if (empresa != null) {
        empresa.setNome(nome);
        empresa.setCnpj(cnpj);
        empresa.setEndereco(endereco);
        empresa.setRamoAtividade(ramo);
        empresa.setSenha(senha);
        
    } else {
        System.out.println("Empresa não encontrada");
    }
}

  public String imprimirEmpresas() {
    StringBuilder resultado = new StringBuilder();
    for (Empresa empresa : empresas) {
        resultado.append(empresa.toString());
        resultado.append("\n\n");
    }
    return resultado.toString();
}

  public void abrirEmpresa(String tentativa) {
    for (Empresa empresa : empresas) {
      if (empresa.verificarSenha(tentativa)) {
        
      }
    }
    
  }
  
 public String exibirDenuncias() {
    StringBuilder resultado = new StringBuilder();
    for (Denuncia denuncia : denuncias) {
        resultado.append("Denúncia:\n");
        
        Pessoa autor = denuncia.getAutor();
        resultado.append("Autor:\n");
        resultado.append(autor.exibirDetalhes());
        
        resultado.append("\n");
        
        resultado.append("Descrição: ");
        resultado.append(denuncia.getDescricao());
        
        resultado.append("\n\n");
    }
    return resultado.toString();
}

}
