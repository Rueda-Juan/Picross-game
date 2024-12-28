/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.12-rc-1/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Plugin para trabajar con bibliotecas Java
    `java-library`

    // Plugin de Spring Boot
    id("org.springframework.boot") version "3.1.4"

    // Plugin para manejo de dependencias de Spring
    id("io.spring.dependency-management") version "1.1.4"
}

repositories {
    // Repositorio Maven Central para las dependencias
    mavenCentral()
}

dependencies {
    // Starter básico de Spring Boot
    implementation("org.springframework.boot:spring-boot-starter")

    // Starter para aplicaciones web (opcional)
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Starter para persistencia con JPA y base de datos (opcional)
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("org.postgresql:postgresql") // Cambia PostgreSQL por otro driver si usas otra base de datos

    // Dependencias para pruebas con Spring Boot
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // Dependencias opcionales existentes en tu proyecto
    api(libs.commons.math3)
    implementation(libs.guava)

    // Dependencia para pruebas
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    // Configurar la versión de Java
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Cambia la versión si es necesario
    }
}

tasks.named<Test>("test") {
    // Usar JUnit Platform para pruebas
    useJUnitPlatform()
}

