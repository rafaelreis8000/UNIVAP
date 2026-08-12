Algoritmo "Fibonacci_Vetor"
// Disciplina  : Lógica de Programação
// Professor   : André Olímpio 
// Descrição   : 20 primeiros números de Fibonacci, utilizando vetores
// Autor(a)    : André Olímpio
// Data atual  : 06/09/2025
Var
   // Declarações das variáveis
   fibonacci: vetor[1..20] de inteiro
   I: inteiro

Inicio
   // Inicializando a sequência
   fibonacci[1] <- 1
   fibonacci[2] <- 1
   
   // Calculando os números da sequência a partir do 3º número
   para I de 3 ate 20 faca
        fibonacci[I] <- fibonacci[I-1] + fibonacci[I-2]
   fimpara
   
   // Visualização da sequência completa na tela
   para I de 1 ate 20 faca
        se (I < 20) entao
           escreva(fibonacci[I],", ")
        senao
           escreva(fibonacci[I],".")
        fimse
   fimpara
Fimalgoritmo