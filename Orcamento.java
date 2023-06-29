package projeto;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

  private int ano;
  private float valor;
  private List<Float> gastos;

  public Orcamento(int ano, float valor) {
        this.ano = ano;
        this.valor = valor;
        this.gastos = new ArrayList<>();
    }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public float getValorTotal() {
    return valor;
  }

  public void setValorTotal(float valorTotal) {
    this.valor = valorTotal;
  }

  public List<Float> getGastos() {
    return gastos;
  }

  public void adicionarGastos(float gasto) {
    gastos.add(gasto);
  }

  public float calcularSaldoDisponivel() {
    float saldoDisponivel = valor;
    for (float gasto : gastos) {
      saldoDisponivel -= gasto;
    }
    return saldoDisponivel;
  }

    
}
