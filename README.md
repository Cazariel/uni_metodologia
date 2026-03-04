# 🚀 Guía Rápida de Git: Trabajo en Equipo

Esta es la guía de supervivencia para nuestro repo. Por favor, léela antes de tocar nada para evitar que nos carguemos el trabajo de los demás. 😅

## 1. Configuración Inicial (Solo la primera vez)
Antes de empezar, dile a Git quién eres para que sepamos quién subió cada cosa:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu_correo@ejemplo.com"
```

---

## 2. Clonar el Proyecto
Para bajar el código a tu carpeta por primera vez:

```bash
git clone https://github.com/Cazariel/uni_metodologia.git
cd uni_metodologia
```

> **Nota sobre la contraseña:** GitHub ya no acepta tu contraseña normal. Tienes que usar un **Personal Access Token (PAT)**. Guárdalo bien, porque te lo pedirá como si fuera la contraseña.

---

## 3. El "Ciclo de Vida" Diario (Flujo de trabajo)
Para no pisarnos el código, sigue siempre este orden:

1. **Actualiza tu código local** (Haz esto SIEMPRE antes de empezar a programar):
   ```bash
   git pull origin main
   ```
2. **Mira qué has cambiado:**
   ```bash
   git status
   ```
3. **Prepara tus archivos:**
   ```bash
   git add .   # Esto añade todos tus cambios
   ```
4. **Guarda tus cambios con un mensaje:**
   ```bash
   git commit -m "Explica brevemente qué hiciste (ej: Agregué la función de suma)"
   ```
5. **Sube tu trabajo a GitHub:**
   ```bash
   git push origin main
   ```

---

## 4. Trabajar con Ramas (¡Súper Recomendado!) 🌿
Si vas a hacer algo grande y no quieres romper lo que ya funciona en `main`, usa una rama:

* **Crear y entrar a una rama nueva:**
  ```bash
  git checkout -b nombre-de-tu-rama
  ```
* **Volver a la rama principal:**
  ```bash
  git checkout main
  ```
* **Borrar una rama (solo si ya terminaste):**
  ```bash
  git branch -d nombre-de-tu-rama
  ```

---

## 5. Tabla de Comandos Rápidos

| Comando | ¿Para qué sirve? |
| :--- | :--- |
| `git pull` | Traer los cambios de los demás (Bajar) |
| `git push` | Subir mis cambios al grupo (Subir) |
| `git status` | Ver si tengo archivos sin guardar |
| `git log` | Ver el historial de quién hizo qué |
| `git checkout .` | **¡EMERGENCIA!** Borra mis cambios locales y vuelve al último commit |

---

## ⚠️ Reglas de Oro
1. **Nunca** hagas un `push` si tu código no compila o tiene errores graves.
2. **Escribe mensajes de commit claros.** "Cosas" o "Fix" no ayudan a nadie.
3. **Haz `pull` a menudo.** Cuanto más tiempo pases sin actualizar, más difícil será arreglar los conflictos.
