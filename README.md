1. mysql 5.7，使用 docker 运行两个不同的实例
2. multiple modules need to compile common <module> first,then execute `mvn install`
3. 使用 canal 进行数据同步，需要使用 deployer 和 adapter，并配置主从数据库信息，执行 sh 文件
4. 参考文献: https://www.icode9.com/content-4-979567.html
5. 原理 https://zqhxuyuan.github.io/2017/10/10/Midd-canal/
6. canal 编译 mvn clean install -Dmaven.test.skip=true -Denv=release