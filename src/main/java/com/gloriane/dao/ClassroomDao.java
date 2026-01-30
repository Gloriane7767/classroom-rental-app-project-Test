package com.gloriane.dao;

import com.gloriane.model.Classroom;

import java.util.List;
import java.util.Set;

public interface ClassroomDao {
    Classroom save(Classroom classroom);
    Classroom update(Classroom classroom);
    boolean delete(int id);
    Classroom findById(int id);
    List<Classroom> findAll();
    List<Classroom> searchAvailable(int minCapacity, Set<String> requiredEquipment, boolean needsAccessibility);
    List<Classroom> findAccessible();
}
