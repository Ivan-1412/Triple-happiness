package com.ivan.happytime.triplehappiness.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author ivan
 * @date 2019-04-02
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserPo {

    private String userId;
    private String userName;
    private String passWord;
    private String nickName;
    private Timestamp timestamp;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registerTime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastLoginTime;
    private String phone;
    private String mail;
    private String remark;


}
