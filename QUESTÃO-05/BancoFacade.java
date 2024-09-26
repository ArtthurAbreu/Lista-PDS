public class BancoFacade {  // essa seria a fachada do nosso sistema, onte a complexidade e a comunicacao com o subsistema sera toda feita aqui, como instancia de objetos e chamadas do metodos que foram desenvolvidos para atender o fluxo do sistema
    private Funcionario funcionario;  
    private Salario salario;
    private Pagamento pagamento;

    public BancoFacade() {
        funcionario = new Funcionario(); // faz uma instancia da classe funcionario para poder charmas os metodos que Gerencia informações do funcionário
        salario = new Salario(); // faz uma instancia da classe Salario para  charmar os metodos responsável pelo cálculo dos salários
        pagamento = new Pagamento(); // faz uma instancia da classe Pagamento para chamar metodos que processa os pagamentos
    }

    public void processarOperacoes() { // aqui o facade ( fachada ) cria um metodo que vai fazer a comunicacao com o subsistema e fazer com que o fluxo e as funcionalidades sejam feitas da mesma maneira que chamando um por um, ele vai fazer na ordem que o fluxo tem que ser, nesse exemplo e apenas um metodo que ja resolve tudo porem se fosse um subsistema mais poderiamos dividir em varios metodos chamando outros metodos de outras classes e seria definido a ordem na chamada dos metodos do facade do lado do cliente.
        funcionario.atualizarDados();
        salario.calcularSalario();
        pagamento.processarPagamento();
    }
}