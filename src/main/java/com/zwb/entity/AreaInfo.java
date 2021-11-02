package com.zwb.entity;

import java.io.Serializable;
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
@ApiModel(value="AreaInfo对象", description="")
public class AreaInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "地区编号" , example = "2")
    private String areaId;

    @ApiModelProperty(value = "地区名称")
    private String areaName;


}
