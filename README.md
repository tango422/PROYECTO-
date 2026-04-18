# Evaluacion2  Automatización: Pruebas e Integración Continua

## Objetivos
* Configurar un entorno de pruebas con Maven y JUnit 5.
* Implementar pruebas unitarias atómicas e independientes.
* Automatizar el ciclo de vida del software con GitHub Actions.

## Estructura
* `pom.xml`: Gestión de dependencias.
* `src/test/java/CalculadoraTest.java`: Pruebas de suma y resta.
* `.github/workflows/ci.yml`: Pipeline de automatización.

## Ejecución de Pruebas
* **Local**: Ejecutar `mvn test` en la terminal.
* **CI**: El reporte se genera automáticamente en la pestaña **Actions** de GitHub.
