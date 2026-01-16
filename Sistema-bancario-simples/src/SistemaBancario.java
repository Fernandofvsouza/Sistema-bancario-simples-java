public class SistemaBancario {

    public int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;
    private Double valorCc;
    private Double valorCp;

    //Metodo construtor
    public SistemaBancario() {
        this.saldo = 0.0;
        this.status = false;

    }

    //Metodo de abrir conta
    public void abrirConta() {
        setTipo(tipo.toUpperCase());
        setStatus(true);
        if(!getTipo().equals("CC" ) && !getTipo().equals("CP")) {
          return;
        }
        if(tipo.equals("CC")) {
            setSaldo(50.0);
        } else if(tipo.equals("CP")) {
            setSaldo(150.0);
        }
    }
    //Metodo de fechar conta
    public void fecharConta() {
        if(getSaldo() < 0){
            System.out.println(".(Conta com debito. Nao é possivel fechar a conta.)");
        } else if(getSaldo() > 0) {
            System.out.println(".(Conta com saldo positivo. Realize o saque para fechar a conta.)");
        }else{
            setStatus(status = false);
            System.out.println(".(Conta fechada com sucesso.)");
        }

    }

    //Metodo de depositar
    public void depositar(Double valor) {
        if(status){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso, o novo saldo é: " + getSaldo());
        } else {
            System.out.println(".(Impossivel depositar. Conta fechada.)");
        }
    }

    //Metodo de sacar
    public void sacar(Double valor) {
        if(status){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso, o novo saldo é: " + getSaldo());
            } else {
                System.out.println(".Saldo insuficiente para saque.");
            }
        }
    }

    //Metodo de pagar mensalidade
    public void pagarMensalidade() {
        this.valorCc = 12.0;
        this.valorCp = 20.0;
        if(getTipo().equals("CC")) {
            setSaldo(getSaldo() - valorCc);
            System.out.println("Mensalidade de R$12,00 debitada com sucesso. Novo saldo: " + getSaldo());
        }else if(getTipo().equals("CP")) {
            setSaldo(getSaldo() - valorCp);
            System.out.println("Mensalidade de R$20,00 debitada com sucesso. Novo saldo: " + getSaldo());
        }else{
            System.out.println("Tipo de conta invalido.");
        }
                
           
    }

    //Metodo estado atual
    public void estadoAtual() {
        setTipo(tipo.toUpperCase());
        if(!getTipo().equals("CC" ) && !getTipo().equals("CP")) {
          return;
        }else{
        System.out.println("---------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("---------------");
        }
    }



    //Metodos getters e setters
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


}
