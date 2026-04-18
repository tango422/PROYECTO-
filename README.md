#  Automatizaci처n: Pruebas e Integraci처n Continua

## Objetivos
* Configurar Maven y JUnit 5.
* Implementar pruebas unitarias at처micas.
* Automatizar con GitHub Actions.

## Estructura del Proyecto
* `pom.xml`: Dependencias.
* `src/test/java/CalculadoraTest.java`: Pruebas de suma y resta.
* `.github/workflows/ci.yml`: Pipeline de CI.

## Comandos Usados
* `mvn test`: Ejecuci처n local.
* `git push origin main`: Disparar automatizaci처n.
- pom.xml 
- src/test/java/CalculadoraTest.java 
Se configur� GitHub Actions para ejecutar mvn test autom쟴icamente. 
