plugins {
    kotlin("jvm") version "1.3.21"
    id("nebula.maven-publish") version "10.0.1"
//    id("nebula.kotlin") version "1.3.21"
}

group = "com.tylerthrailkill.helpers"

repositories {
    jcenter { content { excludeGroupByRegex("com\\.github.cesarferreira") } }
    maven {
        url = uri("https://jitpack.io")
        content { includeGroupByRegex("com\\.github.cesarferreira") }
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))

    implementation("io.arrow-kt:arrow-core:0.6.1")
    implementation("io.arrow-kt:arrow-data:0.6.1")
    implementation("io.arrow-kt:arrow-syntax:0.6.1")
    implementation("com.github.cesarferreira:kotlin-pluralizer:0.2.9")
    implementation("com.google.guava:guava:23.3-android")
}
