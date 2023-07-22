package com.atorres.nttdata.clientms.mapper;

import com.atorres.nttdata.clientms.model.Client;
import com.atorres.nttdata.clientms.model.ClientPost;
import com.atorres.nttdata.clientms.model.RequestClientUpdate;
import com.atorres.nttdata.clientms.model.dao.ClientDao;
import com.atorres.nttdata.clientms.utils.EnumConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {
    @Autowired
    EnumConverter enumConverter;
    /**.
     * Metodo que transforma Clientepost a ClienteDao
     * @param clientPost clientepost
     * @return clientdao
     */
    public ClientDao clientposttoClientDao(final ClientPost clientPost) {
        ClientDao clientDao = new ClientDao();
        clientDao.setId(generateId());
        clientDao.setName(clientPost.getName());
        clientDao.setTypeDocument(clientPost.getTypeDocument());
        clientDao.setNroDocument(clientPost.getNroDocument());
        clientDao.setTypeClient(enumConverter.toClientType(clientPost.getTypeClient()));
        return clientDao;
    }

    /**.
     * Metodo usado en el Update para actulizar el Client
     * @param clientDao clientpost
     * @param request idcliente
     * @return client
     */
    public ClientDao clientposttoClientDaoUpdate(
            final ClientDao clientDao,
            final RequestClientUpdate  request) {
        clientDao.setName(request.getName());
        clientDao.setTypeDocument(request.getTypeDocument());
        clientDao.setNroDocument(request.getNroDocument());
        return clientDao;
    }

    public Client toClient(ClientDao clientDao){
        Client client = new Client();
        client.setId(clientDao.getId());
        client.setName(clientDao.getName());
        client.setTypeDocument(clientDao.getTypeDocument());
        client.setNroDocument(clientDao.getNroDocument());
        client.setTypeClient(clientDao.getTypeClient());
        return client;
    }

    /**.
     * Metodo para generar un Id aleatorio
     * @return id aleatorio
     */
    private String generateId() {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }
}
