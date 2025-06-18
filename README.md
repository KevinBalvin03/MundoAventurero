# ✈️ Mundo Aventurero - Cotizador de Viajes 🌴🏖️

Bienvenido a *Mundo Aventurero, una aplicación de consola escrita en Java que 
permite a los usuarios generar una **cotización personalizada* para sus vacaciones soñadas.

Este programa interactivo te guía paso a paso para:

✅ Seleccionar un destino turístico  
✅ Especificar cuántas personas viajan  
✅ Elegir si deseas un seguro de viaje  
✅ Calcular el total con impuestos, descuentos y seguros  
✅ Mostrar una cotización detallada y profesional  

---

## 🚀 ¿Cómo ejecutar el programa?

1. Asegúrate de tener *Java JDK 8+* instalado.
2. Compila el archivo Java:
   ```bash
   javac Main.java
Ejecuta el programa:

bash
Copy
Edit
java Main

🧠 Variables principales
Variable	            Tipo	    Descripción
nombreCliente	        String	  Nombre del usuario que solicita la cotización
documentoCliente	    String	  Documento de identidad
correoCliente	        String	  Correo electrónico del usuario
telefonoCliente	      String	  Número de contacto
numPersonas	          short	    Cantidad total de personas que viajan
destinoViaje	        String	  Lugar turístico seleccionado
precioPersona	        double	  Costo del viaje por persona según destino
subTotalPersonas	    double	  Precio total sin impuestos ni descuentos
descuentoGrupo	      double	  Descuento aplicado si viajan más de 4 personas
impuestoViaje	        double    Impuesto del 12% sobre el subtotal con descuento
costoSeguro	          double	  Costo adicional del seguro (opcional)
totalViaje	          double  	Total final de la cotización
fechaCotizacion	 LocalDateTime	Fecha y hora de creación de la cotización


🌍 Destinos disponibles

Opción	Destino	Precio por persona
1	Cartagena	$1,600,000
2	Bogotá	$800,000
3	San Andrés	$2,100,000
4	Armenia	$1,500,000

🔒 Beneficios del Seguro de Viaje (opcional)
Gastos médicos y atención hospitalaria

Cancelación o demora de vuelos

Pérdida de equipaje

Asistencia legal

Costo del seguro: $130,000 por persona

📅 Cotización generada
Al final del programa, verás una salida en consola como esta:

swift
Copy
Edit
Fecha de creación de la cotización: 17/06/2025
Destino: San Andrés
Cantidad de acompañantes: 3
Costo total: $6,800,000

💡 Notas

Si viajan 4 o más personas, se aplica automáticamente un descuento del 8%.

El impuesto del viaje es del 12% sobre el subtotal después del descuento.

Asegúrate de ingresar fechas válidas y opciones correctas al interactuar con el programa.


🧑‍💻 Autores: 

Alvarez Beltran Sara Massiel  1065577990
Balvin Garcia Kevin Stiward   1000756221
Castrillon Torres Jhon Fredy  1152200645
Ramírez Garzón Darley         1035439833
Moreno Casas Daniel           1023630753
