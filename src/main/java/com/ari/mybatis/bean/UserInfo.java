package com.ari.mybatis.bean;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userid
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.useraccout
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    private String useraccout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userpassword
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    private String userpassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userid
     *
     * @return the value of userinfo.userid
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userid
     *
     * @param userid the value for userinfo.userid
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.useraccout
     *
     * @return the value of userinfo.useraccout
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    public String getUseraccout() {
        return useraccout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.useraccout
     *
     * @param useraccout the value for userinfo.useraccout
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    public void setUseraccout(String useraccout) {
        this.useraccout = useraccout == null ? null : useraccout.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userpassword
     *
     * @return the value of userinfo.userpassword
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userpassword
     *
     * @param userpassword the value for userinfo.userpassword
     *
     * @mbggenerated Sun Jun 06 14:27:50 CST 2021
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }
}