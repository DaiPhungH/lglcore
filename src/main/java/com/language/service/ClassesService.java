//package com.language.service;
//
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ClassesService {
//    @Autowired
//    private ClassesRepository classesRepository;
//
//    public ClassesDto saveddd(ClassesDto classes) {
//        if (classes.getId() == null) {
//            // THÊM MỚI → kiểm tra tồn tại theo name + code + schoolId
//            boolean exists = classesRepository.existsByNameAndCodeAndSchoolId(
//                    classes.getName(), classes.getCode(), classes.getSchoolId());
//
//            if (exists) {
//                throw new RuntimeException("Lớp học đã tồn tại với các thông tin này.");
//            }
//
//            return classesRepository.save(classes);
//        } else {
//            // CẬP NHẬT
//            Classes existingClass = classesRepository.findById(classes.getId())
//                    .orElseThrow(() -> new RuntimeException("Không tìm thấy lớp học với ID: " + classes.getId()));
//            existingClass.setName(classes.getName());
//            existingClass.setCode(classes.getCode());
//            existingClass.setSchoolId(classes.getSchoolId());
//            return classesRepository.save(existingClass);
//        }
//    }
//
//    public List<ClassesDto> findByFlexibleConditions(String name, String code, Long schoolId) {
//        return classesRepository.findByFlexibleConditions(name, code, schoolId);
//    }
//
//    public boolean checkIfClassExists(String name, String code, Long schoolId) {
//        return classesRepository.existsByNameAndCodeAndSchoolId(name, code, schoolId);
//    }
//
//    public Classes update(Classes classes) {
//        // Kiểm tra xem lớp học có tồn tại để cập nhật không
//        Classes existingClass = classesRepository.findById(classes.getId())
//                .orElseThrow(() -> new RuntimeException("Không tìm thấy lớp học với ID: " + classes.getId()));
//
//        // Kiểm tra trùng name + code + schoolId nhưng là lớp khác
//        boolean isDuplicate = classesRepository.existsDuplicateOnUpdate(
//                classes.getId(), classes.getName(), classes.getCode(), classes.getSchoolId());
//
//        if (isDuplicate) {
//            throw new RuntimeException("Lớp học đã tồn tại với thông tin này.");
//        }
//
//        // Tiến hành cập nhật
//        existingClass.setName(classes.getName());
//        existingClass.setCode(classes.getCode());
//        existingClass.setSchoolId(classes.getSchoolId());
//
//        return classesRepository.save(existingClass);
//    }
//
//}
