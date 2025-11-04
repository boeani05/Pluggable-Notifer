Problem: 

Ich musste ein System/Programm erstellen, dass Nachrichten via Email/SMS/Push verschicken kann. Herausforderung dabei: Alles so schreiben, dass es Dependency Injection konform ist.

Lösung:

Mittels Interface NotificationService konnte das Design Pattern ohne Probleme umgesetzt werden. Ein Injector Interface half ebenfalls die jeweiligen Nachrichten zum jeweiligen Typ zuzuordnen.
