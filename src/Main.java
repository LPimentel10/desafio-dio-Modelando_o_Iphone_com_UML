public class Main {
    public static void main(String[] args) {
        
        Iphone meuIphone = new Iphone("iPhone 13", "123456789");

        // Testando funcionalidades de ReprodutorMusical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funcionalidades de AparelhoTelefonico
        meuIphone.ligar("987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades de NavegadorNaInternet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}