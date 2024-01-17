package com.confluence.model;

    public enum AtlassianUsers {
        USER("testerqajava@gmail.com", "SavePassword!");

        private final String userName;
        private final String password;


        private AtlassianUsers(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return this.userName;
        }

        public String getPassword() {
            return this.password;
        }
    }

