package criadoresConcretos;

import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.SaladaIF;
import interfacesProdutos.PaoIF;
import interfacesProdutos.PresuntoIF;
import interfacesProdutos.QueijoIF;
import produtosConcretos.SaladaSemVerdura;
import produtosConcretos.PaoFrances;
import produtosConcretos.PresuntoFrango;
import produtosConcretos.QueijoMussarela;

public class LanchoneteJPFactory extends SanduicheFactory {

    @Override
    public PaoIF defineTipoPao() {
        return new PaoFrances();
    }

    @Override
    public QueijoIF defineTipoQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public PresuntoIF defineTipoPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public SaladaIF defineTipoSalada() {
        return new SaladaSemVerdura();
    }
}
