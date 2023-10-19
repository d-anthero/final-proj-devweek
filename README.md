# Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week

```mermaid
classDiagram
  class Jogador {
    - nome: string
    - ficha: Ficha
    - features: Feature[]
    - news: News[]
  }

  class Ficha {
    - id: int
    - classe: string
    - guilda: string
  }

  class Feature {
    - icon: string
    - description: string
  }

  class News {
    - icon: string
    - description: string
  }

  Jogador *--> Ficha
  Jogador *--> Feature
  Jogador *--> News
```
