package Dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println(">>连接数据库-添加用户<<");
    }
}
