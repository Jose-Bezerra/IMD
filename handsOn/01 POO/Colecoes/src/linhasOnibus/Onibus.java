package linhasOnibus;

import java.util.Objects;

public class Onibus {
  private String numeroDaLinha;

  public Onibus(String numeroDaLinha) {
    this.numeroDaLinha = numeroDaLinha;
  }

  public String getNumeroDaLinha() {
    return numeroDaLinha;
  }

  public void setNumeroDaLinha(String numeroDaLinha) {
    this.numeroDaLinha = numeroDaLinha;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Onibus that = (Onibus) o;
    return Objects.equals(numeroDaLinha, that.numeroDaLinha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDaLinha);
  }
}
