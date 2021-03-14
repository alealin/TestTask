package testwork.rest_api.entity;

public class Client {
    private Integer id;
    private String fio;

    public Client(Integer id, String fio) {
        this.id = id;
        this.fio = fio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                '}';
    }
}
