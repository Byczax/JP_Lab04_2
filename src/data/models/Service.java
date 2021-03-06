package data.models;

import java.util.UUID;

public class Service extends Data {

    public Service(String name, String description) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    public Service(UUID uuid, String name, String description) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getUUID() {
        return uuid;
    }

}
