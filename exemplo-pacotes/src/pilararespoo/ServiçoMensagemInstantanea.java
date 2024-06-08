package pilararespoo;

public abstract class ServiçoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    //somente os filhos poderão ter acesso a esse método
    protected void validarConexao(){
        System.out.println("Validando sua conexão com a internet");
    }
}
