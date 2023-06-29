package projeto;

public class Endereco {

  protected String rua;
  protected String bairro;
  protected int numero;
  protected String cidade;
  
  public Endereco(String rua, String bairro, int numero, String cidade) {
    this.rua = rua;
    this.bairro = bairro;
    this.numero = numero;
    this.cidade = cidade;
  }
  
  public void setRua(String newVar) {
    rua = newVar;
  }

  public String getRua() {
    return rua;
  }

  public void setBairro(String newVar) {
    bairro = newVar;
  }

  public String getBairro() {
    return bairro;
  }

  public void setNumero(int newVar) {
    numero = newVar;
  }

  public int getNumero() {
    return numero;
  }

  public void setCidade(String newVar) {
    cidade = newVar;
  }

  public String getCidade() {
    return cidade;
  }
  
  public String toString(){
     return "Rua: " + rua + " " +"Numero: " + numero + " " +"Bairro: " + bairro + " " +"Cidade: " + cidade;
  }

}
