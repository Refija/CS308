package com.model;

import javax.persistence.*;

import com.model.account.model.Id;
import com.hellokoding.account.model.ManyToMany;
import com.hellokoding.account.model.User;
import com.model.account.model.GeneratedValue;

import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
	 private Long id;
	    private String name;
	    private Set<User> users;

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @ManyToMany(mappedBy = "roles")
	    public Set<User> getUsers() {
	        return users;
	    }

	    public void setUsers(Set<User> users) {
	        this.users = users;
	    }
}
