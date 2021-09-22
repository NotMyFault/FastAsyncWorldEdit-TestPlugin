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
    maven {
        name = "IntellectualSites Releases"
        url = uri("https://mvn.intellectualsites.com/content/repositories/releases/")
    }
    maven {
        name = "IntellectualSites Snapshots"
        url = uri("https://mvn.intellectualsites.com/content/repositories/snapshots/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
    compileOnly("com.fastasyncworldedit:FastAsyncWorldEdit-Core:1.17-308")
}

the<JavaPluginExtension>().toolchain {
    languageVersion.set(JavaLanguageVersion.of(16))
}

configurations.all {
    attributes.attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 16)
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

