Algoritmo "Menor número do Rafael Reis RA02610314"
// Lê 5 valores e mostra qual é o menor deles
Var

v : vetor[1..5] de inteiro
c : inteiro
i : inteiro
max : inteiro

Inicio

c <- 1

enquanto c <= 5 faca
   escreva ("Informe um valor: ")
   leia (v[c])
   c <- c + 1
fimenquanto

max <- v[1]
para i de 1 ate 5 faca
   se v[i] < max entao
   max <- v[i]
   fimse
fimpara

escreval ("O menor número dessa lista é: " , max)

Fimalgoritmo