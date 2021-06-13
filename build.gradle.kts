plugins {
    java
    kotlin("jvm") version "1.5.10"
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "me.nashiroaoi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://m2.dv8tion.net/releases")
    maven("https://jitpack.io")
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("net.dv8tion:JDA:4.3.0_277")
    implementation("com.jagrosh:jda-utilities:3.0.5")
    implementation("com.github.kenglxn.QRGen:javase:2.6.0")
    implementation ("com.squareup.okhttp3:okhttp:4.4.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application{
    mainClass.set("${group}.${rootProject.name}.MainKt")
}