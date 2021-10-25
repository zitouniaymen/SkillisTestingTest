<<<<<<< HEAD
Solution

Pour intégrer la solution, il suffit d'ajouter la class Partition.java comme class utilitaire dans les futures libs, 

Classe Ã  intégrer

La class principale Partition fournit les methodes suivantes:
public static <T> Partition<T> ofSize(List<T> list, int size)

ofSize : methode de classe qui prend en paramÃ©tre la liste Ã  partitionner et la taille de la sous liste, elle retourne la liste des sous-listes.

Comment créer les sous listes?

ofSize est une mé©thode static de la classe partition, donc pour l'utiliser il suffit de l'appeler directement sans avoir besoin d'instantier la classe Partition.
// Partition.listSize(listOfElements, partitionSize
Partition<Integer> result = Partition.ofSize(Arrays.asList({1, 2, 3, 4, 5}),2);

Donc result va contenir la resultat suivante : 
 [ [1,2], [3,4], [5] ]


Comment utiliser la rÃ©sultat?

La classe Partition hÃ©rite de la classe AbstractList<List> donc la resultat retourner est tout simplement une liste de liste donc les mÃ©thodes .get(), .size() sont implementÃ©s et prÃ¨s Ã  utiliser



"# SkillTestingpartitions" 
=======
# partition
SUJET MAISON TEST JAVA
>>>>>>> parent of b64221d (Update README.md)
"# SkillisTestingTest" 
