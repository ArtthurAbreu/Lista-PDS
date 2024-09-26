package modelo;

import interfacesProdutos.SaladaIF;
import interfacesProdutos.PaoIF;
import interfacesProdutos.PresuntoIF;
import interfacesProdutos.QueijoIF;

public class Sanduiche {
    private PaoIF pao;
    private QueijoIF queijo;
    private PresuntoIF presunto;
    private SaladaIF salada;

    public void setPao(PaoIF pao) {
        this.pao = pao;
    }

    public void setQueijo(QueijoIF queijo) {
        this.queijo = queijo;
    }

    public void setPresunto(PresuntoIF presunto) {
        this.presunto = presunto;
    }

    public void setSalada(SaladaIF salada) {
        this.salada = salada;
    }

    @Override
    public String toString() {
        return "Sanduíche com " + pao.getClass().getSimpleName() + ", " + queijo.getClass().getSimpleName() + ", " + presunto.getClass().getSimpleName() + " e " + salada.getClass().getSimpleName();
    }
}
