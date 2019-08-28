###
sofa-boot官方项目sofaboot-samples/sofaboot-sample-standard文件夹下标准示例项目，不同的是，可以脱离sofa-boot
独立运行。更改了pom依赖，使其脱离sofaboot文件夹，更改了依赖数据库为mysql数据库。
## 快速入门
本文档旨在演示如何在 SOFABoot 多模块中使用数据源，使用 mysql 内存数据库，执行了简单插入、查询、删除的数据库操作。项目的目录结构划分如下：
```text
app
│
├── biz
│   ├── service-impl (模块)
│   └── shared (模块)
│
├── common 
│   ├── dal (模块)
│   └── service 
│       └── facade (模块)
│ 
├── test (模块)
│ 
└── web (模块)
```

上图中未标注 `(模块)` 均为目录，各个模块的作用如下：
- facade (模块)：定义了 `NewsReadService` 和 `NewsWriteService` 两个 JVM 服务接口
- dal (模块)：定义了数据源，数据库配置在web目录的application.properties里，已经设置自动建表
- service-impl (模块): 实现了 `NewsWriteService` 服务接口，并将 dal(模块) 设置为 Parent，通过 Spring 依赖注入的方式引用了 `studentDAO`
- shared (模块): 实现了 `NewsReadService` 服务接口，使用Spring bean方式引用了 `studentDAO`

在这里不详述如何发布引用 JVM 服务，可以参见其他演示工程。这里演示如何运行该 Demo. 在该工程中暴露了4个 Rest 服务：
- `localhost:8080/getOne`：获取一个student
- `localhost:8080/update`: 更新student
- `localhost:8080/add`: 新增student
- `localhost:8080/queryAll`: 查询所有student
##安装步骤
- java8
- 运行mysql `docker run --name some-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.6`
- 登入容器新建test database `docker exec -it some-mysql /bin/bash`
- `mysql -u root -p`
输入123456
- `>create database test;`

然后IDEA运行,会自动在mysql,test db中新建student表，然后即可登陆localhost:8080/add新增student测试。
-  记得运行zookeeper做服务注册中心
- `$ docker image pull zookeeper:3.4.11`
- `$ docker run -i -t  --name my_zookeeper -p2181:2181 -d zookeeper:3.4.11`

##新增功能
- 服务注册zookeeper rpc注册中心,可以跨项目互相调用。
- mysql数据库支持替换h2
- login/getuserinfo的简单session例子。
- 单点的cronjob例子。
- 健康检查模块 详见`http://localhost:8080/actuator/health`
- sofa，rest api 基于jwt验证模块的实现。详见`http://localhost:8341/api/v1/login`