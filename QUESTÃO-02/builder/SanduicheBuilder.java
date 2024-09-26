package builder;

import criadorAbstrato.SanduicheFactory;
import modelo.Sanduiche;
import interfacesProdutos.SaladaIF;
import interfacesProdutos.PaoIF;
import interfacesProdutos.PresuntoIF;
import interfacesProdutos.QueijoIF;

public class SanduicheBuilder {
    public Sanduiche montaSanduiche(SanduicheFactory factory) {
        PaoIF pao = factory.defineTipoPao();
        QueijoIF queijo = factory.defineTipoQueijo();
        PresuntoIF presunto = factory.defineTipoPresunto();
        SaladaIF salada = factory.defineTipoSalada();

        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setPao(pao);
        sanduiche.setQueijo(queijo);
        sanduiche.setPresunto(presunto);
        sanduiche.setSalada(salada);

        return sanduiche;
    }
}
