🏢 Processo Seletivo - Simulação de Contato com Candidatos

📌 Descrição do Projeto

Este projeto em Java simula um processo seletivo em que candidatos são contatados para uma entrevista de emprego. Ele inclui funcionalidades para:

📞 Simular tentativas de contato com candidatos.

✅ Selecionar candidatos com base em suas expectativas salariais.

💰 Analisar a compatibilidade salarial entre candidato e empresa.

📋 Imprimir a lista de candidatos.

🛠️ Tecnologias Utilizadas

Java SE 8+

ThreadLocalRandom para geração de valores aleatórios

📂 Estrutura do Projeto

O projeto contém os seguintes métodos:

1. 🏁 main(String[] args)

Inicializa a lista de candidatos e simula o contato com cada um.

2. 📞 entrandoEmContato(String candidato)

Realiza até 3 tentativas para contatar um candidato.

Utiliza o método atender() para simular se o candidato atendeu ou não.

3. 📲 atender()

Retorna true ou false de forma aleatória para simular se o candidato atendeu o telefone.

4. 📋 imprimirCandidatos()

Exibe a lista de candidatos com seus respectivos índices.

5. 🎯 selecaoCandidato()

Simula a seleção de candidatos com base em suas expectativas salariais.

Usa o método valorPretendido() para gerar um valor aleatório entre R$ 1.500,00 e R$ 2.500,00.

6. 💰 valorPretendido()

Retorna um valor aleatório para representar o salário pretendido pelo candidato.

7. 📊 analisarCandidato(double salarioPretendido)

Avalia se o salário pretendido é aceitável e decide se o candidato será contatado.

🚀 Como Executar o Projeto

Clone este repositório:

git clone https://github.com/seu-repositorio.git

Compile o código Java:

javac candidatura/ProcessoSeletivo.java

Execute o programa:

java candidatura.ProcessoSeletivo

🔧 Possíveis Melhorias

🎨 Implementar interface gráfica para tornar a interação mais intuitiva.

🗄️ Armazenar os candidatos em um banco de dados.

🧪 Adicionar testes unitários para garantir a qualidade do código.