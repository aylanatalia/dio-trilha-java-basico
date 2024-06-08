package pilararespoo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServiçoMensagemInstantanea smi = null;
        //Não sabe qual app o usuario vai escolher, mas qualquer um deverá enviar mensagem

        String appEscolhido = "msn";

        if(appEscolhido .equals("msn")){
            smi = new MSNMensager();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMensager();
        }else if(appEscolhido.equals("tlg")){
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
