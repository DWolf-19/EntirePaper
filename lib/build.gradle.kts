plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("com.google.code.gson:gson:2.10.1")
    compileOnly("org.jetbrains:annotations:24.0.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
