package com.atorres.nttdata.clientms.model;

import com.atorres.nttdata.clientms.utils.ClientType;
import lombok.Data;

@Data
public class Client {
    /**.
     * Id del cliente
     */
    private String id;
    /**.
     * Tipos de documento
     */
    private String typeDocument;
    /**.
     * Numero del documento
     */
    private String nroDocument;
    /**.
     * Nombre del cliente
     */
    private String name;
    /**.
     * Tipo del cliente
     */
    private ClientType typeClient;
}
