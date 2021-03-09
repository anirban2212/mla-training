package com.mphasis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_table")
public class Admin {
		@Id
	    @GeneratedValue
        private long admin_id;
        private String admin_username;
        private String admin_password;
        
        public Admin() {
            super();
        }
        public long getAdmin_id() {
            return admin_id;
        }
        public void setAdmin_id(long admin_id) {
            this.admin_id = admin_id;
        }
        public String getAdmin_username() {
            return admin_username;
        }
        public void setAdmin_username(String admin_username) {
            this.admin_username = admin_username;
        }
        public String getAdmin_password() {
            return admin_password;
        }
        public void setAdmin_password(String admin_password) {
            this.admin_password = admin_password;
        }
        public Admin(long admin_id, String admin_username, String admin_password) {
            super();
            this.admin_id = admin_id;
            this.admin_username = admin_username;
            this.admin_password = admin_password;
        }
        @Override
        public String toString() {
            return "Admin [admin_id=" + admin_id + ", admin_username=" + admin_username + ", admin_password="
                    + admin_password + "]";
        }
    

}


