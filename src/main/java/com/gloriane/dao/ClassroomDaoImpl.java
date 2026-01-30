package com.gloriane.dao;

import com.gloriane.model.Classroom;

import java.util.List;
import java.util.Set;

public class ClassroomDaoImpl implements ClassroomDao{
    @Override
    public Classroom save(Classroom classroom) {
        return null;
    }

    @Override
    public Classroom update(Classroom classroom) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Classroom findById(int id) {
        return null;
    }

    @Override
    public List<Classroom> findAll() {
        return List.of();
    }

    @Override
    public List<Classroom> searchAvailable(int minCapacity, Set<String> requiredEquipment, boolean needsAccessibility) {
        return List.of();
    }

    @Override
    public List<Classroom> findAccessible() {
        return List.of();
    }
}
