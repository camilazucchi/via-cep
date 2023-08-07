# Java Project: ViaCEP
<p align="center">
<img src="https://raw.githubusercontent.com/camilazucchi/ViaCEP/main/src/assets/find-zipcode.png" alt="Girl with a magnifying glass" width="400">
</p>
Don't speak Portuguese? Click <a href="https://github.com/camilazucchi/ViaCEP/blob/main/README-en.md">here</a> to view this page in English.

O Projeto ViaCEP é uma aplicação Java que interage com a API pública do ViaCEP para obter informações detalhadas de endereços com base no CEP fornecido pelo usuário. O objetivo do projeto é aprender sobre o consumo de API com Java.

## Funcionalidades
- Informar um CEP e obter detalhes do endereço, incluindo rua, bairro, cidade e estado.
- Tratar casos em que o CEP fornecido não é encontrado no banco de dados e exibir mensagens de erro adequadas.
- Utilizar a biblioteca Gson para fazer o parsing das respostas JSON da API ViaCEP em objetos Java.
- Implementar exceções personalizadas para tratar erros específicos e fornecer mensagens de erro informativas.

## Como Iniciar
Para executar o aplicativo ViaCEP, siga estes passos:
1. Clone o repositório em sua máquina local usando o comando:
```bash
git clone https://github.com/camilazucchi/ViaCEP
```
2. Abra o projeto em seu ambiente de desenvolvimento Java preferido (por exemplo, IntelliJ IDEA, Eclipse ou Visual Studio Code).
3. Certifique-se de que a biblioteca Gson (<a href="https://mvnrepository.com/artifact/com.google.code.gson/gson">com.google.code.gson</a>) esteja adicionada ao classpath do projeto. Caso contrário, faça o download do arquivo JARD do Gson e inclua-o no projeto.
4. Compile e execute a classe Main para iniciar o aplicativo.

## Utilização
1. Inicie o aplicativo ViaCEP.
2. Digite um CEP válido do Brasil quando solicitado.
3. O aplicativo se conectará à API ViaCEP, obterá os detalhes do endereço e os exibirá em formato estruturado.
4. Se o CEP não for encontrato no banco de dados, uma mensagem de erro apropriada será exibida.
5. O aplicativo também gerará um arquivo JSON chamado "address.json" contendo os detalhes do endereço para o CEP fornecido.

## Dependências
O Projeto ViaCEP requer a seguinte biblioteca:
- Gson (<a href="https://mvnrepository.com/artifact/com.google.code.gson/gson">com.google.code.gson</a>): Uma biblioteca para fazer o parsing de dados JSON em objetos Java e vice-versa.

## Contribuições
Contribuições para o Projeto ViaCEP são bem-vindas. Se encontrar algum bug, tiver sugestões de melhorias ou quiser adicionar novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob a Licença MIT — consulte o arquivo <a href="https://github.com/camilazucchi/ViaCEP/blob/main/LICENSE">LICENSE</a> para obter detalhes.

## Autores
- [@camilazucchi](https://github.com/camilazucchi)
