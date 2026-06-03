# Tarea 01 — Instrucciones de implementación

**Curso:** Programación III · **Módulo 1 (POO)** · Tiempo estimado: 3–4 horas

---

## Contexto

El proyecto ya tiene un sistema funcional con `Bebida`, `Abarrote` y `Fruta`.
Su trabajo es completar las partes que faltan — no solo que compile, sino que
demuestre cada pilar de la POO de forma concreta.

Antes de escribir código, lea `Abarrote.java` y `Fruta.java` completos.
Son sus modelos de referencia — la lógica que debe aplicar es análoga.
Luego lea `Producto.java` y observe dónde aparece cada pilar en el código ya dado.

---

## Lo que debe implementar

### 1. `Limpieza.java` — Herencia · Abstracción · Encapsulamiento · Overloading

La clase ya existe con comentarios que indican qué pilar POO practica cada parte.
Implemente los `// TODO` en este orden:

- **Constructor** *(herencia)*: inicialice el atributo de descuento.
  Los otros tres atributos ya los maneja `Producto` — `super(...)` los delega.

- **`precioFinal()`** *(abstracción)*: precio con IVA del 13%, menos el descuento aplicado.
  Compare la estructura con `Abarrote.java`; tenga en cuenta que los campos de `Producto` son `private`.

- **`aplicarDescuento()`** *(interface)*: calcula y retorna el monto que se descuenta al subtotal.

- **`setPorcentajeDescuento(double pct)`** *(encapsulamiento)*: setter con validación.
  Solo acepte valores en el rango válido para un porcentaje; si el valor es rechazado, infórmelo.
  Esto muestra en acción por qué los atributos son `private`.

- **`promo()` y `promo(boolean conEtiqueta)`** *(overloading)*: dos versiones del mismo método.
  Una imprime la promoción básica; la otra puede mostrar información adicional según el parámetro.

### 2. `Mercado.java` — Polimorfismo · Static

Los métodos de `Mercado` reciben un `Producto[]` sin importar si contiene frutas,
bebidas o productos de limpieza. Llaman `precioFinal()` en cada elemento y Java decide
en tiempo de ejecución qué implementación ejecutar según el tipo real del objeto.
Eso es **polimorfismo**.

Implemente los tres métodos marcados con `// TODO` en `Mercado.java`:

- **`masCaro(Producto[])`** *(polimorfismo)*: recorra el arreglo y retorne el `Producto`
  con el mayor `precioFinal()`. Use `totalCarrito` como guía de recorrido.

- **`masBarato(Producto[])`** *(polimorfismo)*: mismo patrón que `masCaro`,
  pero retorna el de menor `precioFinal()`.

- **`totalDescuentos(Producto[])`** *(polimorfismo + interface)*: sume el monto de descuento
  de todos los productos del carrito que sean capaces de descontarse.
  Para cada uno, verifique el tipo en tiempo de ejecución y llame el método correspondiente.

### 3. `Main.java` — zona tarea — todos los pilares juntos

Busque `// ===== ZONA TAREA =====`. El bloque comentado es su punto de partida:
descoméntelo — cuando todos los `TODO` estén completos, debe compilar sin cambios.

El bloque ya está estructurado por pilar. Verifique que cada parte funcione:

- **Herencia + Abstracción**: el carrito mezcla `Fruta`, `Bebida` y `Limpieza` bajo `Producto`.
- **Encapsulamiento**: `setPorcentajeDescuento(-0.5)` imprime el error de validación;
  `setPorcentajeDescuento(0.15)` actualiza el campo.
- **Overloading**: `promo()` y `promo(true)` producen salidas distintas.
- **Polimorfismo**: el loop llama `p.mostrar()` en cada elemento — Java decide cuál versión.
  `instanceof Descontable` e `instanceof Perecedero` agregan comportamiento según el tipo real.
- **Static**: `Mercado.masCaro(...)`, `Mercado.masBarato(...)` y `Mercado.totalDescuentos(...)`
  operan sobre el carrito sin necesitar una instancia de `Mercado`.

### 4. `README.md`

Agregue al final una sección breve (3–5 oraciones) explicando qué clases agregó
o modificó, qué interface implementó y qué demuestra el loop polimórfico.

---

## Verificación antes de entregar

- [ ] El pipeline de GitHub Actions pasa (check verde en la pestaña Actions de su fork)
- [ ] `setPorcentajeDescuento` rechaza un valor fuera de rango e imprime el aviso
- [ ] `Mercado.masBarato(...)` retorna el producto correcto
- [ ] `Mercado.totalDescuentos(...)` retorna el valor correcto
- [ ] `git log` tiene al menos 4 commits propios con mensajes descriptivos
- [ ] La carpeta `target/` no está en el `.zip`
- [ ] La carpeta `.git/` sí está en el `.zip`

---

## Rúbrica (100 %)

| Criterio | % | Cómo se evalúa |
|---|---|---|
| Herencia / abstract | 20 | `Limpieza extends Producto`, `precioFinal()` con la fórmula correcta |
| Interface | 10 | `Descontable` implementada correctamente en `Limpieza` |
| Encapsulamiento | 10 | `setPorcentajeDescuento()` valida el rango y protege el campo |
| Polimorfismo | 20 | Loop uniforme, `instanceof Descontable`, `instanceof Perecedero` |
| Overloading | 10 | `promo()` y `promo(boolean)` presentes y funcionales |
| Static | 15 | `masCaro`, `masBarato` y `totalDescuentos` completos y correctos |
| Git | 10 | Commits propios con mensajes claros (se revisará su `git log`) |
| README / orden | 5 | Sección propia explicando qué agregó y qué demuestra cada pilar |

---

## Fecha de entrega

**8 de junio de 2026** — ver instrucciones de entrega en `README.md`.
