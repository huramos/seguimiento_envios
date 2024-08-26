package exp1.s3.seguimiento_envios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvioController {

    private List<Envio> envios = new ArrayList<>();

    public EnvioController() {

        envios.add(new Envio(1, "Hugo", "23/08/2024", "Calle 1, Maipu", "NUEVO", "En Bodega"));
        envios.add(new Envio(2, "Javiera", "23/08/2024", "Calle 2, Las Condes", "NUEVO", "En Bodega"));
        envios.add(new Envio(3, "Maria", "22/08/2024", "Calle 3, Pirque", "FINALIZADO", "Producto/s Entregado/s"));
        envios.add(new Envio(4, "Carlos", "20/08/2024", "Calle 4 Peñalolen", "FINALIZADO", "Producto/s Entregado/s"));
        envios.add(new Envio(5, "Jaime", "21/08/2024", "Calle 5, Colina", "EN_TRAYECTO", "Calle 24, Huechuraba"));
        envios.add(
                new Envio(6, "Arturo", "22/08/2024", "Calle 6, Pudahuel", "EN_TRAYECTO", "Calle 33, Santiago Centro"));
        envios.add(new Envio(7, "Antonio", "24/08/2024", "Calle 7, Vitacura", "EN_TRAYECTO", "Calle 11, Recoleta"));
        envios.add(new Envio(8, "Jose", "24/08/2024", "Calle 8, Macul", "EN_TRAYECTO", "Calle 88, Providencia"));

    }

    @GetMapping("/envios")
    public List<Envio> getEnvios() {
        return envios;
    }

    @GetMapping("/envios/{estado}")
    public List<Envio> getEnvioByEstado(@PathVariable String estado) {
        List<Envio> estadosFiltrados = new ArrayList<>();
        for (Envio envio : envios) {
            if (envio.getEstadoEnvio().equals(estado.toUpperCase())) {
                estadosFiltrados.add(envio);
            }
        }
        return estadosFiltrados;
    }

    @GetMapping("/envios/ubicacion/{id}")
    public Envio getEnvioByUbicacionId(@PathVariable int id) {
        for (Envio envio : envios) {
            if (envio.getIdEnvio() == id) {
                return envio;
            }
        }
        return null;
    }

    @GetMapping("/envios/ubicacionEsp/{id}")
    public String getEnvioByUbicacion(@PathVariable int id) {
        for (Envio envio : envios) {
            if (envio.getIdEnvio() == id) {
                return "La ubicación actual del pedido es: " + envio.getUbicacionEnvio();
            }
        }
        return null;
    }

}
