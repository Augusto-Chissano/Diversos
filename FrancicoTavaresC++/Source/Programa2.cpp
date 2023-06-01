#include <iostream>

int main() {
    int n;
    int soma = 0;

    std::cout << "Digite um número inteiro: ";
    std::cin >> n;

    for (int i = 1; i <= n; i++) {
        soma += i * i;
    }

    std::cout << "A soma dos quadrados dos " << n << " primeiros números inteiros é: " << soma << std::endl;

    return 0;
}
