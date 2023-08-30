package com.example.demo.pojo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Expense extends BaseModel{
  /**
   * 房产编号
   */
  private String houseNumber;
  /**
   * 业主id
   */
  private Long ownerId;
  /**
   * 业主姓名
   */
  private String ownerName;
  /**
   * 账单时间
   */
  private String billTime;
  /**
   * 起始读数
   */
  private Double startNumber;
  /**
   * 截至读数
   */
  private Double endNumber;
  /**
   * 预警值
   */
  private Integer bounds;
  /**
   * 应缴金额
   */
  private Double amountPayable;
  /**
   * 片区Id
   */
  private Long areaId;
  /**
   * 项目Id
   */
  private Long projectId;
  /**
   * 单价，电： 元/度  水：元/吨
   */
  private Double unitPrice;
  /**
   * 预充金额
   */
  private Integer sum;
  /**
   * 可用余量
   */
  private Double margin;
  /**
   * 类型 水表、电表
   */
  private String type;
  /**
   * 缴费凭证
   */
  private Long attachmentId;
  /**
   * 状态
   */
  private String status;
  /**
   * 审核人
   */
  private Long reviewBy;
  /**
   * 审核时间
   */
  private LocalDate approvalTime;
  /**
   * 提交时间
   */
  private LocalDate submitTime;
  /**
   * 审核评论
   */
  private String remark;
  /**
   *  用量
   */
  private Double doSage;
}
