package com.language.service.service.impl.classes;

import com.language.service.domain.mapper.ClassesMapper;
import com.language.service.rest.dto.response.BaseResponseDTO;
import com.language.service.domain.dtos.ClassesDTO;
import com.language.service.domain.entities.Classes;
import com.language.service.repo.jpa.classes.ClassesRepo;
import com.language.service.service.abs.classes.ClassesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.language.service.exception.BusinessException;
import com.language.service.common.Constants;

@Service
public class ClassesServiceImpl implements ClassesService {
    private static final Logger logger = LoggerFactory.getLogger(ClassesServiceImpl.class);
    private final ClassesMapper mapper;
    private final ClassesRepo repo;

    public ClassesServiceImpl(ClassesMapper mapper, ClassesRepo repo) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public BaseResponseDTO saveClasses(ClassesDTO request) {
        try {
            Classes entity = mapper.toEntity(request);
            entity.setStatus(Constants.STATUS.ACTIVE);
            entity.setDeleted(Constants.DELETE.INACTIVE);
            repo.save(entity);
            return new BaseResponseDTO();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public BaseResponseDTO updateClasses(ClassesDTO request) {
        try {
            if (request.getId() == null) throw new BusinessException("Id is required");
            Classes domain = repo.findById(request.getId())
                    .orElseThrow(() -> new BusinessException("Could not find id " + request.getId()));
            Classes entity = mapper.toEntity(request);
            entity.setCreatedBy(domain.getCreatedBy());
            entity.setCreatedDate(domain.getCreatedDate());
            repo.save(entity);
            return new BaseResponseDTO();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public BaseResponseDTO deleteClasses(Long id) {
        try {
            Classes entity = repo.findById(id).orElseThrow(() -> new BusinessException("Could not find id " + id));
            entity.setDeleted(Constants.DELETE.ACTIVE);
            return new BaseResponseDTO();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public Page<ClassesDTO> search(ClassesDTO request, Pageable pageable) {
        try {
            Page<Classes> rs = repo.findAll(pageable);
            return new PageImpl<>(mapper.toDtoList(rs.getContent()), pageable, rs.getTotalElements());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }
}
