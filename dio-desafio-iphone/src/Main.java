public class Main {
    public static void main(String[] args) {
        MeuReprodutor reprodutor = new MeuReprodutor();
        reprodutor.selecionarMusica("Minha Música Favorita");
        reprodutor.tocar();
        reprodutor.pausar();

        MeuTelefone telefone = new MeuTelefone();
        telefone.ligar("1234-5678");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        MeuNavegador navegador = new MeuNavegador();
        navegador.exibirPagina("www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
