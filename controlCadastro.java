package projeto;

public class controlCadastro {

  private final Cadastro cadastro;
  private final viewCadastro view;
  private final controlCadastro control;
  
  public controlCadastro() {
    this.control = null;
    this.view = null;
    cadastro = new Cadastro(control, view);
      
  }

  public void cadastrarFuncionario(Funcionario funcionario) {
    cadastro.cadastrarFuncionario(funcionario);
  }

  public void cadastrarEmpresa(Empresa empresa) {
    cadastro.cadastrarEmpresa(empresa);
  }

  public Funcionario buscarFuncionario(String busca) {
    return cadastro.buscarFuncionario(busca);
  }

  public Empresa buscarEmpresa(String busca) {
    return cadastro.buscarEmpresa(busca);
  }

  /*public void alterarFuncionario(String busca) {
    cadastro.alterarFuncionario(busca);
  }

  public void alterarEmpresa(String busca) {
    cadastro.alterarEmpresa(busca);
  }*/

  public void imprimirEmpresas() {
    cadastro.imprimirEmpresas();
  }

}
