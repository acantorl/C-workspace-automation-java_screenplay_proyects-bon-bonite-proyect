# Bon Bonite Automation Framework

Este proyecto contiene la automatización de 6 flujos críticos para el portal e-commerce [Bon Bonite](https://www.bon-bonite.com/) utilizando **Serenity BDD** con el patrón de diseño **Screenplay**.

## 🛠️ Tecnologías y Versiones

- **Java:** 21.0.9 (LTS)
- **Gradle:** 9.2.0 (optimizado para Java 21 variables de entorno configuradas)
- **Serenity BDD:** 4.0.12
- **Cucumber:** Integrado con Serenity
- **Sistema Operativo:** Windows 11

## 🏗️ Arquitectura (Screenplay Pattern)

El proyecto sigue el patrón Screenplay, dividiendo las responsabilidades en:
- **Features:** Archivos `.feature` con lenguaje Gherkin.
- **Tasks:** Acciones del usuario (ej. `BuscarProducto`, `CambiarClave`).
- **UserInterface:** Localizadores de elementos web.
- **Questions:** Validaciones de los estados de la aplicación.

## 🧪 Escenarios de Prueba

Se han automatizado los siguientes flujos:

1. **Búsqueda de Producto:** Valida la disponibilidad y filtros de búsqueda.
2. **Registro de Usuario:** Creación de nuevas cuentas.
3. **Login:** Acceso de usuarios registrados.
4. **Logout:** Cierre de sesión y retorno al home.
5. **Cambio de Contraseña:** Flujo completo que incluye el reset de la clave para permitir pruebas infinitas.
6. **Carrito de Compras:** Adición de productos "Tenis" al carrito.

## 🚀 Ejecución

Para ejecutar las pruebas y generar el reporte detallado, utiliza el siguiente comando en la terminal:

bash
gradle clean test aggregate


## 📊 Reportes

Al finalizar la ejecución, el reporte detallado (con evidencias en screenshot) se encontrará en:
`target/site/serenity/index.html`

Screenshots
'target/site/serenity/'

## ⚙️ Configuración del WebDriver

El proyecto está configurado para ejecutarse en **Chrome**. Las capacidades incluyen:
- Modo Incógnito.
- Inicio maximizado.
- Desactivación de bloqueadores de popups y extensiones.
- Autodescarga de driver habilitada.
