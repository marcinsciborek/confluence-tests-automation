plugins {
    id("java")
    id("io.qameta.allure") version "2.11.2"
}

group = "com.confluence"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation("org.assertj:assertj-core:3.25.1")
    testImplementation("io.qameta.allure:allure-junit5:2.17.3")

    implementation("com.microsoft.playwright:playwright:1.40.0")
    implementation("io.qameta.allure:allure-selenide:2.25.0")
    implementation("org.springframework:spring-context:6.1.2")

    compileOnly("org.projectlombok:lombok:1.18.30")

}

tasks.test {
    useTestNG()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.test {
    useJUnitPlatform()
}

extra["confluenceStartPage"] = "https://www.atlassian.com/software/confluence"
