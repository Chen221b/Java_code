package com.damon.mybatis.example;

public interface RoleMapper {
    public int insertRole(Role role);
    public int deleteRole(Long id);
    public int updateRole(Role role);
    public Role findRole(String roleName);
    public Role getRole(Long id);
}
