#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
int main() {
    vector<string> productos;
    string producto;
 
    // Registrar 5 productos
    cout << "=== Registro de Productos ===" << endl;
    for (int i = 0; i < 5; i++) {
        cout << "Ingresa el producto " << (i + 1) << ": ";
        getline(cin, producto);
        productos.push_back(producto);
    }
 
    // Mostrar todos los productos registrados
    cout << "\nProductos registrados:" << endl;
    for (int i = 0; i < productos.size(); i++) {
        cout << "- " << productos[i] << endl;
    }
 
    // Buscar un producto
    cout << "\nIngresa el producto a buscar: ";
    string buscar;
    getline(cin, buscar);
 
    // Recorrer el vector buscando el producto
    bool encontrado = false;
    for (int i = 0; i < productos.size(); i++) {
        if (productos[i] == buscar) { // Comparamos con ==
            encontrado = true;
            break;
        }
    }
 
    if (encontrado) {
        cout << "El producto '" << buscar << "'  esta disponible" << endl;
    } else {
        cout << "El producto '" << buscar << "' no esta disponible" << endl;
    }
 
    return 0;
}