# Minecraft-Mods

Workspace für die Entwicklung von Mods für **Minecraft: Java Edition**. Jedes Verzeichnis auf oberster Ebene enthält ein eigenständiges Mod-Projekt mit eigener Gradle-Konfiguration.

## Projekte

- [hello-world](hello-world/): Ein erster Fabric-Mod, der beim Laden eine Nachricht ins Minecraft-Log schreibt.

## Voraussetzungen

- JDK 25 für das Hello-World-Modul; `java -version` zeigt die aktive Version.
- Internetzugang für den ersten Gradle-Build und den Download von Minecraft und Fabric.
- Optional IntelliJ IDEA mit Gradle-Unterstützung. Das Verzeichnis `hello-world` als Gradle-Projekt öffnen und JDK 25 als Gradle-JVM auswählen.

## Mod entwickeln und bauen

```bash
cd hello-world
./gradlew runClient  # Entwicklungsclient starten
./gradlew build      # Mod-JAR erstellen
```

Unter Windows `gradlew.bat` statt `./gradlew` verwenden. Beim Start erscheint `Hello, Minecraft world!` im Log bzw. in der Konsole. Das fertige Mod-JAR liegt in `hello-world/build/libs/` (nicht das `-sources.jar`). Zur Installation werden Minecraft Java Edition 26.1 und der passende Fabric Loader benötigt; das Mod-JAR kommt in den `mods`-Ordner des Fabric-Profils.

Versionen und Mod-Koordinaten stehen in `hello-world/gradle.properties`. Weitere Mods können als unabhängige Projekte neben `hello-world` angelegt werden.

Weitere Informationen: [Fabric-Dokumentation](https://docs.fabricmc.net/develop/) und [Fabric-Beispielprojekt](https://github.com/FabricMC/fabric-example-mod/tree/26.1).
