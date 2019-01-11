# Comprueba que un numero sea polidivisible, la entrada debe ser un string
def comprobar(numero):
    check = True
    for i in range(1,len(numero)):
        #print(numero[0:i+1] + " modulo " + str(i+1) + " = " + str(int(numero[0:i+1]) % (i+1)))
        if (i == 0 ): 
            if(numero[0:i] == 0):
                check = False
        if(long(numero[0:i+1]) % (i+1) != 0):
            check = False;
    return check

# Dada una longitud n de digitos, calcula el primer numero con esos digitos, ej n = 4, retornaria 1000
def getInicio(n):
    numero = "1"
    for i in range(0,n-1):
        numero += "0"
    return long(numero)

# Dada una longitud n de digitos, calcula el ultimo numero con esos digitos, ej n = 4, retornaria 9999
def getFin(n):
    numero = ""
    for i in range(0,n):
        numero += "9"
    return long(numero)

# Por alguna razon con 9 digitos no muestra nada, con cualquier valor de n menor a eso funciona
def obtenerPrimerPolidivisible(n):
    print(getInicio(9),getFin(9))
    for i in range(getInicio(n), getFin(n)):
        print("he")
        if(comprobar(str(i))):
            print(i)
            break

obtenerPrimerPolidivisible(9)