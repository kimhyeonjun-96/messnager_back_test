package com.project.messanger.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private int gidx;
    private int uidx;
    private int pro_idx;
    
    
    /*
    *gidx = 그룹을 구별하기 위한 데이터인데 제약조건을 넣어야 하는지 미정
    * udix = User의 idx로 어떤 유저가 그룹에 속해있는지 확인
    * pro_idx = 그룹에 어떤 약속들이 있는지 확인 가능
    * */

}
