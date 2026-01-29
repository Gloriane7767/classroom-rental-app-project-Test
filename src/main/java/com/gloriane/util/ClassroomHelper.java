package com.gloriane.util;

import com.gloriane.model.Classroom;

import java.util.Set;

public final class ClassroomHelper {

    private ClassroomHelper() {
        // utility class
    }

    public static void addEquipment(Classroom classroom, String equipmentItem) {
        Set<String> equipment = classroom.getEquipment();
        equipment.add(equipmentItem);
        classroom.setEquipment(equipment);
    }

    public static void removeEquipment(Classroom classroom, String equipmentItem) {
        Set<String> equipment = classroom.getEquipment();
        equipment.remove(equipmentItem);
        classroom.setEquipment(equipment);
    }

    public static boolean hasEquipment(Classroom classroom, String equipmentItem) {
        return classroom.getEquipment().contains(equipmentItem);
    }

    public static boolean hasAllEquipment(Classroom classroom, Set<String> requiredEquipment) {
        if (requiredEquipment == null) return true;
        return classroom.getEquipment().containsAll(requiredEquipment);
    }

    public static boolean meetsRequirements(Classroom classroom, int minCapacity, Set<String> requiredEquipment, boolean needsAccessibility) {
        boolean capacityOk = classroom.getCapacity() >= minCapacity;
        boolean equipmentOk = (requiredEquipment == null || requiredEquipment.isEmpty()) || hasAllEquipment(classroom, requiredEquipment);
        boolean accessibilityOk = !needsAccessibility || classroom.isAccessible();
        return capacityOk && equipmentOk && accessibilityOk;
    }
}