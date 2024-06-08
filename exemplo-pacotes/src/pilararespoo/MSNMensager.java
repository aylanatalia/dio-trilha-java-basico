package pilararespoo;

public class MSNMensager extends ServiçoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN messenger");
    }
    
}