package com.xavcaj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para recibir la petición REST y procesarla.
 * 
 * @author Xavier Cajas
 */
@RestController
@RequestMapping("/cedula")
public class CedulaController {

    /**
     * Valida una cedula ecuatoriana con un mecanismo de validacion de digito
     * verificador.
     * 
     * @param cedula Cedula a validar
     * @return Texto con el resultado de la validacion
     */
    @RequestMapping(method = RequestMethod.GET, value = "/validar", produces = "text/plain")
    public String validar(@RequestParam("cedula") String cedula) {
        // Validar si se recibio un numero:
        try {
            Integer.parseInt(cedula);
        } catch (NumberFormatException e) {
            return "ERROR: El parametro enviado no es un número";
        }

        // Validar con el algoritmo de verificacion:
        boolean esValida = Validador.validarCedula(cedula);

        if (esValida) {
            return "La cedula es valida: " + cedula;
        } else {
            return "La cedula NO es valida: " + cedula;
        }
    }
}