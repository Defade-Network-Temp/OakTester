plugins {
    id("net.defade.gitpatcher") version "1.0"
}

group = "net.defade"
version = "1.19.1-R1.0-SNAPSHOT"

patches {
    submodule = "Minestom"
    target = file("Yokura")
    patches = file("patches")
}