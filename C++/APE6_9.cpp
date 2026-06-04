#include <iostream>
#include <list>
#include <string>

using namespace std;

int main() {

    list<string> turnos;
    int opcion;

    do {
        cout << "\n=== GESTION DE TURNOS ===" << endl;
        cout << "1. Agregar turno al final" << endl;
        cout << "2. Agregar turno al inicio (urgente)" << endl;
        cout << "3. Atender siguiente turno" << endl;
        cout << "4. Ver todos los turnos" << endl;
        cout << "5. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        switch (opcion) {

            case 1: {
                // Agregar al final
                string nombre;
                cout << "Nombre del paciente/cliente: ";
                getline(cin, nombre);
                turnos.push_back(nombre);
                cout << nombre << " agregado al final de la cola." << endl;
                break;
            }

            case 2: {
                // Agregar al inicio (urgente)
                string nombre;
                cout << "Nombre del caso urgente: ";
                getline(cin, nombre);
                turnos.push_front(nombre);
                cout << nombre << " agregado al INICIO (urgente)." << endl;
                break;
            }

            case 3:
                // Atender al primero
                if (turnos.empty()) {
                    cout << "No hay turnos pendientes." << endl;
                } else {
                    string atendido = turnos.front();
                    turnos.pop_front();
                    cout << "Atendiendo a: " << atendido << endl;
                    cout << "Turnos restantes: " << turnos.size() << endl;
                }
                break;

            case 4:
                // Mostrar turnos
                if (turnos.empty()) {
                    cout << "No hay turnos en la lista." << endl;
                } else {
                    cout << "Turnos actuales:" << endl;
                    int numero = 1;
                    for (const string& turno : turnos) {
                        cout << numero << ". " << turno << endl;
                        numero++;
                    }
                }
                break;

            case 5:
                cout << "Saliendo del programa" << endl;
                break;

            default:
                cout << "Opcion invalida!" << endl;
                break;
        }

    } while (opcion != 5);

    cout << "Sistema cerrado." << endl;

    return 0;
}