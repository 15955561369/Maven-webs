package Entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean：返回类型和Bean的类型可以不一致
 */
public class Bean implements FactoryBean{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getObject() throws Exception {
        //返回类型设置为BookEntity
        return new BookEntity();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
