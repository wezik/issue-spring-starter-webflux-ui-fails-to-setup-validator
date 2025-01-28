// vim: set expandtab ts=2 sw=2:

plugins {
  java
  id("org.springframework.boot") version "3.4.1"
  id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.8.3")
  implementation("org.springframework.boot:spring-boot-starter-web")
}
