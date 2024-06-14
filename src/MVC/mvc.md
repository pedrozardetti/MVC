# MVC: Padrão de Projeto de Software

----

O MVC é um padrão de projeto de software no qual as classes são organizadas delegando responsabilidades específicas para cada uma.

## Benefícios do MVC:
- **Separação de Responsabilidades**: Cada camada tem uma responsabilidade clara, facilitando a organização e manutenção do código.
- **Escalabilidade e Reutilização**: Facilita a escalabilidade e reutilização de código, pois as diferentes partes da aplicação estão bem separadas.
- **Organização do Código**: Ajuda na organização do código-fonte, tornando-o mais modular e fácil de entender e manter.

## Fluxo de Dados:
- A primeira requisição HTTP chega ao Controller. Ele verifica que está chegando a requisição e comunica o Model. O Model conecta ao banco de dados e o BD retorna ao Model. O Model retorna ao Controller. O Controller renderiza as informações na View e a Controller vai devolver a View.
