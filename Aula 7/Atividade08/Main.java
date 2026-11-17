public class Main {
    public static void main(String[] args) {
        Notificador[] canais = {new EmailNotificador(), new SmsNotificador(), new WhatsAppNotificador()};
        for (Notificador canal : canais) { new VendaService(canal).realizarVenda(); }
    }
}
