public class App {
    public static void main(String[] args){
        // Declara e Instancia um objeto Caneta
        Caneta c1 = new Caneta(); //criação do objeto
        c1.iniciarCaneta("Azul","BIC",1.0); //usa a função de inicialização de objeto

        Caneta c2 = new Caneta();
        c2.iniciarCaneta("Vermelha","Stabillo",0.4);

        //System.out.println("Minha Caneta C1:"+c1.mostrarDados());//não faz sensido usar, somente para Debug
        //System.out.println("Minha Caneta C2:"+c2.mostrarDados());//não faz sensido usar, somente para Debug

        c1.escrever("Ola Mundo o Batman novo é um bom filme");
        c2.escrever("Missão Impossível pode ser mesmo o homem de ferro?");

        c1.escrever("Ola Mundo o Batman novo é um bom filme");
        c2.escrever("Missão Impossível pode ser mesmo o homem de ferro?");

        c1.escrever("Ola Mundo o Batman novo é um bom filme");
        c2.escrever("Missão Impossível pode ser mesmo o homem de ferro?");

        //System.out.println("Minha Caneta C1:"+c1.mostrarDados());//não faz sensido usar, somente para Debug
        //System.out.println("Minha Caneta C2:"+c2.mostrarDados());//não faz sensido usar, somente para Debug

    }
}
