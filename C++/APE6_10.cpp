#include <iostream>
#include <list>
#include <string>

using namespace std;

int main() {

    list<string> fila;
    int opcion;
    int atendidos = 0;

    cout << "=== SISTEMA DE FILA DE ATENCION ===" << endl;

    do {
        cout << "\nPersonas en fila: " << fila.size() << endl;
        cout << "1. Llega una persona nueva" << endl;
        cout << "2. Atender siguiente persona" << endl;
        cout << "3. Ver quien esta en la fila" << endl;
        cout << "4. Ver estadisticas" << endl;
        cout << "5. Salir" << endl;
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();

        switch (opcion) {

            case 1: {
                // Agregar persona
                string persona;
                cout << "Nombre de la persona: ";
                getline(cin, persona);
                fila.push_back(persona);
                cout << persona << " se unio a la fila. "
                     << "Su posicion: #" << fila.size() << endl;
                break;
            }

            case 2:
                // Atender persona
                if (fila.empty()) {
                    cout << "No hay nadie en la fila." << endl;
                } else {
                    string siguiente = fila.front();
                    cout << "Atendiendo a: " << siguiente << "..." << endl;
                    fila.pop_front();
                    atendidos++;
                    cout << "Atencion completada. Personas que faltan: "
                         << fila.size() << endl;
                }
                break;

            case 3:
                // Mostrar fila
                if (fila.empty()) {
                    cout << "La fila esta vacia." << endl;
                } else {
                    cout << "Fila actual (de primero a ultimo):" << endl;
                    int pos = 1;
                    for (const string& persona : fila) {
                        cout << "  #" << pos << " -> " << persona << endl;
                        pos++;
                    }
                }
                break;

            case 4:
                // Estadisticas
                cout << "--- Estadisticas ---" << endl;
                cout << "Personas atendidas: " << atendidos << endl;
                cout << "Personas en espera: " << fila.size() << endl;
                if (!fila.empty()) {
                    cout << "Proxima persona: " << fila.front() << endl;
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

    cout << "\nSistema cerrado. Total atendidos hoy: "
         << atendidos << endl;

    return 0;
}