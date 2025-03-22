# Spring Boot: Filters e Interceptors

## 🔍 Visão Geral
Este projeto explora as **diferenças entre Filters e Interceptors** no Spring Boot. Ele apresenta exemplos práticos de como cada mecanismo funciona, seus principais cenários de uso e as melhores práticas para tarefas como **registro de requisições, autenticação, controle de taxa de chamadas e modificação de requisições**.

## 🌟 Funcionalidades
- **Exemplo de Filter**: Demonstra como interceptar requisições HTTP
- **Exemplo de Interceptor**: Apresenta como manipular requisições antes e depois da execução dos controllers.
- **Guia Comparativo**: Explica quando escolher Filters ou Interceptors para diferentes cenários.
- **Monitoramento de Desempenho**: Implementa medição de tempo de requisição para fins de log e análise.

## 🛠️ Tecnologias Utilizadas
- **Java 17 ou superior**
- **Spring Boot**
- **MySQL**
- **Spring MVC**
- **Maven**


## 📁 Estrutura do Projeto
```
filtersInterceptors/
├── src/main/java/com/filterinterceptors
│   ├── config/                 # Spring configuration for interceptors
│   ├── controller/             # Rest Controllers to showcase behavior
│   ├── dto/             		# Records that work as DTO's
│   ├── filter/                 # Servlet Filters implementation
│   ├── interceptor/            # Spring Interceptor examples
│   ├── model/            		# Entities mapped to MySQL tables
│   ├── repository/            	# Hibernate classes to access database
│   ├── services/            	# Business logics
│   └── FiltersInterceptorsApplication.java    # Main Spring Boot application
```

## 🚀 Como Iniciar
### **Clonando o Repositório**
```sh
git clone https://github.com/paulomauricio10/filtersInterceptors.git
