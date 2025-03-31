# Repositori de GitHub

## Descripció
Aquest repositori conté diversos exercicis de Java sobre Anotacions.

---

## Nivell 1
### Exercici 1
Crea una jerarquia de classes amb tres classes: `Treballador`, `TreballadorOnline` i `TreballadorPresencial`.

- La classe `Treballador` inclou atributs com `nom`, `cognom` i `preuHora`. També té un mètode `calcularSou()` que rep com a paràmetre el nombre d'hores treballades i el multiplica per `preuHora`.
- Les classes filles han de sobreescriure aquest mètode utilitzant l'anotació `@Override`.
- Des del mètode `main()` de la classe `Principal`, fes les invocacions necessàries per demostrar l'ús de `@Override`.
- Per als treballadors presencials, el mètode per calcular el sou rebrà per paràmetre el nombre d’hores treballades al mes. El sou es calcularà multiplicant les hores treballades pel `preuHora`, més un atribut estàtic anomenat `benzina`.
- Per als treballadors online, el mètode per calcular el sou rebrà per paràmetre el nombre d’hores treballades al mes. El sou es calcularà multiplicant les hores treballades pel `preuHora`, més un valor constant que representa la tarifa plana d'Internet.

### Exercici 2
- Afegeix alguns mètodes obsolets a les classes filles i utilitza l’anotació corresponent.
- Invoquen aquests mètodes obsolets des d'una classe externa i suprimeix els avisos de "deprecated" amb l'anotació adequada.

---

## Nivell 2
### Exercici 1
Crea una anotació personalitzada que permeti serialitzar un objecte Java en un fitxer JSON. L’anotació ha de rebre el directori on es desarà el fitxer resultant.

---

## Nivell 3
### Exercici 1
Amplia la funcionalitat de l’anotació creada en el nivell anterior perquè sigui registrada per la Màquina Virtual en temps d’execució. Demostra la lectura de l’anotació fent servir Java Reflection.

---

## Com executar el projecte
1. Clona el repositori:
   ```sh
   git clone https://github.com/Unrotopo/Sprint1_Tasca7.git
   ```
2. Obre el projecte a Eclipse o IntelliJ.
3. Compila i executa la classe `Principal` per veure els resultats.
4. Si utilitzes Maven o Gradle, assegura’t d’importar les dependències abans d’executar el projecte.

---

## Contribució
- Segueix les bones pràctiques de l'Sprint 0.
- Mantingues l'estructura del projecte clara i ben documentada.
- Envia "pull requests" amb descripcions clares dels canvis.

## Autoría
Aquest projecte ha sigut desenvolupat per Luis Portas Montero.

Bona programació! 🚀

