import javax.lang.model.util.ElementScanner6;

public class Caneta {
    // caracteristicas da caneta - seus atributos
    String modelo;
    String cor;
    double ponta;
    int carga;
    final int CARGA_INICIAL = 100;

    void iniciarCaneta(String cor, String modelo, double ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.carga = CARGA_INICIAL;
    }

    // Compotamentos das canetas - Seus Métodos
    void escrever(String texto){
        for (int i = 0; i <texto.length(); i++){
            if(this.carga > 0){
                System.out.print(texto.charAt(i));
                this.carga -= 1;
            }else{
                System.out.print("\nCANETA SEM CARGA");
                break;
            }
        }
        System.out.println();

        //PRIMEIRA SOLUÇÃO
        // if(texto.length() > this.carga)
        //     System.out.println("CANETA SEM CARGA"); //não precisa abrir chaves pq só tem uma instrução
        // else{ 
        // System.out.println (texto);
        // this.carga -= texto.length();
        // }
    }

    String mostrarDados() {

        return "Modelo:" + this.modelo +
                " - Cor:" + this.cor +
                " - Ponta:" + this.ponta +
                " - Carga:" + this.carga;
    }

}
