package pilararespoo;

public class FacebookMensager extends ServiçoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook messenger");
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Facebook messenger");
    }
    
}