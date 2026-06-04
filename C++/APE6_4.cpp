#include <iostream>
#include <vector>
#include <string>
using namespace std;
 
int main() {
    vector<string> lista;
    int opcion;
    string elemento;
 
    do {
        cout << "\n=== MENU CRUD ===" << endl;
        cout << "1. Crear (agregar)" << endl;
        cout << "2. Leer (mostrar todos)" << endl;
        cout << "3. Actualizar (modificar)" << endl;
        cout << "4. Eliminar (borrar)" << endl;
        cout << "5. Salir" << endl;
        cout << "Elige una opcion: ";
        cin >> opcion;
        cin.ignore();
 
        switch (opcion){
        case 1:
            //Agregar un nuevo elemento
            cout << "Ingresa el elemento a agregar: ";
            getline(cin, elemento);
            lista.push_back(elemento); 
            cout << "Elemento agregado." << endl;
            break;

        case 2:
            //Mostrar todos los elementos
            if (lista.empty()) {
                cout << "La lista esta vacia." << endl;
            } else {
                cout << "Elementos en la lista:" << endl;
                for (int i = 0; i < lista.size(); i++) {
                    cout << i << ". " << lista[i] << endl;
                }
            }
            break;
 
        case 3:
            //Modificar un elemento
            int indice;
            cout << "Que indice desea modificar? ";
            cin >> indice;
            cin.ignore();
            if (indice >= 0 && indice < (int)lista.size()) {
                cout << "Nuevo valor: ";
                getline(cin, elemento);
                lista[indice] = elemento;
                cout << "Elemento actualizado." << endl;
            } else {
                cout << "Indice no valido." << endl;
            }
            break;
 
        case 4:
            //Eliminar un elemento
            cout << "Que indice deseas eliminar? ";
            cin >> indice;
            cin.ignore();
            if (indice >= 0 && indice < (int)lista.size()) {
                lista.erase(lista.begin() + indice);
                cout << "Elemento eliminado." << endl;
            } else {
                cout << "Indice no valido." << endl;
            }
            break;

        case 5:
            cout << "Saliendo del programa" << endl;
            break;

        default:
            cout << "Opcion Invalida!" << endl;
            break;
        }
 
    } while (opcion != 5);
    return 0;
}