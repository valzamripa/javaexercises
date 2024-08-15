    package com.example.demo;

    public class User {
        private String name;
        private String email;
        private int mosha;

        //LISTA
        public User(){}

        public User (String name, String email,int mosha) {
            this.name = name;
            this.email = email;
        }

        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
    }
    public int getMosha(){
        return mosha;
}


    public void setName(String name){
            this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setMosha(int mosha){
        this.mosha = mosha;
    }

    }
