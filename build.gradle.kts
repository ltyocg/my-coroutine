import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}
repositories {
    mavenCentral()
}
group = "com.ltyocg"
version = "0.0.1"

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    repositories {
        mavenCentral()
    }
    dependencies {
        implementation(kotlin("reflect"))
        testImplementation(kotlin("test"))
        testImplementation("org.junit.jupiter", "junit-jupiter-params", "5.9.0")
        testImplementation("org.mockito.kotlin", "mockito-kotlin", "4.0.0")
        testImplementation("org.mockito", "mockito-inline", "4.5.1")
    }
    tasks.test {
        useJUnitPlatform()
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }
}