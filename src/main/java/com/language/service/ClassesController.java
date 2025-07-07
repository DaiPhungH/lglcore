//package com.language.service;
//
//import com.language.service.common.ResponseFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/classes")
//public class ClassesController {
//    @Autowired
//    private ClassesMapper classesMapper;
//    @Autowired
//    private ClassesService classesService;
//    @Autowired
//    private ResponseFactory responseFactory;
//
//    @GetMapping("/search-conditions")
//    public ResponseEntity<?> searchByFlexibleConditions(
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String code,
//            @RequestParam(required = false) Long schoolId) {
//
//        List<ClassesDto> result = classesService.findByFlexibleConditions(name, code, schoolId);
//        return responseFactory.success(result);
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<?> addClass(@RequestBody Classes classes) {
//        if (classesService.checkIfClassExists(classes.getName(), classes.getCode(), classes.getSchoolId())) {
//            return ResponseEntity.badRequest().body("Class with the same name and code already exists.");        }
//        ClassesDto savedClass = classesService.saveddd(classes);
//        return responseFactory.success(savedClass);
//    }
//
//
//}
