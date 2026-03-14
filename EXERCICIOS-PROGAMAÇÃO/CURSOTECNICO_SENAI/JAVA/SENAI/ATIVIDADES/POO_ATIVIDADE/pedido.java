package POO_ATIVIDADE;

public class pedido {
    private String codigo;
    private POO_ATIVIDADE.status status;

    public pedido(String codigo, POO_ATIVIDADE.status status) {
        this.codigo = codigo;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public POO_ATIVIDADE.status getStatus() {
        return status;
    }
}

