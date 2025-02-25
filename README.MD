# DDD项目框架模板

## 简介

基于DDD(领域驱动设计)的思想，结合个人理解构建的一个项目模板

## 模块介绍

### boot

    服务应用的启动入口，管理bom依赖等内容.

### interface

    controller、task、mq、provider 入口

### application

    应用的业务编排入口(biz)，事件上下文(cqe)，各种dto.

### infrastructure

    原子化的持久化操作，也就是传统模型中的mapper和xml的实现.

### domain

    业务模型(domain)、持久化(repository)，这里的持久化包含了简单的crud，以及负责的组合的多步骤的crud.

### common
    
    公共常用的组件包

## 模块依赖顺序

1. boot ← interface ← application ← domain ← common
2. infrastructure ← domain ← common
