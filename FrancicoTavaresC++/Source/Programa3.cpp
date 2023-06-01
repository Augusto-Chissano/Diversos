#include <iostream>

const int LINHAS_A = 3;
const int COLUNAS_A = 4;
const int LINHAS_T = COLUNAS_A;
const int COLUNAS_T = LINHAS_A;

int main() {
    int matrizA[LINHAS_A][COLUNAS_A];
    int matrizT[COLUNAS_T][LINHAS_T];

    // Solicitar os dados da matriz A
    std::cout << "Digite os elementos da matriz A (3x4):" << std::endl;
    for (int i = 0; i < LINHAS_A; i++) {
        for (int j = 0; j < COLUNAS_A; j++) {
            std::cout << "A[" << i << "][" << j << "]: ";
            std::cin >> matrizA[i][j];
        }
    }

    // Construir a matriz transposta T
    for (int i = 0; i < LINHAS_T; i++) {
        for (int j = 0; j < COLUNAS_T; j++) {
            matrizT[i][j] = matrizA[j][i];
        }
    }

    // Mostrar as duas matrizes na tela
    std::cout << "Matriz A (3x4):" << std::endl;
    for (int i = 0; i < LINHAS_A; i++) {
        for (int j = 0; j < COLUNAS_A; j++) {
            std::cout << matrizA[i][j] << "\t";
        }
        std::cout << std::endl;
    }

    std::cout << std::endl;

    std::cout << "Matriz T (4x3) - Transposta de A:" << std::endl;
    for (int i = 0; i < LINHAS_T; i++) {
        for (int j = 0; j < COLUNAS_T; j++) {
            std::cout << matrizT[i][j] << "\t";
        }
        std::cout << std::endl;
    }

    return 0;
}
