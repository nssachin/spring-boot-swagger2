package com.sns.swagger2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel(value = "Details about the contact ")
public class Contact {

    @ApiModelProperty(notes = "The unique id of the contact")
    private String id;

    @ApiModelProperty(notes = "The person's name")
    private String name;

    @ApiModelProperty(notes = "The person's phone number")
    private String phone;

}
