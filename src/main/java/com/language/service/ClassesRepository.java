//package com.language.service;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface ClassesRepository extends JpaRepository<Classes,Long> {
//
//
//
//    @Query("SELECT c FROM Classes c " +
//            "WHERE (:name IS NULL OR c.name = :name) " +
//            "AND (:code IS NULL OR c.code = :code) " +
//            "AND (:schoolId IS NULL OR c.schoolId = :schoolId)")
//    List<ClassesDto> findByFlexibleConditions(@Param("name") String name,
//                                           @Param("code") String code,
//                                           @Param("schoolId") Long schoolId);
//
//
//    boolean existsByNameAndCodeAndSchoolId(String name, String code, Long schoolId);
//
//    @Query("SELECT COUNT(c) > 0 FROM Classes c " +
//            "WHERE c.name = :name AND c.code = :code AND c.schoolId = :schoolId " +
//            "AND c.id <> :id")
//    boolean existsDuplicateOnUpdate(@Param("id") Long id,
//                                    @Param("name") String name,
//                                    @Param("code") String code,
//                                    @Param("schoolId") Long schoolId);
//
//}
