package com.example.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class InicioMB implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Logger logger = LoggerFactory.getLogger(InicioMB.class);

    private String holaMundo = "Inicial otro saludo cambio proxyultimo !";

    @PostConstruct
    public void init() {
        // Hacemos un logeo para revisar que no se este llamando dos veces el
        // Postconstruct
        logger.info("Entra al postconstruct");
        // Inicializamos la variable que mostraremos en la pagina
        holaMundo = "Da clic aqui!";
    }

    /**
     * Metodo que sera llamado desde un boton de la vista Para mostrar que ya esta
     * funcionando el primefaces
     */
    public void saludar() {
        holaMundo = "Hola Mundo christian VSCode!!";
    }

    // <editor-fold desc="Accesores" defaultstate="collapsed">
    public String getHolaMundo() {
        return holaMundo;
    }

    public void setHolaMundo(String holaMundo) {
        this.holaMundo = holaMundo;
    }
}
