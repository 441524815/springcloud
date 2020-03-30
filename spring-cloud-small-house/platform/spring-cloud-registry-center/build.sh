#!/usr/bin/env bash

mvn clean package -Dmaven.test.skip=true -U

docker build -t hub.c.163.com/caochubpeng2587/eureka .

docker push hub.c.163.com/caochubpeng2587/eureka