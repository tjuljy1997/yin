# 异常处理机制









![img](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9naXRlZS5jb20vemhvbmdfc2lydS9pbWFnZXMvcmF3L21hc3Rlci8vaW1nL2ltYWdlLTIwMjAwOTE2MTcxOTM4OTkzLnBuZw?x-oss-process=image/format,png)



`Group`：**项目组织**的唯一标识符

这里介绍两段的用法:第一段为域,第二段为公司名称
域又分为org、com、cn等,其中org为非营利组织,com为商业组织,cn表示中国
例如apache公司的tomcat项目:org.apache.tomcat

- Group是org.apache
- 域是org(tomcat是非营利项目)
- 公司名称是apache
- Artifact是tomcat





Artifact： **项目**的唯一的标识符 

Name：默认同Artifact，声明了一个对于用户更为友好的项目名称，不是必须的

`version`：指定了项目的当前版本，SNAPSHOT意为快照，说明该项目还处于开发中，是不稳定的版本

Description：项目描述

Package name：指定main目录里java下的包名称，默认为Group+Artifact

Packaging：打包方式



















SpringBoot默认异常处理方式

浏览器：返回错误页面

APP：返回错误JSON



缺点





SpringBoot默认异常返回JSON

```JSON
{
    "timestamp": 1666602045192,
    "status": 404,
    "error": "Not Found",
    "message": "No message available",
    "path": "/admin/exceptionTest"
}
```



期望封装格式

```JSON
{
  "data": {}
  "success": true,
  "massage": ""
}
```



解决方法

1. 使用工具类封装
2. 使用全局异常处理兜底

























Mybatis 常见错误



ExecutorException: Statement returned more than one row, where no more than one was expected.





























@Data

@Data = @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode







存在问题：



```Java
@Data
public class User extends BasePOJO{
    private String userName;
    private String password;
}
```













































Lombok



设置注释在代码前显示

![image-20221024163612752](C:\Users\22904\AppData\Roaming\Typora\typora-user-images\image-20221024163612752.png)







Swagger



```xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```













