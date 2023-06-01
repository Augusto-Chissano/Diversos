#include <iostream>

int main() {
    int mes;

    std::cout << "Digite o número do mês (de 1 a 12): ";
    std::cin >> mes;

    if (mes == 2) {
        std::cout << "O mês de fevereiro tem 28 dias." << std::endl;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        std::cout << "O mês tem 30 dias." << std::endl;
    } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        std::cout << "O mês tem 31 dias." << std::endl;
    } else {
        std::cout << "Mês inválido. Por favor, digite um número de mês válido (de 1 a 12)." << std::endl;
    }

    return 0;
}
