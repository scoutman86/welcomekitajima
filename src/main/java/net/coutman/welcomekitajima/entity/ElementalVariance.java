package net.coutman.welcomekitajima.entity;

import java.util.HashMap;
import java.util.Map;

public enum ElementalVariance {
    PYRO("pyro"),
    HYDRO("hydro"),
    ANEMO("anemo"),
    ELECTRO("electro"),
    DENDRO("dendro"),
    CRYO("cryo"),
    GEO("geo");

    private static final Map<String, ElementalVariance> BY_ID = new HashMap<>();

    static {
        for (ElementalVariance variant : values()) {
            BY_ID.put(variant.getId(), variant);
        }
    }

    private final String id;

    ElementalVariance(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static ElementalVariance byId(String id) {
        return BY_ID.getOrDefault(id, PYRO);
    }
}