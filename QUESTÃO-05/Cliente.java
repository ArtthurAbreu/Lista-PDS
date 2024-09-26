public class Cliente {
    public static void main() {
        BancoFacade facade = new BancoFacade();
        facade.processarOperacoes(); 
    }
}

//ja do lado do cliente o codigo fica bem mais limpo, legivel e organizado alem de diminuir a complexidade, pos aqui ele nao vai precisar instanciar outras clases, vai precisar apenas do facade que faz a comunicacao com todo o resto do sistema. 