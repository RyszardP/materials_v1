package com.ryszard.repository;

import com.ryszard.domain.Material;

public interface MaterialDao extends GenericDao  {

    Material findByThickness (int thickness);
}
