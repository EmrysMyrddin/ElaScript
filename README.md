# ElaScript 
ElaScript est un DSL pour faciliter la création de règles pour l'élasticité du cloud.

## Organisation :
Voir : [trello](https://trello.com/b/eXo56Ghg/elascript)

Rapports : [ShareLaTeX](https://www.sharelatex.com/project/557584a2102ebf4b1338c71e)

## Arborescence :
	- ./conception : Grammaire, rapport, demo ANTLR, ...
	- ./xtext-workspace : Workspace contenant le projet xText.
	- ./sirius-workspace : Workspace contenant le projet Sirius
		- Note : Doit être lancer via le runtime Eclipse du projet xText ou avec le plugin Elascript
	- ./formalisme-graph : Contient les images du formalismes graphiques de Elascript
	- ./eclipse-plugin : Contient le plugin Elascript pour Eclipse
	- ./eclipse-elascript : Eclipse pour Win32 avec xText, Sirius, PDE et Elascript pré-installé.

## Utilisation :
Pour tester xText :

	Démarer Eclipse-elascript, selectionner le Workspace "xtext-workspace".

Pour tester Sirius, il a 3 méthodes :

### Méthode 1, passer par xText :
Démarer Eclipse-elascript dans le workspace "xtext-workspace" et selectioner le projet emn.a1.elascript.
Lancer l'application via "launch runtime eclipse". Si nécessaire, changer le workspace du runtime eclipse 
vers "sirius-workspace".

### Méthode 2, exporter le plugin xText :
Démarer Eclipse-elascript dans le workspace "xtext-workspace" et selectioner le projet emn.a1.elascript.
Dans le menu fichier, selectioner "Export" puis "plugin and fragment". Cocher les 3 projet et exporter dans le dossier
"eclipse-plugin". Copier le contenu du dossier "eclipse-plugin/Plugins" dans le dossier "eclipse-elascript/Plugins".
Lancer Eclipse-elascript et selectioner le workspace "sirius-workspace".

### Méthode 3, avec un nouvel Eclipse :
Télécharger Eclipse. Installer les plugin xText, PDE et Sirius, puis utiliser la même méthodologie 
que la méthode 2.

