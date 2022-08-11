package com.itheima.xmlparse.DTD;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lina @date 2022/8/814:34
 */
public class xmlParse {
    public static void main(String[] args) throws DocumentException {
//        利用dom4j解析xml文件
//        获取整个文档的对象，也就是document的对象
//        获取解析器对象
        SAXReader saxReader = new SAXReader();
//        利用解析器把xml文件加载到内存中，并返回一个文档对象
        Document document = saxReader.read(new File("F:\\date\\xml\\student.xml"));
//          获取到他的根标签
        Element rootElement = document.getRootElement();
//        通过根标签获取student标签
//        elements();可以获取调用者所有的子标签，会把这些子标签放到一个集合中返回
        List<Element> elements = rootElement.elements();
//      用来装学生对象的
        ArrayList<Student> list = new ArrayList<>();
//        带参，想获得什么就写什么
//        elements("标签名")：可以获取调用者所有的指定的子标签，会把这些子标签放到一个集合中并返回
        System.out.println(elements.size());
        List student = rootElement.elements("student");
        System.out.println(student.size());
//        遍历集合得到每一个子标签
        for (Element element : elements) {
//            element依次表示每一个子标签
            System.out.println(element);
//            获得子标签的属性id
            Attribute id = element.attribute("id");
            String value = id.getValue();
            System.out.println(value);
//            获取name标签
            // element("标签名")：获取调用者指定的子标签
            Element name = element.element("name");
//            获取这个标签体的内容
            String text = name.getText();
            System.out.println(text);
            Element age = element.element("age");
            String text1 = age.getText();
            System.out.println(text1);
            Student student1 = new Student(value, text, Integer.parseInt(text1));
            list.add(student1);
//            遍历操作
            for (Student student2 : list) {
                System.out.println(student2  );
            }

        }
    }
}
