Instruções de uso do H2 Database

Este projeto utiliza o banco de dados H2 como base para desenvolvimento.
Acessando o painel do H2

Para acessar o painel do H2, você precisará iniciar a aplicação e acessar a seguinte URL:

http://localhost:8080/h2-console

Configurando o Datasource

Quando você acessar o painel do H2, você será solicitado a configurar o datasource. Utilize as seguintes informações:

    JDBC URL: jdbc:h2:file:~/spring-boot-h2-ulsis-db
    User Name: dev
    Password: dev

Observação

É importante lembrar que, como o H2 é um banco de dados básico, por isso, é recomendável utilizar outro banco de dados para produção como o Postgres ou Mariadb.

Instruções de uso do Swagger

Este projeto utiliza o Swagger para documentar a API. Isso significa que todas as informações sobre as rotas disponíveis e os parâmetros de entrada e saída são facilmente acessíveis através de uma interface amigável.
Acessando a documentação

Para acessar a documentação do Swagger, você precisará iniciar a aplicação e acessar a seguinte URL:

http://localhost:8080/swagger-ui/index.html

Essa URL só estará disponível quando o projeto estiver em modo de desenvolvimento.
Navegando na documentação

Ao acessar a URL acima, você será direcionado para a página inicial do Swagger, onde poderá visualizar todas as rotas disponíveis para acesso. Cada rota inclui informações sobre os parâmetros de entrada e saída, bem como exemplos de requisições e respostas.

Você também pode testar as rotas diretamente na interface do Swagger, clicando no botão "Try it out" e preenchendo os parâmetros de entrada.