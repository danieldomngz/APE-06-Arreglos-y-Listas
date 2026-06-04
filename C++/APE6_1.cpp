#include <iostream>
#include <vector>   
#include <string>
using namespace std;

int main() {

    vector<string> estudiantes;

    // Agregar 5 nombres al vector con push_back
    estudiantes.push_back("Ana Garcia");
    estudiantes.push_back("Carlos Lopez");
    estudiantes.push_back("Maria Perez");
    estudiantes.push_back("Juan Torres");
    estudiantes.push_back("Lucia Ramirez");

    // Mostrar todos los nombres usando un ciclo for
    cout << "Lista de estudiantes:" << endl;
    for (int i = 0; i < estudiantes.size(); i++) {
        cout << "- " << estudiantes[i] << endl;
    }
    cout << "Total de estudiantes: " << estudiantes.size() << endl;

    return 0;
}