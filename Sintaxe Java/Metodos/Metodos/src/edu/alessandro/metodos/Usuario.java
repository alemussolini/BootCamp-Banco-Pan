package edu.alessandro.metodos;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarCanal(41);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);



    }
}
