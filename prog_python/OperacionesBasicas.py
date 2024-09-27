# Función para realizar la suma de los dos primeros números y la multiplicación de los dos últimos
def operaciones_basicas(a, b, c, d):
    suma = a + b
    producto = c * d
    return suma, producto

# Solicitar los números al usuario
num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))
num3 = int(input("Ingrese el tercer número: "))
num4 = int(input("Ingrese el cuarto número: "))

# Llamar a la función y obtener los resultados
resultado_suma, resultado_producto = operaciones_basicas(num1, num2, num3, num4)

# Mostrar los resultados
print(f"La suma de los dos primeros números es: {resultado_suma}")
print(f"El producto de los dos últimos números es: {resultado_producto}")
