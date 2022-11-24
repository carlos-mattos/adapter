public class ValorAdapter extends ValorFaixaSalarial {

    private Valor valorINSS;

    public ValorAdapter(Valor valorINSS) {
        this.valorINSS = valorINSS;
    }

    public String recuperarAliquota() {
        if (this.getFaixa().equals("Menor que o salario minimo (1212.00)"))
            valorINSS.setContribuicao(7.5);
        else
        if (this.getFaixa().equals("Maior que 1212.00 e menor que 2427.35"))
            valorINSS.setContribuicao(9);
        else
        if (this.getFaixa().equals("Maior que 2437.35 e menor que 3641.03"))
            valorINSS.setContribuicao(12);
        else
        if (this.getFaixa().equals("Maior que 3641.03 e menor que 7087.22"))
            valorINSS.setContribuicao(14);

        return valorINSS.getContribuicao() + "%";
    }

    public void salvarFaixa() {
        if (valorINSS.getContribuicao() == 7.5)
            this.setFaixa("Menor que o salario minimo (1212.00)");
        else
        if (valorINSS.getContribuicao() == 9.0)
            this.setFaixa("Maior que 1212.00 e menor que 2427.35");
        else
        if (valorINSS.getContribuicao() == 12.0)
            this.setFaixa("Maior que 2437.35 e menor que 3641.03");
        else
        if (valorINSS.getContribuicao() == 14.0)
            this.setFaixa("Maior que 3641.03 e menor que 7087.22");
    }

}
