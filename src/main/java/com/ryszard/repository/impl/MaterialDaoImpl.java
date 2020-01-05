package com.ryszard.repository.impl;

import com.ryszard.domain.Material;
import com.ryszard.repository.MaterialDao;

import java.util.List;

public class MaterialDaoImpl implements MaterialDao {

    public static final String MATERIAL_ID = "material_id";
    public static final String TITlE = "title";
    public static final String TYPE = "type";
    public static final String THICKNESS = "thickness";
    public static final String LENGTH = "length";
    public static final  String WIDTH = "width";
    public static final String COLOR = "color";
    public static final String DESCRIPTION = "description";
    public static final String PRICE = "price";
    public static final String COEFFICIENT = "coefficient";

    

    public List findAll() {
        return null;
    }

    public Object findById(Object id) {
        return null;
    }

    public void delete(Object id) {

    }

    public Object save(Object entity) {
        return null;
    }

    public Object update(Object entity) {
        return null;
    }

    public Material findByThickness(int thickness) {
        return null;
    }
}
