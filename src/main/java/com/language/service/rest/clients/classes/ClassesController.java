package com.language.service.rest.clients.classes;

import com.language.service.service.abs.classes.ClassesService;
import com.language.service.domain.dtos.ClassesDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import com.language.service.common.Constants;
import com.language.service.common.ResponseFactory;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping(Constants.CLIENT_API+ "/classes")
public class ClassesController {
    private static final Logger logger = LoggerFactory.getLogger(ClassesController.class);

    private final ClassesService classesService;
    final ResponseFactory responseFactory;

    public ClassesController(ClassesService classesService, ResponseFactory responseFactory) {
        this.classesService = classesService;
        this.responseFactory = responseFactory;
    }

    @PostMapping(value = "/search")   
    public ResponseEntity<?> search(ClassesDTO request, @PageableDefault Pageable pageable) {
       return responseFactory.success(classesService.search(request, pageable));
    }
    
    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody @Valid ClassesDTO request) {
        return responseFactory.success(classesService.saveClasses(request));
    }
    
    @PostMapping(value = "/update")
    public ResponseEntity<?> update(@RequestBody @Valid ClassesDTO request) {
        return responseFactory.success(classesService.updateClasses(request));
    }
    
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        return responseFactory.success(classesService.deleteClasses(id));
    }
}
