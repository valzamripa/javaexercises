    package com.example.demo;
    import java.util.ArrayList;
    import java.util.List;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class UserController {

        private List <User> users = new ArrayList<>(); 

        @PostMapping("/users")
        public List<User> addUsers(@RequestBody List<User> users){
            this.users.addAll (users);
            return users;
        }

        @GetMapping("/users")
        public List<User> getAllUsers (){
            return users;
        }

    }
