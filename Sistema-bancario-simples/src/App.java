public class App {
    public static void main(String[] args) throws Exception {
        SistemaBancario conta1 = new SistemaBancario();
        conta1.setTipo("cc");
        conta1.setNumConta(1111);
        conta1.setDono("Jubileu Alfredo da silva");
        conta1.abrirConta();
        conta1.estadoAtual();
        conta1.depositar(300.00);
        conta1.sacar(100.00);
        conta1.pagarMensalidade();
        conta1.estadoAtual();
        conta1.fecharConta();
        conta1.sacar(300.00);

    }
}
