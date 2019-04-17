
import com.jfrog.bintray.gradle.BintrayExtension
import nebula.plugin.contacts.Contact
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    `build-scan`
    kotlin("jvm") version "1.3.21"
    id("nebula.maven-publish") version "10.0.2"
//    id("nebula.kotlin") version "1.3.21"
    id("ch.tutteli.spek") version "0.21.0"
    id("nebula.publish-verification") version "10.0.2"
    id("nebula.source-jar") version "9.4.6"
    id("nebula.javadoc-jar") version "9.4.6"
    id("nebula.info") version "5.0.2"
    id("nebula.release") version "9.2.0"
    id("nebula.nebula-bintray-publishing") version "5.0.0"
    id("nebula.contacts") version "5.0.2"
    id("tylerthrailkill.nebula-mit-license") version "0.0.3"
}

group = "com.tylerthrailkill.helpers"

val spekVersion = "2.0.2"
allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "nebula.maven-publish")
    apply(plugin =  "ch.tutteli.spek")

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

        testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spekVersion")
        testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:$spekVersion")
//        testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:$kotlin_version")
        implementation("io.arrow-kt:arrow-core:0.6.1")
        implementation("io.arrow-kt:arrow-data:0.6.1")
        implementation("io.arrow-kt:arrow-syntax:0.6.1")
        implementation("com.github.cesarferreira:kotlin-pluralizer:0.2.9")
        implementation("com.google.guava:guava:23.3-android")
        testCompile("com.willowtreeapps.assertk:assertk-jvm:0.13")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
}

configure<BintrayExtension> {
    user = findProperty("bintrayUser") as String? ?: System.getenv("BINTRAY_USER")
    key = findProperty("bintrayKey") as String? ?: System.getenv("BINTRAY_KEY")
    override = true

    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        userOrg = "snowe"
        repo = "maven"
        name = "Pretty-Print"
        desc = "Pretty printing of objects"

        setLicenses("MIT")
        websiteUrl = "https://github.com/snowe2010/${project.name}"
        issueTrackerUrl = "https://github.com/snowe2010/${project.name}/issues"
        vcsUrl = "https://github.com/snowe2010/${project.name}.git"
        setLabels("axon", "kotlin")
        version(delegateClosureOf<BintrayExtension.VersionConfig> {
            gpg(delegateClosureOf<BintrayExtension.GpgConfig> {
                sign = true
                passphrase = findProperty("gpgPassphrase") as String? ?: System.getenv("GPG_PASSPHRASE")
            })
            mavenCentralSync(delegateClosureOf<BintrayExtension.MavenCentralSyncConfig> {
                user = findProperty("sonatypeUser") as String? ?: System.getenv("SONATYPE_USERNAME") //OSS user token: mandatory
                password = findProperty("sonatypePassword") as String? ?: System.getenv("SONATYPE_PASSWORD") //OSS user password: mandatory
            })
        })
    })
    dryRun = false
    publish = true
}

contacts {  // Use statically-typed extension accessor
    addPerson("tyler.b.thrailkill@gmail.com", delegateClosureOf<Contact> { // type-safe adapter for dynamic Groovy Closure
        moniker = "Tyler Thrailkill" // This can be assigned as property
        role("owner") // To add role to `roles` set, you also can call it directly `roles.add("owner")`
    })
}

tasks.withType<Wrapper> {
    gradleVersion = "5.3.1"
}
