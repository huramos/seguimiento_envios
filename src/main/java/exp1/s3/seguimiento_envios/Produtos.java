package exp1.s3.seguimiento_envios;

public class Produtos {

    private int idSProducto;
    private String nombreProducto;

    public Produtos(int idSProducto, String nombreProducto) {
        this.idSProducto = idSProducto;
        this.nombreProducto = nombreProducto;
    }

    public int getIdSProductoo() {
        return idSProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

}
