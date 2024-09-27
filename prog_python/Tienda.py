# Programa para calcular el total a abonar por un cliente

# Pedir el precio del artículo
precio = float(input("Ingrese el precio del artículo: "))

# Pedir la cantidad de artículos que el cliente lleva
cantidad = int(input("Ingrese la cantidad que lleva el cliente: "))

# Calcular el total a abonar
total = precio * cantidad

# Mostrar el total a abonar
print(f"El total a abonar es: ${total:.2f}")

