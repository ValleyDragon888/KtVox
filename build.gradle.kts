plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "me.simonflint"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.sun.jna:jna:3.0.9")
    implementation("org.jline:jline:3.24.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}