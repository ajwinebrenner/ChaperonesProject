package com.chaperones.user;

import com.chaperones.activity.Activity;

import java.util.List;

public interface UserDAO {
    public int add(User user);
    public List<User> getAll();
    public User getById(Integer id);
    public List<Activity> getActivities(Integer id, boolean cancelled);
    public int updateById(Integer id, User update);
    public int deleteById(Integer id);
    public int addUserToActivity(Integer user_id, Integer activity_id);
    public int getFreeSpaces(Integer activity_id);
    public int removeUserFromActivity(Integer user_id, Integer activity_id);
    public boolean isOnActivity(Integer user_id, Integer activity_id);
    }
