dependencyResolutionManagement {
    versionCatalogs {
        create("localLibs") {
            from(files("dependencies.toml"))
        }
    }
}

rootProject.name = "Default App"
include(":app")
include(":theme")
include(":navigation:core")
include(":navigation:tab_bar")
include(":features:model_feature")
