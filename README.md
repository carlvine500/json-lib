
修改代码***net.sf.json.JsonConfig.java***
将原来的***import org.apache.commons.collections.map.MultiKeyMap;***
改为***import org.apache.commons.collections4.map.MultiKeyMap;***

将原来的***beanTypeMap.remove( beanClass, propertyType );***
改为***beanTypeMap.removeAll(beanClass, propertyType);***

将原来的***beanKeyMap.remove( beanClass, key );***
改为***beanTypeMap.removeAll(beanClass, key);***