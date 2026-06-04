#include <iostream>
#include <vector>
using namespace std;
 
int main() {
    vector<double> notas;
 
    // Agregar 6 notas al vector
    notas.push_back(8.5);
    notas.push_back(7.0);
    notas.push_back(9.2);
    notas.push_back(6.8);
    notas.push_back(10.0);
    notas.push_back(5.5);
 
    // Mostrar todas las notas
    cout << "Lista de notas:" << endl;
    for (int i = 0; i < notas.size(); i++) {
        cout << "Nota " << (i + 1) << ": " << notas[i] << endl;
    }

    return 0;
}