package com.ivan.happytime.triplehappiness.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @author ivan
 * @date 2019-04-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClassPo {

    private int classId;
    private int classPId;
    private String className;
    private String classType;//相册|日志
    private Boolean secret;

}
