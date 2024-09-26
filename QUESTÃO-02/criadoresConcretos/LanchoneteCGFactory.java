package criadoresConcretos;

import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.SaladaIF;
import interfacesProdutos.PaoIF;
import interfacesProdutos.PresuntoIF;
import interfacesProdutos.QueijoIF;
import produtosConcretos.SaladaSemVerdura;
import produtosConcretos.PaoIntegral;
import produtosConcretos.PresuntoFrango;
import produtosConcretos.QueijoPrato;

public class LanchoneteCGFactory extends SanduicheFactory {

    @Override
    public PaoIF defineTipoPao() {
        return new PaoIntegral();
    }

    @Override
    public QueijoIF defineTipoQueijo() {
        return new QueijoPrato();
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
