# imDay

## Os endpoints existentes na aplicação são:

| Verbo HTTP | Resource path                          | Description                                  |
| ---------- | -------------------------------------- | -------------------------------------------- |
|  GET       |	http://localhost:8080/im-day  				|	Retorna os resolvedores referente a cada dia | 
|  GET	     |	http://localhost:8080/docs        		|	Link para a documentação da API              |

## /im-day
Como ja pré definido retorna uma lista com 11 dias, (Ontem, Hoje, e os próximos 9 dias). Ao ser executada a aplicação faz um seeding de 9 usuários no banco.

## Retorno
  O retorno é uma lista com a data e o nome do resolvedor:
  ```
    {
      "date": "String",
      "name": "string"
    } 
  ```
  
# Como executar a aplicação

## Backend
Java Versão 17

```bash
# clonar repositório
git clone https://github.com/JonathanComarella/imDay.git

# entrar na pasta do projeto backend
cd imDay/backend

# executar o projeto
./mvnw spring-boot:run
```
