package com.language.service.domain.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassesDTO {
   private Long id;
   private String code;
   private String name;
   private Integer status;
   private Integer classGroupType;
   private Long schoolId;
   private String sourceClass;
   private Long academicYearId;
   private Long gradeId;
   private Long workingOffsiteId;
   private String classroom;
   private String curriculum;
   private Integer totalLessonContract;
   private Integer totalExtraLessons;
   private Long bookId;
   private Long teacherId;
   private Long taId;
   private String building;
   private String floor;
   private String roomNo;
   private Integer totalStudent;
   private Integer totalClasses;
   private Integer totalSpecialClasses;
   @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy",timezone = "Asia/Saigon" )
   private Date fromDate;
   @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy",timezone = "Asia/Saigon" )
   private Date toDate;
   private Double totalTime;
   private String createdBy;
   @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy",timezone = "Asia/Saigon" )
   private Date createdDate;
   private String lastModifiedBy;
   @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy",timezone = "Asia/Saigon" )
   private Date lastModifiedDate;
   private Integer deleted;
   private String deletedBy;
   @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy",timezone = "Asia/Saigon" )
   private Date deletedDate;
   private String description;
}
