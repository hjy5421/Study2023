plugins {
    id("java")
}

group = "com.multiproject.coffee.api"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(mapOf("path" to ":coffee:protocol")))
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.7")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.0.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.1")
    implementation("com.squareup.retrofit2:converter-jackson:2.9.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("org.testng:testng:7.1.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}