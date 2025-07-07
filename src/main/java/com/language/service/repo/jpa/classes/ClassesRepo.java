package com.language.service.repo.jpa.classes;

import com.language.service.domain.entities.Classes;
import com.language.service.repo.dao.classes.ClassesCustomRepo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepo extends JpaRepository< Classes, Long>, ClassesCustomRepo  {
}
