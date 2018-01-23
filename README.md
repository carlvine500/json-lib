- 处理json-lib反序列化问题https://commons.apache.org/proper/commons-collections/security-reports.html

**修改要点:**
- 源码从官方复制了 json-lib/src/main/java/net/sf/json,json-lib/src/test/java/net/sf/json
- 确保单元测试的正确性,因此复制了官方的测试信赖配置到工程位置 json-lib/src/test/java/net/sf/json
- 升级commons-collections到4.1,把import org.apache.commons.collections 改成import org.apache.commons.collections4
- 如果碰到java.lang.NoClassDefFoundError: org/apache/commons/collections/FastHashMap,修复需要调整依赖包版本到commons-beanutils:1.8.2