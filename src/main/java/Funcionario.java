public class Funcionario {

    Valor valor;
    ValorAdapter persistencia;

    public Funcionario() {
        valor = new ValorINSS();
        persistencia = new ValorAdapter(valor);
    }

    public void setValorAliquota(double aliquota) {
        valor.setContribuicao(aliquota);
        persistencia.salvarFaixa();
    }

    public String getAliquota() {
        return persistencia.recuperarAliquota();
    }

    public String getFaixa() {
        return persistencia.getFaixa();
    }

}
