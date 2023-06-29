package projeto;

import java.time.LocalDate;
import java.util.*;

public class Denuncia {

  private Pessoa autor;
  private String descricao;
  private Date data;

  public Denuncia(Pessoa autor, String descricao) {
    this.autor = autor;
    this.descricao = descricao;
    this.data = java.sql.Date.valueOf(LocalDate.now());
  }

  public Pessoa getAutor() {
    return autor;
  }

  public void setAutor(Pessoa autor) {
    this.autor = autor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }


}
