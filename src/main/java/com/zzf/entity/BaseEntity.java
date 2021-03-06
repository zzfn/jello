package com.zzf.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @program: jello
 * @author: nanaouyang
 * @create: 2020/03/23 16:50
 */
@Data
public class BaseEntity implements Serializable {

    @TableId(value = "ID",type= IdType.ASSIGN_ID)
    private String id;

    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    @TableField(fill = FieldFill.INSERT,jdbcType= JdbcType.TIMESTAMP)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE,jdbcType= JdbcType.TIMESTAMP,update = "now()")
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer isDelete;
}
