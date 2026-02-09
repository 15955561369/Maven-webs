package Entity;

/**
 * Spring的生命周期
 */
public class LifeCycle {
    private String name;
    public LifeCycle() {
        System.out.println("【Spring生命周期-Step1：实例化对象】");
    }

    public void setName(String name) {
        System.out.println("【Spring生命周期-Step2：属性赋值】");
        this.name = name;
    }

    /**
     * 设置初始化方法
     */
    public void init(){
        System.out.println("【Spring生命周期-Step3：初始化】");
    }

    /**
     * 设置销毁方法
     */
    public void destroy(){
        System.out.println("【Spring生命周期-Step5：销毁对象】");
    }

    @Override
    public String toString() {
        return "【Spring生命周期-Step4：正常使用bean对象】";
    }
}
