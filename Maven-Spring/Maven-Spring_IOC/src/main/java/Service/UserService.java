package Service;

import Dao.UserDaoImpl;

public class UserService {
    /**
     * 在bean中赋值该属性(需要setter方法)
     */
    private UserDaoImpl userDaoImpl;
    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public void addUser() {
        //原生方式创建对象
        //new UserDaoImpl().addUser();

        //bean中创建对象后
        userDaoImpl.addUser();
    }


}
