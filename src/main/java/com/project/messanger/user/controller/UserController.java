package com.project.messanger.user.controller;


import com.project.messanger.user.model.Group;
import com.project.messanger.user.model.Promise;
import com.project.messanger.user.model.User;
import com.project.messanger.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    // Test
//    @GetMapping("")
//    public List<User> getAllUsers(){
//        List<User> userList = userService.getAllUsers();
//
//        return userList;
//    }

    @GetMapping("/")
    public @ResponseBody String main(){
        return "main page";
        /*
        * Service 단에서 진행 할 것들!
        * return 타입은 배열?
        * 1. 토큰 인증 진행
        * 2. 인증 성공시 데이터 전달
        * */
    }
    @Secured("ROLE_USER")
    @GetMapping("/user")
    public @ResponseBody String userMain(){


        return "user login success!";
    }

    @Secured("ROLE_USER")
    @PostMapping("/user")
    public @ResponseBody String userMainPost(){

        User user = new User();
        user.setRole("ROLE_USER");
        return "POST >> user login success!";
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/loginForm")
    public @ResponseBody String loginForm(){

        return "loginForm";
        /*
        * 1. 데이터 전달 받음
        * 2. 이 때, JWT 토큰을 만들어야 하나? 헷갈린다....
        * */
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/login")
    public @ResponseBody String login(){

        return "login";
        /*
        * 1. 로그인 페이지 이동
        * */
    }

    @GetMapping("/joinForm")
    public @ResponseBody String joinForm(){

        return "joinForm";
        /*
        * 1. 회원가입 페이지에서 데이터 전달 받음
        * 2. User 객체로 만들어 join()로 전달
        * */
    }

    @GetMapping("/join")
    public @ResponseBody String join(){

        return "join";
        /*
        * 1. joinForm()를 통하여 User객체로 된 데이터를 전달 받음
        * 2. UserService로 데이터를 전달하여 DB에 저장하도록 한다
        * 3. 저장에 성공을 하게되면 로그인페이지로 이동 redirec:loginform
        * */
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/createPromiseForm")
    public @ResponseBody String createPromiseForm(){
        return "createPromise";
        /*
        * 1. 계정 정보, 계정이 속한 그룹 중 약속을 생성할 그룹의 정보를 가져온다
        * 2. 새로운 약속 생성 페이지로 전달
        * */
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/createPromise")
    public @ResponseBody String createPromise(){
        return "createPromise";
        /*
        * 1. 약속 생성 페이지에서 데이터 받음
        * 2. UserService에서 데이터를 DB에 저장
        * 3. 약속 리스트 페이지로 이동  redirect:promiseList
        * */
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/createGroupForm")
    public @ResponseBody String createGroupForm(){
        return "createGroupForm";
        /*
        * 1. 계정 정보 인증 진행
        * 2. 인증이 된다면 새 그룹 만들기 페이지로 이동
        * */
    }

    @Secured("ROLE_USER")
    @GetMapping("/user/createGroup")
    public @ResponseBody String createGroup(){
        return "createGroup";
        /*
        * 1. 음... 사실 이 부분은 groupController에서 진행을 하는게 맞지 않을까?
        * */
    }





//    @GetMapping("/{id}")
//    public User getUser(@PathVariable int id){
//
//        return userService.getUser(id);
//    }
//
//    @GetMapping("/{idx}")
//    public List<Group> getGroup(@PathVariable int idx){
//        System.out.println("idx : " + idx);
//        List<Group> userGroupList = userService.getGroupes(idx);
//
//        return userGroupList;
//    }
//
//    @GetMapping("/{idx}")
//    public List<Promise> getPromise(@PathVariable int idx){
//        System.out.println("idx : " + idx);
//
//        List<Promise> userPromise = userService.getPromise(idx);
//
//        return userPromise;
//    }



}
