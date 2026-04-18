# Taller de Automatización: Pruebas Unitarias e Integración Continua

## Objetivos
* Configurar un entorno de pruebas con **Maven** y **JUnit 5**.
* Implementar pruebas unitarias atómicas e independientes.
* Automatizar el ciclo de vida del software mediante **GitHub Actions** (CI).

## Estructura del Proyecto
* `pom.xml`: Configuración de dependencias (JUnit).
* `src/test/java/CalculadoraTest.java`: Contiene las pruebas de Suma y Resta.
* `.github/workflows/ci.yml`: Configuración del pipeline de automatización.

## Comandos Principales Usados
1. `mvn test`: Ejecución local de las pruebas.
2. `git checkout -b [nombre_rama]`: Creación de ramas para nuevas funcionalidades.
3. `git push origin [nombre_rama]`: Carga del código a la nube para activar el pipeline.

## Pipeline de Integración Continua (CI)
El archivo `ci.yml` asegura que cada vez que se sube código a GitHub:
1. Se configure un entorno con **Java 21**.
2. Se instalen las dependencias automáticamente.
3. Se ejecuten las pruebas y se genere un reporte de resultados en la pestaña **Actions**.
