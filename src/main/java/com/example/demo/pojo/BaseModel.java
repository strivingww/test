package com.example.demo.pojo;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author PiT
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseModel {
  private Long id;
  private LocalDateTime createdTime;
  private Long createdBy;
  private LocalDateTime updatedTime;
  private Long updatedBy;
  private Boolean deleted;
}
