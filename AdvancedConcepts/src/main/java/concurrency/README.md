# Threads et concurrence

## @Async
Permet de gérer l'execution asynchrone des tâches. Lance les méthodesdans des threads séparés, ce qui évite de bloquer le thread principal.

## ThreadPoolTaskExecutor
Spring fournit cette classe pour les pools de threads. Efficace pour un ensemble de threads.

## @Lock et @Transactional
@Transactional gère la cohérence des données lors de la parallélisation des opérations

## Executor 
Le ExecutorService peut-être utile quand on veut gérer finement et explicitement un pool de threads.

## Future & CompletableFuture
On peut utiliser ces classes pour récupérer le résultat de tâches asynchrones.

## Gestion des Deadlocks et des Conditions de course
Deadlock: deux threads se bloquent mutuellement
`synchronized`permet d'éviter les problèmes de concurrence.

## Producer/consumer
C'est un modèle utilisé dans les systèmes multithreadés pour gérer les les accès multiples à une ressource.

## ThreadLocal
Stocker des données spécifiques à un thread sans qu'elles soient partagées à un autre thread.

# Bonus

[Du multi threading décompilé](../concurrency/example/MyThreadAppDecompiled.txt)