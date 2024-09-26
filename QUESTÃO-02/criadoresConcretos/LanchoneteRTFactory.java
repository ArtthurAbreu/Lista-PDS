package criadoresConcretos;

import criadorAbstrato.SanduicheFactory;
import interfacesProdutos.SaladaIF;
import interfacesProdutos.PaoIF;
import interfacesProdutos.PresuntoIF;
import interfacesProdutos.QueijoIF;
import produtosConcretos.SaladaSemVerdura;
import produtosConcretos.PaoBola;
import produtosConcretos.PresuntoPeru;
import produtosConcretos.QueijoCheddar;

public class LanchoneteRTFactory extends SanduicheFactory {

    @Override
    public PaoIF defineTipoPao() {
        return new PaoBola();
    }

    @Override
    public QueijoIF defineTipoQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public PresuntoIF defineTipoPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public SaladaIF defineTipoSalada() {
        return new SaladaSemVerdura();
    }
}
