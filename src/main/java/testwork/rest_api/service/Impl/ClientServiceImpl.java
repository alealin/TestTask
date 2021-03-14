package testwork.rest_api.service.Impl;

import org.springframework.stereotype.Service;
import testwork.rest_api.entity.Client;
import testwork.rest_api.service.ClientService;

import java.util.HashMap;
import java.util.Map;
@Service
public class ClientServiceImpl implements ClientService {

    // Хранилище клиентов
    private static final Map<Integer, Client> rep = new HashMap<>();

    public static Map<Integer, Client> getRep() {
        return rep;
    }

    @Override
    public String receiveFIO (int id) {
        return rep.get(id).getFio();
    }
}