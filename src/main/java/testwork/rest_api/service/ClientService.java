package testwork.rest_api.service;

import testwork.rest_api.entity.Client;

public interface ClientService {
    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - ФИО клиента с заданным ID
     */
    String receiveFIO(int id);
}
