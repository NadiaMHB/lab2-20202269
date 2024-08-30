package org.example.lab220202269.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
public class GameController {
    @GetMapping("/configurar")
    public String mostrarConfiguracion() {
        return "configuracion";
    }

    @PostMapping("/guardarConfiguracion")
    public String guardarConfiguracion(@RequestParam("tamanoTarjeta") int tamanoTarjeta,
                                       @RequestParam("numTarjetas") int numTarjetas
                                       ) {
        return "configuracion";
    }

}
