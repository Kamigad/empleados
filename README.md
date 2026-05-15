# 👨‍💼 Sistema de Gestión de Empleados

Aplicación web desarrollada con **Spring Boot** y vistas **JSP/JSTL** que permite gestionar empleados de forma completa. El sistema ofrece una interfaz web para listar, agregar, modificar y eliminar empleados, con persistencia en base de datos MySQL.

---

## ✨ Funcionalidades

- 📋 **Listar** todos los empleados registrados
- 🔍 **Buscar** un empleado por su ID
- ➕ **Agregar** nuevos empleados
- ✏️ **Modificar** la información de un empleado existente
- 🗑️ **Eliminar** empleados del sistema

Cada empleado contiene: **ID**, **nombre**, **departamento** y **sueldo**.

---

## 🚀 Tecnologías utilizadas

| Tecnología              | Versión  |
|-------------------------|----------|
| Java                    | 26       |
| Spring Boot             | 4.0.6    |
| Spring Web MVC          | -        |
| Spring Data JPA         | -        |
| JSP + JSTL              | -        |
| Tomcat Embed Jasper     | -        |
| MySQL                   | -        |
| Lombok                  | -        |
| Maven                   | -        |

---

## 📋 Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- [Java JDK 26+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL](https://www.mysql.com/downloads/)

---

## ⚙️ Configuración

### 1. Clona el repositorio

```bash
git clone https://github.com/Kamigad/empleados.git
cd empleados
```

### 2. Crea la base de datos

```sql
CREATE DATABASE empleados_db;
```

### 3. Configura las credenciales

Edita el archivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/empleados_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Configuración de vistas JSP
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

---

## ▶️ Ejecución

### Con Maven Wrapper

```bash
# Linux / Mac
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

### Con Maven instalado

```bash
mvn spring-boot:run
```

La aplicación se ejecutará en `http://localhost:8080`.

---

## 🌐 Rutas de la aplicación

| Método | Ruta | Descripción |
|--------|------|-------------|
| `GET` | `/empleados` | Listar todos los empleados |
| `GET` | `/empleados/nuevo` | Formulario para agregar empleado |
| `POST` | `/empleados/guardar` | Guardar nuevo empleado |
| `GET` | `/empleados/editar/{id}` | Formulario para editar empleado |
| `POST` | `/empleados/actualizar/{id}` | Actualizar empleado existente |
| `GET` | `/empleados/eliminar/{id}` | Eliminar un empleado |

---

## 🗂️ Estructura del proyecto

```
empleados/
├── src/
│   ├── main/
│   │   ├── java/gm/empleados/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   ├── resources/
│   │   │   └── application.properties
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── views/        ← Vistas JSP
│   └── test/
├── pom.xml
└── README.md
```

---

## 📦 Modelo de datos

| Campo         | Tipo    | Descripción                        |
|---------------|---------|------------------------------------|
| `id`          | Long    | Identificador único del empleado   |
| `nombre`      | String  | Nombre completo del empleado       |
| `departamento`| String  | Departamento al que pertenece      |
| `sueldo`      | Double  | Sueldo mensual del empleado        |

---

## 👤 Autor

**Kamigad**  
[GitHub](https://github.com/Kamigad)

---

## 📄 Licencia

Este proyecto es de uso libre con fines educativos.
