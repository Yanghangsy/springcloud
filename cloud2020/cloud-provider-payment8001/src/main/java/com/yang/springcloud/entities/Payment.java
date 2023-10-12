package com.yang.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yanghang
 * @version V1.0
 * @Package com.yang.springcloud.entities
 * @date 2023/10/12 15:10
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
     private Long id;
     private String serial;
}
