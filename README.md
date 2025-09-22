# Spring Boot + MongoDB 🚀

Este projeto demonstra como conectar uma aplicação **Spring Boot** ao **MongoDB**, utilizando o **Spring Data MongoDB**.  
O objetivo é servir como exemplo prático para quem está aprendendo a integrar aplicações Java com bancos NoSQL.  

---

## 📚 Tecnologias utilizadas
- [Java 17+](https://www.oracle.com/java/)  
- [Spring Boot](https://spring.io/projects/spring-boot)  
- [Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb)  
- [MongoDB](https://www.mongodb.com/)  
- [Maven](https://maven.apache.org/)  

---

## ⚙️ Configuração do projeto

### Pré-requisitos
- **MongoDB** instalado e rodando localmente  
  ou via Docker:  
  ```bash
  docker run -d -p 27017:27017 mongo
  ```

- **Java 17+** instalado  
- **Maven** instalado  

---

### Clonar o repositório
```bash
git clone https://github.com/seu-usuario/seu-repo.git
cd seu-repo
```

---

### Configuração do `application.properties`
No arquivo `src/main/resources/application.properties`, configure a conexão com o MongoDB:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/meubanco
```

---

## 📝 Exemplo de entidade
```java
@Document(collection = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    private String id;
    private String nome;
    private String email;
}
```

---

## 📡 Endpoints disponíveis

### Criar usuário
```http
POST /usuarios
Content-Type: application/json
```
Body:
```json
{
  "nome": "João Silva",
  "email": "joao@email.com"
}
```

### Listar usuários
```http
GET /usuarios
```

---

## 🚀 Como rodar a aplicação
```bash
mvn spring-boot:run
```

---

## 📺 Tutorial em vídeo
Este repositório faz parte do vídeo publicado no canal **Eversingledev**:  
👉 [Assista aqui](https://www.youtube.com/watch?v=3pBDxUpXvAk) 

---

## 📄 Licença
Este projeto está sob a licença MIT. Sinta-se livre para usar e modificar.  
