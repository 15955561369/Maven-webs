package Dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;


/**
 * 通过dom4j解析Spring.xml获取bean中的class路径地址
 */
public class Dom4j {
    /**
     * 获取Spring框架配置beans
     * @return 类的完整路径
     * @throws DocumentException
     */
    public String getClassPath() throws DocumentException {
        //从类路径根target/classes读取文件.xml
        InputStream xmlFile = this.getClass().getResourceAsStream("/User.xml");
        SAXReader saxReader = new SAXReader();//调用dom4j
        Document document = saxReader.read(xmlFile);
        //获取到根节点<beans>
        Element rootElement = document.getRootElement();
        //找到<bean>
        Element bean = rootElement.element("bean");
        //获得class路径地址，返回
        String classPath = bean.attributeValue("class");
        return classPath;
    }
}
