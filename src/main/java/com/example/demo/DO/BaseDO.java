package com.example.demo.DO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import java.time.LocalDateTime;
import lombok.Generated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author PiT
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
@SuperBuilder
@FieldNameConstants
public abstract class BaseDO {
//  @Id
//  @GeneratedValue(generator = "snowflakeGenerator", strategy = GenerationType.IDENTITY)
//  @GenericGenerator(
//      name = "snowflakeGenerator",
//      strategy = "com.derui.property.config.IdWorkerGenerator")
//  private Long id;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, updatable = false)
  private Long createdBy;

  @Column(nullable = false, updatable = false)
  private LocalDateTime createdTime;

  private Long updatedBy;
  private LocalDateTime updatedTime;

  @Column(name = "deleted", columnDefinition = "boolean default false")
  private Boolean deleted;

  @PrePersist
  @Generated
  public void prePersist() {
    LocalDateTime now = LocalDateTime.now();
    if (createdTime == null) {
      createdTime = now;
    }
    if (deleted == null) {
      deleted = false;
    }
    if (createdBy == null) {

      if (createdBy == null) {
        createdBy = 0L;
      }
    }
  }

  @PreUpdate
  @Generated
  public void preUpdate() {
    updatedTime = LocalDateTime.now();
    if (updatedBy == null) {
      if (updatedBy == null) {
        updatedBy = 0L;
      }
    }
  }
}
