rootProject.name = "Yokura"

pluginManagement {
    repositories {
        maven("https://repo.defade.net/defade") {
            name = "defade"
            credentials(PasswordCredentials::class)
        }
    }
}

if (File(rootDir, "Yokura").exists()) {
    includeBuild("Yokura")
}