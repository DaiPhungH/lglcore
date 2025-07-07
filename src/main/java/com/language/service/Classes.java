//package com.language.service;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Size;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.ColumnDefault;
//
//import java.time.Instant;
//import java.time.LocalDate;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "classes", schema = "language_link_dev")
//public class Classes {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", nullable = false)
//    private Long id;
//
//    @Size(max = 500)
//    @Column(name = "CODE", length = 500)
//    private String code;
//
//    @Size(max = 255)
//    @Column(name = "NAME")
//    private String name;
//
//    @ColumnDefault("1")
//    @Column(name = "STATUS")
//    private Integer status;
//
//    @Column(name = "CLASS_GROUP_TYPE")
//    private Integer classGroupType;
//
//    @Column(name = "SCHOOL_ID")
//    private Long schoolId;
//
//    @Size(max = 255)
//    @Column(name = "SOURCE_CLASS")
//    private String sourceClass;
//
//    @Column(name = "ACADEMIC_YEAR_ID")
//    private Long academicYearId;
//
//    @Column(name = "GRADE_ID")
//    private Long gradeId;
//
//    @Column(name = "WORKING_OFFSITE_ID")
//    private Integer workingOffsiteId;
//
//    @Size(max = 255)
//    @Column(name = "CLASSROOM")
//    private String classroom;
//
//    @Size(max = 255)
//    @Column(name = "CURRICULUM")
//    private String curriculum;
//
//    @Column(name = "TOTAL_LESSON_CONTRACT")
//    private Integer totalLessonContract;
//
//    @Column(name = "TOTAL_EXTRA_LESSONS")
//    private Integer totalExtraLessons;
//
//    @Column(name = "BOOK_ID")
//    private Long bookId;
//
//    @Column(name = "TEACHER_ID")
//    private Long teacherId;
//
//    @Column(name = "TA_ID")
//    private Long taId;
//
//    @Size(max = 255)
//    @Column(name = "BUILDING")
//    private String building;
//
//    @Size(max = 255)
//    @Column(name = "FLOOR")
//    private String floor;
//
//    @Size(max = 255)
//    @Column(name = "ROOM_NO")
//    private String roomNo;
//
//    @Column(name = "TOTAL_STUDENT")
//    private Integer totalStudent;
//
//    @Column(name = "TOTAL_CLASSES")
//    private Integer totalClasses;
//
//    @Column(name = "TOTAL_SPECIAL_CLASSES")
//    private Integer totalSpecialClasses;
//
//    @Column(name = "FROM_DATE")
//    private LocalDate fromDate;
//
//    @Column(name = "TO_DATE")
//    private LocalDate toDate;
//
//    @Column(name = "TOTAL_TIME")
//    private Double totalTime;
//
//    @Size(max = 100)
//    @Column(name = "CREATED_BY", length = 100)
//    private String createdBy;
//
//    @ColumnDefault("curdate()")
//    @Column(name = "CREATED_DATE")
//    private Instant createdDate;
//
//    @Size(max = 100)
//    @Column(name = "LAST_MODIFIED_BY", length = 100)
//    private String lastModifiedBy;
//
//    @ColumnDefault("curdate()")
//    @Column(name = "LAST_MODIFIED_DATE")
//    private Instant lastModifiedDate;
//
//    @ColumnDefault("0")
//    @Column(name = "DELETED")
//    private Integer deleted;
//
//    @Size(max = 100)
//    @Column(name = "DELETED_BY", length = 100)
//    private String deletedBy;
//
//    @Column(name = "DELETED_DATE")
//    private Instant deletedDate;
//
//    @Size(max = 1000)
//    @Column(name = "DESCRIPTION", length = 1000)
//    private String description;
//
//
//    public Classes() {
//    }
//
//    public Classes(Long id, String code, String name, Integer status, Integer classGroupType, Long schoolId,
//                   String sourceClass, Long academicYearId, Long gradeId, Integer workingOffsiteId,
//                   String classroom, String curriculum, Integer totalLessonContract, Integer totalExtraLessons,
//                   Long bookId, Long teacherId, Long taId, String building, String floor, String roomNo,
//                   Integer totalStudent, Integer totalClasses, Integer totalSpecialClasses, LocalDate fromDate,
//                   LocalDate toDate, Double totalTime, String createdBy, Instant createdDate,
//                   String lastModifiedBy, Instant lastModifiedDate, Integer deleted,
//                   String deletedBy, Instant deletedDate, String description) {
//        this.id = id;
//        this.code = code;
//        this.name = name;
//        this.status = status;
//        this.classGroupType = classGroupType;
//        this.schoolId = schoolId;
//        this.sourceClass = sourceClass;
//        this.academicYearId = academicYearId;
//        this.gradeId = gradeId;
//        this.workingOffsiteId = workingOffsiteId;
//        this.classroom = classroom;
//        this.curriculum = curriculum;
//        this.totalLessonContract = totalLessonContract;
//        this.totalExtraLessons = totalExtraLessons;
//        this.bookId = bookId;
//        this.teacherId = teacherId;
//        this.taId = taId;
//        this.building = building;
//        this.floor = floor;
//        this.roomNo = roomNo;
//        this.totalStudent = totalStudent;
//        this.totalClasses = totalClasses;
//        this.totalSpecialClasses = totalSpecialClasses;
//        this.fromDate = fromDate;
//        this.toDate = toDate;
//        this.totalTime = totalTime;
//        this.createdBy = createdBy;
//        this.createdDate = createdDate;
//        this.lastModifiedBy = lastModifiedBy;
//        this.lastModifiedDate = lastModifiedDate;
//        this.deleted = deleted;
//        this.deletedBy = deletedBy;
//        this.deletedDate = deletedDate;
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public Integer getClassGroupType() {
//        return classGroupType;
//    }
//
//    public void setClassGroupType(Integer classGroupType) {
//        this.classGroupType = classGroupType;
//    }
//
//    public Long getSchoolId() {
//        return schoolId;
//    }
//
//    public void setSchoolId(Long schoolId) {
//        this.schoolId = schoolId;
//    }
//
//    public String getSourceClass() {
//        return sourceClass;
//    }
//
//    public void setSourceClass(String sourceClass) {
//        this.sourceClass = sourceClass;
//    }
//
//    public Long getAcademicYearId() {
//        return academicYearId;
//    }
//
//    public void setAcademicYearId(Long academicYearId) {
//        this.academicYearId = academicYearId;
//    }
//
//    public Long getGradeId() {
//        return gradeId;
//    }
//
//    public void setGradeId(Long gradeId) {
//        this.gradeId = gradeId;
//    }
//
//    public Integer getWorkingOffsiteId() {
//        return workingOffsiteId;
//    }
//
//    public void setWorkingOffsiteId(Integer workingOffsiteId) {
//        this.workingOffsiteId = workingOffsiteId;
//    }
//
//    public String getClassroom() {
//        return classroom;
//    }
//
//    public void setClassroom(String classroom) {
//        this.classroom = classroom;
//    }
//
//    public String getCurriculum() {
//        return curriculum;
//    }
//
//    public void setCurriculum(String curriculum) {
//        this.curriculum = curriculum;
//    }
//
//    public Integer getTotalLessonContract() {
//        return totalLessonContract;
//    }
//
//    public void setTotalLessonContract(Integer totalLessonContract) {
//        this.totalLessonContract = totalLessonContract;
//    }
//
//    public Integer getTotalExtraLessons() {
//        return totalExtraLessons;
//    }
//
//    public void setTotalExtraLessons(Integer totalExtraLessons) {
//        this.totalExtraLessons = totalExtraLessons;
//    }
//
//    public Long getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Long bookId) {
//        this.bookId = bookId;
//    }
//
//    public Long getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(Long teacherId) {
//        this.teacherId = teacherId;
//    }
//
//    public Long getTaId() {
//        return taId;
//    }
//
//    public void setTaId(Long taId) {
//        this.taId = taId;
//    }
//
//    public String getBuilding() {
//        return building;
//    }
//
//    public void setBuilding(String building) {
//        this.building = building;
//    }
//
//    public String getFloor() {
//        return floor;
//    }
//
//    public void setFloor(String floor) {
//        this.floor = floor;
//    }
//
//    public String getRoomNo() {
//        return roomNo;
//    }
//
//    public void setRoomNo(String roomNo) {
//        this.roomNo = roomNo;
//    }
//
//    public Integer getTotalStudent() {
//        return totalStudent;
//    }
//
//    public void setTotalStudent(Integer totalStudent) {
//        this.totalStudent = totalStudent;
//    }
//
//    public Integer getTotalClasses() {
//        return totalClasses;
//    }
//
//    public void setTotalClasses(Integer totalClasses) {
//        this.totalClasses = totalClasses;
//    }
//
//    public Integer getTotalSpecialClasses() {
//        return totalSpecialClasses;
//    }
//
//    public void setTotalSpecialClasses(Integer totalSpecialClasses) {
//        this.totalSpecialClasses = totalSpecialClasses;
//    }
//
//    public LocalDate getFromDate() {
//        return fromDate;
//    }
//
//    public void setFromDate(LocalDate fromDate) {
//        this.fromDate = fromDate;
//    }
//
//    public LocalDate getToDate() {
//        return toDate;
//    }
//
//    public void setToDate(LocalDate toDate) {
//        this.toDate = toDate;
//    }
//
//    public Double getTotalTime() {
//        return totalTime;
//    }
//
//    public void setTotalTime(Double totalTime) {
//        this.totalTime = totalTime;
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public Instant getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Instant createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public String getLastModifiedBy() {
//        return lastModifiedBy;
//    }
//
//    public void setLastModifiedBy(String lastModifiedBy) {
//        this.lastModifiedBy = lastModifiedBy;
//    }
//
//    public Instant getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(Instant lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public Integer getDeleted() {
//        return deleted;
//    }
//
//    public void setDeleted(Integer deleted) {
//        this.deleted = deleted;
//    }
//
//    public String getDeletedBy() {
//        return deletedBy;
//    }
//
//    public void setDeletedBy(String deletedBy) {
//        this.deletedBy = deletedBy;
//    }
//
//    public Instant getDeletedDate() {
//        return deletedDate;
//    }
//
//    public void setDeletedDate(Instant deletedDate) {
//        this.deletedDate = deletedDate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}