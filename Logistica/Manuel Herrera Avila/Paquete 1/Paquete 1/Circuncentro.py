import numpy as np
# numpy no viene por defecto con python, se instala escribiendo pip install numpy en la consola de comandos

def puntoMedio(punto1, punto2):
    return [(punto1[0] + punto2[0]) / 2., (punto1[1] + punto2[1]) / 2.]

def perpendicular(punto1, punto2):
    return -(punto1[0] - punto2[0]) / ((punto1[1] - punto2[1]) * 1.)

# Se introducen los puntos como un array tipo [1,2], es decir, el punto se encuentra en la coordenada 1,2
def circuncentro(punto1, punto2, punto3):
    puntos = [punto1, punto2, punto3]
    medios = []
    pendientes = []
    for i in range(0, 3):
        # Para cada par de puntos, AB, AC, BC se calcula el punto medio y la pendiente
        medios.append((puntoMedio(puntos[i], puntos[(i + 1) % 3])))
        pendientes.append((perpendicular(puntos[i], puntos[(i + 1) % 3])))

    # Se calcula la ecuacion de la recta que pasa por dos de los puntos y tiene la pendiente que se ha calculado antes, osea las mediatrices
    a = np.array([[pendientes[0], 1], [pendientes[1], 1]])
    res1 = pendientes[0] * (-(medios[0][0])) + medios[0][1]
    res2 = pendientes[1] * (-(medios[1][0])) + medios[1][1]
    b = np.array([res1, res2]);
    # Numpy resuelve una ecuacion tipo 2x + y = 4; x + 2y  = 2. Y da como resultado el circuncentro
    print(np.linalg.solve(a,b))

circuncentro([2,0], [0,1], [-3,-2])
