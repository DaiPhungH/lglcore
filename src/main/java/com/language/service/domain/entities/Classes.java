package com.language.service.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="classes")
public class Classes extends BaseEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="ID")
   private Long id;

   @Column(name="CODE")
   private String code;

   @Column(name="NAME")
   private String name;

   @Column(name="STATUS")
   private Integer status;

   @Column(name="CLASS_GROUP_TYPE")
   private Integer classGroupType;

   @Column(name="SCHOOL_ID")
   private Long schoolId;

   @Column(name="SOURCE_CLASS")
   private String sourceClass;

   @Column(name="ACADEMIC_YEAR_ID")
   private Long academicYearId;

   @Column(name="GRADE_ID")
   private Long gradeId;

   @Column(name="WORKING_OFFSITE_ID")
   private Long workingOffsiteId;

   @Column(name="CLASSROOM")
   private String classroom;

   @Column(name="CURRICULUM")
   private String curriculum;

   @Column(name="TOTAL_LESSON_CONTRACT")
   private Integer totalLessonContract;

   @Column(name="TOTAL_EXTRA_LESSONS")
   private Integer totalExtraLessons;

   @Column(name="BOOK_ID")
   private Long bookId;

   @Column(name="TEACHER_ID")
   private Long teacherId;

   @Column(name="TA_ID")
   private Long taId;

   @Column(name="BUILDING")
   private String building;

   @Column(name="FLOOR")
   private String floor;

   @Column(name="ROOM_NO")
   private String roomNo;

   @Column(name="TOTAL_STUDENT")
   private Integer totalStudent;

   @Column(name="TOTAL_CLASSES")
   private Integer totalClasses;

   @Column(name="TOTAL_SPECIAL_CLASSES")
   private Integer totalSpecialClasses;

   @Column(name="FROM_DATE")
   private Date fromDate;

   @Column(name="TO_DATE")
   private Date toDate;

   @Column(name="TOTAL_TIME")
   private Double totalTime;

   @Column(name="DESCRIPTION")
   private String description;

}
