algoritmo "GravarNomes"

var
   arq : arquivo
   nome : caractere

inicio
   // Associando o arquivo físico
   atribuir(arq, "c:\nomes.txt")

   // Abrindo o arquivo para escrita
   abrir(arq, "escrita")

   escreva("Digite um nome (ou FIM para encerrar): ")
   leia(nome)

   enquanto nome <> "FIM" faca
      escrever(arq, nome)
      escreva("Digite um nome (ou FIM para encerrar): ")
      leia(nome)
   fimenquanto

   fechar(arq)

   escreval("Dados gravados com sucesso!")
fimalgoritmo
