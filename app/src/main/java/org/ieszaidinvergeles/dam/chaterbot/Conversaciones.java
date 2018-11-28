package org.ieszaidinvergeles.dam.chaterbot;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class Conversaciones {

    private long id;
    private String fecha;

    public Conversaciones(){
        this(0, "");
    }

    public Conversaciones(long id, String fecha){
        this.id = id;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public Conversaciones setId(long id) {
        this.id = id;
        return this;
    }

    public String getFecha() {
        return fecha;
    }

    public Conversaciones setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("fecha", fecha);
        return result;
    }


}
