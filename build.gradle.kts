plugins {
    java

    id("net.minecrell.plugin-yml.bukkit") version "0.5.0"
}

group = "dev.notmyfault"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "PaperMC"
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
    compileOnly("com.fastasyncworldedit:FastAsyncWorldEdit-Core:2.0.1")
}

the<JavaPluginExtension>().toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
}

configurations.all {
    attributes.attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 17)
}

tasks.compileJava.configure {
    options.release.set(8)
}

bukkit {
    name = "FastAsyncWorldEditTest"
    main = "dev.notmyfault.fawetest.FaweTestPlugin"
    authors = listOf("NotMyFault")
    apiVersion = "1.15"
    version = project.version.toString()
    depend = listOf("FastAsyncWorldEdit")
}

