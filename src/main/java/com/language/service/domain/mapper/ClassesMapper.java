package com.language.service.domain.mapper;

import com.language.service.domain.dtos.ClassesDTO;
import com.language.service.domain.entities.Classes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClassesMapper {
    ClassesDTO toDto(Classes model);
    List<ClassesDTO> toDtoList(List<Classes> lsModels);
    Classes toEntity(ClassesDTO dto);
    List<Classes> toEntityList(List<ClassesDTO> lsClassesDto);
}
