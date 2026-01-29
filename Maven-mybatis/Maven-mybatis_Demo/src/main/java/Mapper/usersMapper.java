package Mapper;

import UserEntity.UserEntity;

import java.util.List;

/**
 * 接口代理，对应mapper usersMapper
 */
public interface usersMapper {
    List<UserEntity> getByUsers();
}
