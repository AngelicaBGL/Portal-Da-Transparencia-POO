package projeto;

public class Empresa{

  private String nome;
  private String cnpj;
  private String ramoAtividade;
  private String senha;
  private Endereco endereco;

  public Empresa(String nome,Endereco endereco ,String cnpj, String ramoAtividade, String senha) {
    this.endereco = endereco;
    this.nome = nome;
    this.cnpj = cnpj;
    this.ramoAtividade = ramoAtividade;
    this.senha = senha;
  }

  public String toString() {
      return "Empresa: " + nome + "\nEndereço: " + endereco.toString() + " " + "\nRamo de Atividade: " + ramoAtividade;
  }

  public void setNome(String newVar) {
    nome = newVar;
  }

  public String getNome() {
    return nome;
  }

  public void setCnpj(String newVar) {
    cnpj = newVar;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setRamoAtividade(String newVar) {
    ramoAtividade = newVar;
  }

  public String getRamoAtividade() {
    return ramoAtividade;
  }

  public void setSenha(String newVar) {
    senha = newVar;
  }

  public String getSenha() {
    return senha;
  }
  
  public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

  public boolean verificarSenha(String tentativa){
    if(tentativa.equals(senha)){
      return true;
    }
    else{
      return false;
    }
  }

}
