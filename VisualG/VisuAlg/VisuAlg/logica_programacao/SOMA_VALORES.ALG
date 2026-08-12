Algoritmo "soma_valores"
// Disciplina  : Lógica de Programação
// Professor   : André Olímpio 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : André Olímpio
// Data atual  : 16/08/2025
Var
// Seção de Declarações das variáveis 
n1,n2,soma,subtracao,multiplicacao: inteiro
divisao: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

//ENTRADA DE DADOS
escreva("Digite o primeiro numero: ")
leia(n1)
escreva("Digite o segundo numero: ")
leia(n2)

//PROCESSAMENTO DE DADOS
soma <- n1 + n2
subtracao <- n1 - n2
multiplicacao <- n1 * n2
divisao <- n1 / n2

//SAÍDA DE DADOS
escreval
escreval(n1," + ",n2," = ",soma)
escreval(n1," - ",n2," = ",subtracao)
escreval(n1," * ",n2," = ",multiplicacao)
escreval(n1," / ",n2," = ",divisao)
Fimalgoritmo