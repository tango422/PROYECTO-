Feature: Autenticación de Usuario
  Como usuario registrado
  Quiero ingresar mis credenciales
  Para acceder a mi perfil personal

  Scenario: Login exitoso
    Given que el usuario está en la página de inicio de sesión
    When ingresa el nombre de usuario "pablo.aguilar" y la clave "Pass123"
    Then el sistema debe redirigirlo a la pantalla de bienvenida

  Scenario Outline: Intento de login con credenciales incorrectas
    Given que el usuario está en la página de inicio de sesión
    When ingresa el <usuario> y la <clave>
    Then el sistema debe mostrar el mensaje de error "Credenciales inválidas"

    Examples:
      | usuario | clave    |
      | "admin" | "1234"   |
      | "user2" | "wrong"  |