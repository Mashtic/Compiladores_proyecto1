# Compiladores Proyecto 1

Proyecto 1 del curso compiladores e intérpretes Verano 2024

## Información del proyecto
- IDLE: IntelliJ IDEA 2024.3.1
- Lenguaje: Java 17.0.12
- Dependencias:
  - JFlex:
    - groupId: de.jflex
    - artifactId: jflex
    - version: 1.9.1
  - Cup:
    - groupId: com.github.vbmacher
    - artifactId: java-cup
    - version: 11b-20160615-3
- Plugins:
  - JFlex:
    - groupId: de.jflex 
    - artifactId: jflex-maven-plugin
    - version: 1.9.1
  - Cup:
    - groupId: com.github.vbmacher
    - artifactId: cup-maven-plugin
    - version: 11b-20160615-3
- Librerías:
  - java-cup-11b
  - java-cup-11b-runtime
  - jflex-full-1.9.1

## Ejecutarlo
1. Contar con Java y Maven instalados
2. Descargar o clonar proyecto
3. Entrar a la carpeta AnalizadorLexico
4. Agregar las librerías encontradas en la carpeta "libs" a la estructura del proyecto
5. Ejecutar el plugin de JFlex con el comando 
```
mvn jflex:generate
```
6. Ejecutar el plugin de cup con el comando
```
mvn cup:generate
```
7. Ejecutar el main
