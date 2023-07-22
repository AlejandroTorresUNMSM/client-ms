package com.atorres.nttdata.clientms.model;

import com.atorres.nttdata.clientms.utils.CreateClientType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class ClientPost {
    /**.
     * Tipo del documento
     */
    @NotBlank
    private String typeDocument;
    /**.
     * Numero del documento
     */
    @NotBlank
    private String nroDocument;
    /**.
     * Nombre del cliente
     */
    @NotBlank
    private String name;
    /**.
     * Tipo del cliente
     */
    @NotNull
    @JsonProperty("typeClient")
    private CreateClientType typeClient;

}
