package testwork.rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import testwork.rest_api.entity.Client;
import testwork.rest_api.service.Impl.ClientServiceImpl;
@RestController
public class ClientController {
    private final ClientServiceImpl clientServiceImpl;

    @Autowired
    public ClientController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<String> read(@PathVariable(name = "id") int id) {

        final String fio = clientServiceImpl.receiveFIO(id);

        return fio != null
                ? new ResponseEntity<>(fio, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}