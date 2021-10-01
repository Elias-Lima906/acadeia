package expetion;

public class BusinessException extends Exception {

    private String mensagem;

    public BusinessException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
