# Lista Avaliativa II (Padrões de Projeto)
## Questão 2 – Controle Universal (Padrão Command)

### Enunciado resumido
Simular um controle remoto universal que envia comandos para diferentes dispositivos:

- TV  
- Luz  
- Som  

O controle deve permitir executar comandos, armazená-los em arquivo e restaurá-los, como um backup.

Aplicar o padrão **Command** para representar cada ação como um objeto independente.

### Objetivo
Demonstrar o padrão **Command**, permitindo que cada operação seja tratada como um comando independente, registrável e recuperável.

### Como executar
1. Coloque todos os arquivos Java e o arquivo `comandos.txt` (gerado automaticamente) dentro de `src/`
2. Compile:
   ```bash
   javac *.java
   ```
3. Execute:
   ```bash
   java Main
   ```
