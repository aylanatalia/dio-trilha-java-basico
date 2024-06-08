package pilararespoo;

public class TelegramMessenger extends ServiçoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram messenger");
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Telegram messenger");
    }
    
    
}