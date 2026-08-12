Algoritmo "Fibonacci_Vetor"
// Disciplina  : Lógica de Programação
// Professor   : André Olímpio 
// Descrição   : 20 primeiros números de Fibonacci, utilizando vetores
// Autor(a)    : André Olímpio
// Data atual  : 06/09/2025
Var
   // Declarações das variáveis
   fibonacci: vetor[1..2,1..10] de inteiro
   I,J: inteiro

Inicio
   // Inicializando a sequência
   fibonacci[1,1] <- 1
   fibonacci[1,2] <- 1
   
   //
   para J de 3 ate 10 faca
        fibonacci[1,J] <- fibonacci[1,J-1] + fibonacci[1,J-2]
   fimpara
   
   fibonacci[2,1] <- fibonacci[1,9] + fibonacci[1,10]
   fibonacci[2,2] <- fibonacci[2,1] + fibonacci[1,10]
   
   para J de 3 ate 10 faca
        fibonacci[2,J] <- fibonacci[2,J-1] + fibonacci[2,J-2]
   fimpara
   
   // Visualização da sequência completa na tela
   para I de 1 ate 2 faca
      para J de 1 ate 10 faca
           se (J < 10) entao
              escreva(fibonacci[I,J],", ")
           senao
              escreval(fibonacci[I,J])
           fimse
      fimpara
   fimpara
Fimalgoritmo