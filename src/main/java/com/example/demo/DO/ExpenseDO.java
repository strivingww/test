package com.example.demo.DO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * @author HWX
 */
@Table(name = "electricity_water_expense")
@Entity
@DynamicUpdate
@SuperBuilder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SQLDelete(sql = "update electricity_water_expense set deleted = true where id = ?")
@Where(clause = "deleted = false")
@FieldNameConstants
@org.hibernate.annotations.Table(appliesTo = "electricity_water_expense", comment = "水电表费用")
public class ExpenseDO extends BaseDO{

  @Comment("房产编号")
  private String houseNumber;

  @Comment("业主")
  private String ownerName;

  @Comment("业主Id")
  private Long ownerId;

  @Comment("时间（年-月）")
  private String time;

  @Comment("起始读数")
  private Double startNumber;

  @Comment("截至读数")
  private Double endNumber;

  @Comment("预警值")
  private Integer bounds;

  @Comment("应缴金额")
  private Double amountPayable;

  @Comment("用量")
  private Double doSage;

  @Comment("单价，电：元/度 水：元/吨")
  private Double unitPrice;

  @Comment("预充金额")
  private Integer sum;

  @Comment("可用余量")
  private Double margin;

  @Comment("水表/电表")
  private String type;

  @Comment("片区Id")
  private Long areaId;

  @Comment("项目Id")
  private Long projectId;

  @Comment("状态")
  private String status;

  @Comment("审核人")
  private Long reviewBy;

  @Comment("审核时间")
  private LocalDate reviewTime;

  @Comment("提交时间")
  private LocalDate submitTime;

  @Comment("审核意见")
  private String remark;

  @Comment("缴费凭证")
  private Long attachmentId;


}
