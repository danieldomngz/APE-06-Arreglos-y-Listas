#include <iostream>
#include <vector>

using namespace std;

int main() {

    // Arreglo de tamaño fijo
    int arreglo[5];
    arreglo[0] = 10;
    arreglo[1] = 20;
    arreglo[2] = 30;
    arreglo[3] = 40;
    arreglo[4] = 50;

    cout << "=== ARREGLO NORMAL ===" << endl;
    cout << "Tamano fijo: 5" << endl;

    for (int i = 0; i < 5; i++) {
        cout << arreglo[i] << " ";
    }
    cout << endl;

    // Vector (equivalente a ArrayList)
    vector<int> lista;
    lista.push_back(10);
    lista.push_back(20);
    lista.push_back(30);
    lista.push_back(40);
    lista.push_back(50);

    cout << "\n=== VECTOR (equivalente a ArrayList) ===" << endl;
    cout << "Tamano actual: " << lista.size() << endl;

    for (int i = 0; i < lista.size(); i++) {
        cout << lista[i] << " ";
    }
    cout << endl;

    // Agregar elementos
    lista.push_back(60);
    lista.push_back(70);
    cout << "Despues de agregar 2 elementos mas, tamano: " << lista.size() << endl;

    // Eliminar primer elemento
    lista.erase(lista.begin());
    cout << "Despues de eliminar el primero, tamano: " << lista.size() << endl;

    return 0;
}