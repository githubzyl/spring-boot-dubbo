# spring-boot-dubbo
spring-boot-dubbo-api是公共接口
spring-boot-dubbo-provider是接口实现者
spring-boot-dubbo-consumer是接口调用者
运行过程：
1、下载安装zookeeper（版本最好是3.4.10）
2、启动spring-boot-dubbo-provider
3、启动spring-boot-dubbo-consumer
4、在浏览器输入http://localhost:8080/dubbo/index/{word},{word}是参数，会看到浏览器输出“Hello，{word}”
