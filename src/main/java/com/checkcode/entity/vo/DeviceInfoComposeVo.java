package com.checkcode.entity.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeviceInfoComposeVo {

    private DeviceIndividualVo deviceInfo;
    private DeviceIndividualDetailVo deviceOtherInfo;

}
