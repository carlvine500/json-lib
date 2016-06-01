该代码目标是解决commons-collections.jar的Java反序列化漏洞
参考url:https://security.tencent.com/index.php/blog/msg/97
解决步骤:
用commons-collections4-4.1.jar重新编译json-lib,自定义版本号为2.4.1(官方没有该版本,我自己瞎写的)
打好的json-lib-2.4.1.jar放入项目暂时无发现异常.

修改代码描述:
修改代码net.sf.json.JsonConfig.java
将原来的import org.apache.commons.collections.map.MultiKeyMap;
改为import org.apache.commons.collections4.map.MultiKeyMap;

将原来的beanTypeMap.remove( beanClass, propertyType );
改为beanTypeMap.removeAll(beanClass, propertyType);

将原来的beanKeyMap.remove( beanClass, key );
改为beanTypeMap.removeAll(beanClass, key);
"