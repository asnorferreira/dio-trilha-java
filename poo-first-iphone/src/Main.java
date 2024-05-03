public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------");
        
        Iphone i = new Iphone("iphone 15", 2023);
        i.onOff();
        
        System.out.println("-------------------------------------------");

        MP3Player mp3 = new MP3Player("Apple Music", null);
        i.conectMp3(mp3);
        i.reproduzirMsc("Warriors");
        
        System.out.println("-------------------------------------------");

        Google web = new Google("about:blank", 1);
        i.acessarSite(web, "https://web.dio.me/home");
        System.out.println("-------------------------------------------");

        Ligacao call = new Ligacao(null);
        i.ligar(call, "11999999999", true);
        System.out.println("-------------------------------------------");

        i.info();
    }
}
