Sistema Bancário
    atributos da conta:
        * numero da conta
        * tipo da conta
        * dono
        * saldo
        * status

    Metodos
        * Abrir conta
        * fechar conta
        * depositar
        * sacar
        * pagamento mensal

    Regras de negócio
        * numConta: inteiro
        * tipo: so pode receber cc: conta corrente ou cp: conta poupança
        * Abrir conta: ao abrir uma conta muda o status para verdadeiro, dizer se uma conta é cc ou cp, se for cc add 50 reais, se for cp add 150 reais
        * Fechar conta: verificar se ainda tem saldo(nao pode ter saldo), se esta devendo ou seja se esta negativo
        * depositar: para realizar um deposito a conta deve estar aberta
        * Sacar: precisa ter a conta aberta ou precisa ter saldo, nao permitir que o saque seja maior que o saldo
        * Pagar mensal: cobrada do saldo, cliente cc paga 12 e cliente cp paga 20