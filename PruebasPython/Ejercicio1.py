def mayorEdad(nombre, edad):
    if edad >= 18:
        print(nombre, ', eres mayor de edad, puedes pasar')
    else:
        print(nombre, ', eres menor de edad, no puedes pasar')


nombre = input("Introduce tu nombre: ")
edad = int(input("Introduce tu edad: "))
mayorEdad(nombre, edad)
