package com.atorres.nttdata.clientms.model.dao;

import com.atorres.nttdata.clientms.utils.ClientType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("client")
public class ClientDao {
    /**.
     * Id cliente
     */
    @Id
    private String id;
    /**.
     * Tipo del documento
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
