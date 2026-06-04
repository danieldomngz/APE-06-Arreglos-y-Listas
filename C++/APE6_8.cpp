#include <iostream>
#include <vector>

using namespace std;

int main() {

    // Arreglo original
    int arreglo[] = {10, 20, 40, 50};
    int tamano = 4;

    // Nuevo arreglo con espacio adicional
    int nuevoArreglo[5];

    //Copiar los elementos en el nuevo arreglo
    for (int i = 0; i < 2; i++) {
        nuevoArreglo[i] = arreglo[i];
    }
    nuevoArreglo[2] = 30;
    for (int i = 2; i < tamano; i++) {
        nuevoArreglo[i + 1] = arreglo[i];
    }

    // Mostrar arreglos
    cout << "=== INSERCION EN ARREGLO ===" << endl;

    cout << "Arreglo original: ";
    for (int i = 0; i < tamano; i++) {
        cout << arreglo[i] << " ";
    }
    cout << endl;

    cout << "Despues de insertar 30 en posicion 2: ";
    for (int i = 0; i < tamano + 1; i++) {
        cout << nuevoArreglo[i] << " ";
    }
    cout << endl;

    cout << "(Requirio crear un nuevo arreglo y copiar todos los elementos)" << endl;

    vector<int> lista = {10, 20, 40, 50};

    cout << "\n=== INSERCION EN VECTOR ===" << endl;

    cout << "Lista original: ";
    for (int x : lista) {
        cout << x << " ";
    }
    cout << endl;

    // Insertar en posición 2
    lista.insert(lista.begin() + 2, 30);

    cout << "Despues de insertar 30 en posicion 2: ";
    for (int x : lista) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}