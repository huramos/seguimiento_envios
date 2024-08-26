package exp1.s3.seguimiento_envios;

import java.util.List;
import java.util.Map;

public class Envio {

    private int idEnvio;
    private String DestinatarioEnvio;
    private String fechaEnvio; /*
                                * si es nuevo debe tener una fecha futura, si es finalizado debe ser fecha
                                * anterior y si es en camino fecha de hoy
                                */
    private String direccionEnvio; /* direcion envio */
    private String estadoEnvio; /* nuevo-- en camino --finalizado */
    private String ubicacionEnvio;

    public Envio(int idEnvio, String destinatarioEnvio, String fechaEnvio, String direccionEnvio,
            String estadoEnvio, String ubicacionEnvio) {
        this.idEnvio = idEnvio;
        DestinatarioEnvio = destinatarioEnvio;
        this.fechaEnvio = fechaEnvio;
        this.direccionEnvio = direccionEnvio;
        this.estadoEnvio = estadoEnvio;
        this.ubicacionEnvio = ubicacionEnvio;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public String getDestinatarioEnvio() {
        return DestinatarioEnvio;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public String getUbicacionEnvio() {
        return ubicacionEnvio;
    }

}
