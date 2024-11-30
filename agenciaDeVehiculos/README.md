Desarrollar los archivos Java necesarios para hacer funcionar el siguiente programa:

Se quiere una agencia de vehículos que concede motos a un costo de alquiler diario de 1000.00, autos a un costo de alquiler diario de 2000.00 y camionetas a un costo de alquiler diario de 3000.00.

La agencia cuenta con 5 motos, 8 autos y 3 camionetas, que para alquilarlas deben tener su capacidad completa y debe haber un registro del conductor y los pasajeros. Cada moto tiene de capacidad 2 personas, los autos tienen 5 personas de capacidad y las camionetas 7.

La agencia quiere gestionar la entrada, salida, cobro y ocupación de todos los vehículos, cada vehículo tiene un codigo único donde la primera letra es M para las motos, A para los autos y C para las camionetas, seguido por un numero para identificar una camioneta de las otras (ejemplo M1, C3). Para registrar un conductor se debe buscar un vehículo disponible (es decir no ocupado) y cargarle los datos de cada una de las personas que lo ocuparan de acuerdo a su capacidad.

Se tiene una funcion que emite un listado de los vehículos de la agencia de la siguiente manera: si está disponible se imprime “[codigo] – DISPONIBLE”, si está ocupado “[codigo] – [nombre del conductor]”

Al entregar el vehículo se deben ingresar los días alquilado y, de acuerdo al costo de alquiler diario, si el conductor es mujer y mayor a 65 años o es hombre y mayor a 70 años se les hace un descuento del 20%.
