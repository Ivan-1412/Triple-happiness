package com.ivan.happytime.triplehappiness.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ivan
 * @date 2019-03-20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="pic")
@Entity
public class PicPo {

    private Long id;

}
