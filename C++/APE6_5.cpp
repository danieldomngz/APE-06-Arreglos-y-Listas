#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    vector<string> nombres;
    vector<double> notas;
    int n;
    string nombre;
    double nota;

    cout << "Ingrese el numero de estudiantes: ";
    cin >> n;
    cin.ignore();

    //Ingresar datos
    for (int i = 0; i < n; i++) {
        cout << "Ingrese el nombre del estudiante " << (i + 1) << ": ";
        getline(cin, nombre);
        nombres.push_back(nombre);

        cout << "Ingrese la nota del estudiante " << (i + 1) << ": ";
        cin >> nota;
        notas.push_back(nota);
        cin.ignore(); 
    }

    //Mostrar datos de los estudiantes
    for (int i = 0; i < n; i++) {
        cout << nombres[i] << "\t\t Nota: " << notas[i] << endl;
    
    }
    return 0;

}