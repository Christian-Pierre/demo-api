#Para utilizar Mysql com Docker
    Commandos no bash:
        $ docker pull mysql:5.7
    Caso utilize windows terminal:
        $ docker run -e MYSQL_ROOT_PASSWORD=root --name mysql mysql:5.7
    Caso queira rodar em background e utilizar o mesmo terminal:
        $ docker run -e MYSQL_ROOT_PASSWORD=root --name -d mysql mysql:5.7
    Pegar as informações do container:
        $ docker inspect mysql | grep IPAddress
        A saída irá conter as informações de IP para utilizar o servidor Mysql
            Output Example: 172.17.0.2
    Utilizar Essas informações no src/main/resources/application.properties
        informações que podem ser variáveis:
            spring.datasource.url = jdbc:mysql://172.17.0.2:3306/demodb
            spring.datasource.password = root 
#Alternativa
    Utilizar o docker-compose.yml já configurado 
        On wsl2 bash:
            $ docker-compose up
#Mysql
    CREATE DATABASE demodb;
    USE demodb;
    Utilizar Essas informações no src/main/resources/application.properties
        informações que podem ser variáveis:
            spring.datasource.url = jdbc:mysql://172.17.0.2:3306/demodb
