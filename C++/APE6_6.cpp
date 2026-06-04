#include <iostream>
#include <vector>
#include <string>
#include <iomanip> 

using namespace std;

int main() {

    vector<string> nombres;
    vector<int> cantidades;
    vector<double> precios;

    int opcion;

    do {
        cout << "\n======= SISTEMA DE INVENTARIO =======" << endl;
        cout << "1. Agregar producto" << endl;
        cout << "2. Ver inventario" << endl;
        cout << "3. Buscar producto" << endl;
        cout << "4. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        switch (opcion) {
            case 1:
                // Agregar producto
                {
                    string nombre;
                    int cantidad;
                    double precio;

                    cout << "Nombre del producto: ";
                    getline(cin, nombre);
                    nombres.push_back(nombre);

                    cout << "Cantidad: ";
                    cin >> cantidad;
                    cantidades.push_back(cantidad);

                    cout << "Precio: ";
                    cin >> precio;
                    precios.push_back(precio);
                    cin.ignore();

                    cout << "Producto agregado al inventario." << endl;
                }
                break;

            case 2:
                // Mostrar inventario
                if (nombres.empty()) {
                    cout << "El inventario esta vacio." << endl;
                } else {
                    cout << "\n--- Inventario ---" << endl;
                    cout << left << setw(20) << "Producto"
                         << setw(10) << "Cantidad"
                         << setw(10) << "Precio" << endl;

                    for (int i = 0; i < nombres.size(); i++) {
                        cout << left << setw(20) << nombres[i]
                             << setw(10) << cantidades[i]
                             << "$" << setw(10) << fixed << setprecision(2) << precios[i]
                             << endl;
                    }
                }
                break;

            case 3:
                // Buscar producto
                {
                    string buscar;
                    cout << "Que producto desea buscar: ";
                    getline(cin, buscar);

                    int pos = -1;
                    for (int i = 0; i < nombres.size(); i++) {
                        if (nombres[i] == buscar) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {
                        cout << "Encontrado: " << nombres[pos]
                             << " | Cantidad: " << cantidades[pos]
                             << " | Precio: $" << precios[pos] << endl;
                    } else {
                        cout << "Producto no encontrado." << endl;
                    }
                }
                break;

            case 4:
                cout << "Cerrando el sistema" << endl;
                break;

            default:
                cout << "Opcion invalida!" << endl;
                break;
        }

    } while (opcion != 4);

    cout << "Sistema cerrado." << endl;

    return 0;
}