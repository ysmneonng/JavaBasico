package Exercicios.TVSmart;

public class UsuarioTV {
    
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada" + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada" + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
    }
}
