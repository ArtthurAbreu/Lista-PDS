package criadorAbstrato;

import interfacesProdutos.SaladaIF;
import interfacesProdutos.PaoIF;
import interfacesProdutos.PresuntoIF;
import interfacesProdutos.QueijoIF;

public abstract class SanduicheFactory {

    public abstract PaoIF defineTipoPao();

    public abstract QueijoIF defineTipoQueijo();

    public abstract PresuntoIF defineTipoPresunto();

    public abstract SaladaIF defineTipoSalada();
}
