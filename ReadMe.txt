Shane Gleeson
G00311793
Object Oriented Programming Project


- When starting, run the runner class which gives the user an option to enter text to be decrypted.

- The runner class reads what the user has entered and encrypts it with a key of 4 using RailFence.

- Using a CSV format the program shows the encrypted text along with the matrix of the text.

- Next it parses quadgrams.txt file into a hashmap <string, double> and is then used to create the TextScorer Object.

- init method creates a New Thread (Decryptor) for each key

- The result is put onto the queue and on CypherBreaker classwhere the queue checks if the present result been read off the queue has a higher score than the local result variable in cypherbreaker 

