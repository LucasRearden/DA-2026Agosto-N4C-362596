package uy.edu.ort.batallanaval.presenters;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import uy.edu.ort.batallanaval.dtos.InicializarDto;
import uy.edu.ort.batallanaval.dtos.ValorDto;
import uy.edu.ort.batallanaval.excepciones.BatallaNavalException;

/**
 * TEMPORAL: solo para comprobar que el tablero funciona en el proyecto.
 * Se borra cuando empecemos con la Sala de operaciones.
 */
@RestController
@RequestMapping("/prueba")
@Scope("session")
public class PresentadorPrueba {

    @GetMapping("/vistaConectada")
    public Commands inicializarVista() {
        InicializarDto tablero = new InicializarDto(8, 12, "/prueba/clickAguasPropias", "/prueba/clickAguasEnemigas");
        return Commands.create(new Command("inicializar", tablero));
    }

    @PostMapping("/clickAguasPropias")
    public Commands clickAguasPropias(@RequestParam int coordenadaVertical, @RequestParam int coordenadaHorizontal) {
        return Commands.create(new Command("mostrarAguasPropias",
                new ValorDto(coordenadaVertical, coordenadaHorizontal, "barco")));
    }

    @PostMapping("/clickAguasEnemigas")
    public Commands clickAguasEnemigas(@RequestParam int coordenadaVertical, @RequestParam int coordenadaHorizontal)
            throws BatallaNavalException {
        if (coordenadaVertical == 0) {
            throw new BatallaNavalException("Prueba de excepcion: no se puede disparar a la fila 0");
        }
        return Commands.create(new Command("mostrarAguasEnemigas",
                new ValorDto(coordenadaVertical, coordenadaHorizontal, "agua")));
    }
}
