/**
 * Project Name:saas-admin-api
 * File Name:LoginRequest.java
 * Package Name:com.saas.admin.domain.request
 * Date:2016年10月19日下午1:40:42
 * Copyright (c) 2016, 蚂上配件 Ltd. All Rights Reserved.
 */
package com.system.domain.request.user;

import com.core.support.web.domain.BaseRequest;
import lombok.Data;

import java.util.Date;

/**
 * ClassName: AdminStaffRequest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 *
 * @author maven
 * @date: 2016年10月26日 下午8:14:22 <br/>
 * @since JDK 1.8
 */
@Data
public class UserRequestDto extends BaseRequest {

    private static final long serialVersionUID = -9182181736766153067L;
    private Integer staffId;
    private String code;
    private String pwd;
    private String staffRoster;
    private String staffName;
    private Integer departId;
    private String staffPost;
    private String staffPhone;
    private String staffEmail;
    private Date insTm;
    private Byte leader;
    private Byte status;
    private String createTime;
    private String updateTime;
    private Integer systemId;
    private String roleIdList;


}
