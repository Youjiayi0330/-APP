package com.example.demo.vo;

import com.example.demo.entity.DoctorInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorInfoVo extends DoctorInfo {
    private String nickname;
}
