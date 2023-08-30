package com.example.demo.dao;


import com.example.demo.DO.ExpenseDO;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author HWX
 */
public interface ElectricityAndWaterExpenseDAO
    extends JpaRepository<ExpenseDO, Long>, JpaSpecificationExecutor<ExpenseDO> {

  void save(Optional<ExpenseDO> existingExpense);

  Optional<ExpenseDO> findByHouseNumberAndTypeAndTime(String houseNumber, String Type, String time);

}
