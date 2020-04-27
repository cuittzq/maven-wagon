#### 使用步骤：

1. 切换分支至`fix/gitee-forbidden`

2. 在`wagon-providers/wagon-http-shared`模块运行
```shell
mvn clean install -Dmaven.test.skip=true
```

3. 切换至`wagon-providers/wagon-http`模块，执行：
```shell
mvn clean package -Dmaven.test.skip=true
```

4. 使用`wagon-providers/wagon-http/target`中的`wagon-http-3.4.1-SNAPSHOT-shaded.jar`替换`MAVEN_HOME/lib/wagon-http-3.3.4-shaded.jar`

5. 在MAVEN_HOME/conf下添加headers.properties文件，配置示例：
```
User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:75.0) Gecko/20100101 Firefox/75.0
test-header=lidelin
```

Note: 已打包的Jar包百度网盘：
链接：https://pan.baidu.com/s/1uIW7rkjUr2SN7JeKl5JK7w 
提取码：e098 
