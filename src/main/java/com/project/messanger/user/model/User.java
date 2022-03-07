package com.project.messanger.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// JPA를 사용한다면 @Entity 어노테이션을 사용하면 된다.
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int idx;
    private String id;
    private String pwd;
    private String name;
    private String phone;
    private String email;
//   DB에 컬럼이 추가 되어야 한다
    private String role;

    /*
    * idx = PK로 유저구분
    * id = User의 id
    * pwd = User의 password
    * name = User의 이름
    * phone = User의 핸드폰 번호
    * email = User의 email
    * roel = 유저의 사용 권한 (회원가입 시 자동으로 생성이 됨)
    *       이것을 통하여 유저의
    * */
}
