package com.ari.mybatis.dao;

import com.ari.mybatis.bean.Good;
import com.ari.mybatis.bean.OrderList;

public interface OrderListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    int insert(OrderList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    int insertSelective(OrderList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    OrderList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    int updateByPrimaryKeySelective(OrderList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderlist
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    int updateByPrimaryKey(Good id);
}