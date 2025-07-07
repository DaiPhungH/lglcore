package com.language.service.service.abs.classes;

import com.language.service.rest.dto.response.BaseResponseDTO;
import com.language.service.domain.dtos.ClassesDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClassesService {
    Page<ClassesDTO> search(ClassesDTO classesDTO, Pageable pageable);

    BaseResponseDTO saveClasses(ClassesDTO classesDTO);

    BaseResponseDTO updateClasses(ClassesDTO classesDTO);

    BaseResponseDTO deleteClasses(Long id);

}
