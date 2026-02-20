package service;

import dao.Mayikt_users;
import entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 业务逻辑层
 */
public class UserService {
    private Mayikt_users mayikt_users;
    private SqlSession sqlSession;

    /**
     * 无参构造函数，每次new出UserService时都会自行得到mayikt_users对象
     *
     * @throws IOException
     */
    public UserService() {
        try {
            //加载Mybatis配置文件(自动去resources下查找)
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //获取sqlSession
            sqlSession = sqlSessionFactory.openSession();
            //代理开发模式
            mayikt_users = sqlSession.getMapper(Mayikt_users.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //查询所有用户
    public List<UserEntity> getUsers() {
        return mayikt_users.getUsers();
    }

    //查询单个用户
    public UserEntity findById(Integer id) {
        return mayikt_users.findById(id);
    }

    /**
     * 新增用户
     * @param userEntity
     * @return 受影响行数
     */
    public int insertUser(UserEntity userEntity) {
        int result = mayikt_users.insertUser(userEntity);
        //手动提交事务
        sqlSession.commit();
        return result;
    }

    /**
     * 修改用户
     * @param userEntity
     * @return 受影响行数
     */
    public int updateUser(UserEntity userEntity) {
        int result = mayikt_users.updateUser(userEntity);
        //手动提交事务
        sqlSession.commit();
        return result;
    }

    /**
     * 删除用户
     * @param id
     * @return 受影响行数
     */
    public int deleteUser(Integer id) {
        int result = mayikt_users.deleteUser(id);
        //手动提交事务
        sqlSession.commit();
        return result;
    }
}
