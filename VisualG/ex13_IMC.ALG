Algoritmo "IMC do Rafael Reis RA 02610314"
// Lê altura e peso, mostra o imc e a faixa
Var

altura : real
peso : real
imc : real

Inicio

escreva ("Informe sua altura em metros: ")
leia (altura)
escreva ("informe seu peso em quilos: ")
leia (peso)

imc <- peso / (altura * altura)

se imc <= 18.5 entao
escreval ("Com IMC de ", imc , " você está abaixo do peso!")
senao

     se (imc > 18.5) e (imc < 24.9) entao
     escreval ("Com IMC de " , imc , " seu peso é normal")
     senao

          se (imc > 25) e (imc < 29.9) entao
          escreval ("Com IMC de " , imc , " você está com sobrepeso")
          senao
               se imc >= 30 entao
               escreval ("com IMC de " , imc , " você está obeso!")

               fimse
          fimse
     fimse
fimse

Fimalgoritmo