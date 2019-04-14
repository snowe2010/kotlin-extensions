import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.21"
    id("nebula.maven-publish") version "10.0.1"
//    id("nebula.kotlin") version "1.3.21"
//    id("ch.tutteli.spek") version "0.21.0"
}

group = "com.tylerthrailkill.helpers"

val spekVersion = "2.0.2"
allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "nebula.maven-publish")
//    apply(plugin =  "ch.tutteli.spek")

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
        testImplementation(kotlin("reflect"))

        testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spekVersion") {
            exclude(group = "org.jetbrains.kotlin")
        }
        testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:$spekVersion") {
            exclude(group = "org.junit.platform")
            exclude(group = "org.jetbrains.kotlin")
        }
        testImplementation("com.beust:klaxon:5.0.1") // used to parse naughty list
        testImplementation(group = "org.junit.platform", name = "junit-platform-engine", version = "1.3.0-RC1")
//        testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:$kotlin_version")
        implementation("io.arrow-kt:arrow-core:0.6.1")
        implementation("io.arrow-kt:arrow-data:0.6.1")
        implementation("io.arrow-kt:arrow-syntax:0.6.1")
        implementation("com.github.cesarferreira:kotlin-pluralizer:0.2.9")
        implementation("com.google.guava:guava:23.3-android")
    }
    
    tasks{
        withType<Wrapper> {
            distributionType = Wrapper.DistributionType.ALL
        }
        withType<Test> {
            useJUnitPlatform {
                includeEngines("spek2")
            }
        }
        withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
}
