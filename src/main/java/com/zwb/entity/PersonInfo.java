package com.zwb.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zwb
 * @since 2021-10-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PersonInfo对象", description="")
public class PersonInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer personId;

    @ApiModelProperty(value = "人员名称")
    private String personName;

    @ApiModelProperty(value = "户口所在地id" , example = "2")
    private Integer personAreaId;

    @ApiModelProperty(value = "人员年龄" , example = "2")
    private Integer personAge;

    @ApiModelProperty(value = "家庭住址")
    private String personAddress;


}
