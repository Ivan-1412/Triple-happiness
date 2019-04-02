package com.ivan.happytime.triplehappiness.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ivan
 * @date 2019-04-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MoodPo {

    private int moodId;
    private String userId;
    private String content;
    private String pic;
    private Boolean secret;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;


}
