Compléments de programmation - TD 1
Nom, Prénom, No Etudiant, Nc > BENSEGHIR Nadjib Eddine Adib 22301396 20 https://github.com/BENSEGHIRnadjib/Fraction

Remarques préliminaires
Pour l'ensemble des TDs, vous créerez un compte individuel sur github si vous n'en possédez pas déjà un. Vous nommerez ce compte de la façon suivante: uvsq<MonNuméroÉtudiant>. Par exemple, pour un étudiant de numéro 21601234, le compte sera uvsq21601234.
Les commandes git sont à taper en ligne de commande dans un shell.
Vous pouvez utiliser l'IDE de votre choix. Sur le cartable numérique, Eclipse, IntelliJ IDEA et Visual Studio Code sont installés.
Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants. Ajoutez ensuite ce fichier au dépôt git.
Partie I (à faire durant le TD) : découverte de git
Dans cet exercice, vous créerez une classe Fraction représentant un nombre rationnel et une classe Main qui testera les méthodes de la classe Fraction avec des assertions (cf. Utilisation d'assertions). À chaque étape, consultez le statut des fichiers du projet (git status) ainsi que l'historique (git log).

Sur la forge, créez le dépôt (repository) SimpleFraction; En terme de commits, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases Initialize this repository with et n'en cocher aucune ?
La différence essentielle réside dans le contenu initial du dépôt :

Si vous cochez des cases lors de la création du dépôt, cela ajoute automatiquement certains fichiers et répertoires (comme README, .gitignore, et License) au dépôt initial, ce qui peut vous faire gagner du temps.

Si vous ne cochez aucune case, le dépôt est créé complètement vide, et vous devrez ajouter manuellement tous les fichiers et dossiers que vous souhaitez inclure dans le dépôt. Cela vous donne un contrôle total, mais cela nécessite également un travail supplémentaire pour démarrer votre projet. Le choix dépend des besoins specifique de chaque personnes.

*Pour la suite, ne cochez aucune de ces cases*.
Localement, configurez git avec votre nom (user.name) et votre email (user.email) (cf. Personnalisation de Git);
#  $ git config --global user.name "BENSEGHIRNadjib"
$ git config --global user.email "nadjib-eddine-adib.benseghir@ens.uvsq.fr"
Initialisez le dépôt git local pour le projet (cf. Démarrer un dépôt Git);
#  git init
Dans votre IDE, créez la classe Fraction (vide pour le moment) et la classe Main (avec un simple affichage) dans le projet (cf. Méthode main); Vérifiez que le projet compile et s'exécute dans l'IDE; Validez les changements (cf. Enregistrer des modifications dans le dépôt);
# git add
  git comit m-
Ajoutez la méthode toString à la classe Fraction (cf. Object.toString) qui retournera la chaîne "Je suis une fraction." et modifiez la classe Main en conséquence; Validez les changements;
public String toString() {
    return "Je suis une fraction.";
}
Publiez vos modifications sur le dépôt distant (cf. Travailler avec des dépôts distants); Vous utiliserez le protocole https pour cela; Vérifiez avec le navigateur;
#  git push remote https://github.com/BENSEGHIRnadjib/Fraction
Sur la forge, ajoutez un fichier de documentation README.md. Quelle syntaxe est utilisée pour ce fichier ?
echo "# Fraction" >> README.md git init git add README.md git commit -m "first commit" git branch -M main git remote add origin https://github.com/BENSEGHIRnadjib/Fraction.git git push -u origin main

Récupérez localement les modifications effectuées sur la forge.
# git pull origin main
Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par git (cf. .gitignore pour Java);
# # add .gitignore    
git commit -m "Add .gitignore to ignore build artifacts and logs
 git push origin main 
Retirez les fichiers de configuration de l'IDE du projet;
# cd /Desktop/Fraction
 git rm -r --cached .idea
Ajoutez-les aux fichiers ignorés par git.
 # git add .gitignore
   git commit -m "Ajoute des regles d'ignorancess pour les fichiers générés par IntelliJIDEA"
   git push origin <nom_de_votre_branche>
Configurez l'accès par clé publique/clé privée à la forge (cf. Connecting to GitHub with SSH).
Pour configurer l'accès par clé publique/clé privée à une forge comme GitHub, commencez par vérifier si vous avez déjà des clés SSH. Si non, générez une paire de clés. Ajoutez ensuite votre clé publique à votre compte GitHub dans les paramètres de clés SSH. Enfin, testez la connexion SSH pour confirmer que tout fonctionne correctement. Une fois configuré, vous pourrez utiliser SSH pour interagir avec la forge de manière sécurisée et sans nécessité de connexion constante.

Partie II (à faire durant le TD) : compléter la classe Fraction
Dans cet partie, vous compléterez les classes Fraction et Main. Un exemple d'interface pour une telle classe est donné par la classe Fraction de la bibliothèque Apache Commons Math.

Vous respecterez les consignes ci-dessous :

chaque méthode de Fraction sera testée dans Main avec des assertions (cf. Utilisation d'assertions);
à la fin de chaque question, consultez le statut des fichiers du projet (git status) ainsi que l'historique (git log) puis validez les changements.
Ajoutez les attributs représentants le numérateur et le dénominateur (nombres entiers).
// private int numerateurQ;
private int denominateurU;
Ajoutez les constructeurs (cf. Constructor Declarations) suivants :
initialisation avec un numérateur et un dénominateur,
initialisation avec juste le numérateur (dénominateur égal à 1),
initialisation sans argument (numérateur égal 0 et dénominateur égal à 1),
// // public Fraction(int numerateurQ) {
    this.numerateurQ=numerateurQ;
    denominateurU=1;
}
public Fraction (){
     numerateurQ=0;
     denominateurU=1;
}
Ajoutez les fractions constantes ZERO (0, 1) et UN (1, 1) (cf. Constants in Java),
// public static final Fraction Zero = new Fraction();
     public static final Fraction UN = new Fraction(1);
Ajoutez une méthode de consultation du numérateur et du dénominateur (par convention, en Java, une méthode retournant la valeur de l'attribut anAttribute est nommée getAnAttribute),
//  public int getNumerateur() { return numerateur; }
  public int getDenominateur() { return denominateur;
}
Ajoutez une méthode de consultation de la valeur sous la forme d'un nombre en virgule flottante (méthode doubleValue()) (cf. java.lang.Number),
 //  // public double doubleValue() {
     assert denominator != 0 : "Le dénominateur ne peut pas être zéro.";
     return (double) numerator / denominator;
 }
Ajoutez une méthode permettant l'addition de deux fractions (la méthode add prend en paramètre une fraction et retourne la somme de la fraction courante et du paramètre),
 //  public Fraction add(Fraction other) {
     int commonDenominator = this.denominator * other.denominator;
     int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
     return new Fraction(newNumerator, commonDenominator);
 }
 
Ajoutez le test d'égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) (cf. java.lang.Object.equals),
 // public boolean equals(Object obj) {
     if (this == obj) {
         return true;
     }
     if (obj == null || getClass() != obj.getClass()) {
         return false;
     }
     Fraction other = (Fraction) obj;
     assert this.denominateur != 0 && other.denominateur != 0 : "Le dénominateur ne peut pas être zéro.";
     return this.numerateur == other.numerateur && this.denominateur == other.denominateur;
 }
 
Ajoutez la comparaison de fractions selon l'ordre naturel (cf. java.lang.Comparable).
 // Number aNumber = java.math.BigDecimal.ONE;
 Number anotherNumber = new Fraction(1, 2);
 assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
Faites hériter votre classe Fraction de la classe java.lang.Number et complétez les méthodes
 // Vérifiez avec le code ci-dessous
 Number aNumber = java.math.BigDecimal.ONE;
 Number anotherNumber = new Fraction(1, 2);
 assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
Partie III (à faire à la maison) : révisions et perfectionnement shell et IDE
Maîtriser le shell de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du shell de votre machine. Vous pouvez répondre en utilisant le shell de votre choix (bash, Powershell, …). Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

Quel OS et quel shell de commande utilisez-vous ?
Windows bash

Quelle commande permet d'obtenir de l'aide ? Donnez un exemple.
# Get-help Get-Process
Donnez la ou les commandes shell permettant de
afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
#  dir "chemin de rep " /s /o:s /h
compter le nombre de ligne d'un fichier
# find /c /v "" "chemoin de rep"
afficher les lignes du fichier Main.java contenant la chaîne uneVariable
#  findstr /i "uneVariable" "\Main.java"
afficher récursivement les fichiers .java contenant la chaîne uneVariable
# findstr /s /i "uneVariable" "\chemin\*.java"
trouver les fichiers (pas les répertoires) nommés README.md dans une arborescence de répertoires
# dir /s /b README.md
afficher les différences entre deux fichiers textes
# 
# diff file1.txt file2.txt
Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
ssh
est un protocole de réseau securise et une commande utilisee par les developpeurs pour établir des connexions distantes securises vers des serveur

screen/tmux
multiplexeurs de terminal qui permettent aux développeurs de créer et de gérer plusieurs sessions de terminal à l'intérieur d'une seule fenêtre, exécuter des tâches en arrière-plan, détacher et réattacher des sessions

curl/HTTPie
sont des outils de ligne de commande pour effectuer des requêtes HTTP vers des serveurs web. Les developpeurs les utilisent pour tester des API, récupérer des données depuis le web, automatiser des taches liees au réseau et inspecter les réponse HTTP

jq
c'est un outil de ligne de commande pour le traitement de JSON. Les développeurs l'utilise pour extraire, transformer et manipuler des données JSON, ce qui est courant lorsqu'ils travaillent avec des API et des données structurées.

Découverte de votre IDE
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE. Vous pouvez choisir l'IDE/éditeur de texte de votre choix. Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE (IntelliJ IDEA, Visual Studio Code, Eclipse, …).

Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?

inteliji IDEA

Pour la suite, ne considérez que l'un de vos choix.

Comment vérifier/définir que l'encodage utilisé est UTF-8 ?

Pour vérifier l'encodage de votre projet ou d'un fichier spécifique :

Accédez au menu Sélectionnez Paramètres. Sous Éditeur et sélectionnez Encodages de fichiers. Vous verrez une option pour ncodage par défaut où vous pouvez vérifier l'encodage global du projet. Vous pouvez également vérifier l'encodage pour un fichier spécifique en utilisant le menu Fichier et en sélectionnant Encodage de fichier.

Comment choisir le JDK à utiliser dans un projet ?

pour choisir le Java Development Kit (JDK) dans IntelliJ IDEA : Ouvrez ou créez votre projet. Accédez aux paramètres du projet via "File" > "Project Structure." Sous "Project," choisissez le JDK dans la liste déroulante ou ajoutez-en un nouveau en spécifiant son emplacement. Configurez le niveau de compatibilité Java si nécessaire. Appliquez les modifications en cliquant sur ok.

Comment préciser la version Java des sources dans un projet ?

Répondre ici

Comment ajouter une bibliothèque externe dans un projet ?

Ouvrez le projet. Accédez à "File" > "Project Structure." Sous "Libraries," cliquez sur plus pour ajouter une bibliothèque Java. Configurez la bibliothèque en ajoutant les fichiers JAR ou en recherchant la bibliothèque Maven. Appliquez les modifications en cliquant sur ok La bibliothèque est prête à être utilisée dans votre projet.

Comment reformater un fichier source Java ?

Ouvrez le fichier Java. Utilisez la commande "Reformat Code" (Reformater le code) avec un raccourci clavier ou le menu contextuel. Personnalisez les règles de reformatage si nécessaire dans les paramètres "Code Style." Appliquez le reformatage en utilisant la commande. Enregistrez le fichier reformatté.

Comment trouver la déclaration d'une variable ou méthode ?

Placez le curseur sur le nom de la variable ou de la méthode. Cliquez avec le bouton droit de la souris et choisissez "Go to" (Aller à) dans le menu contextuel. Sélectionnez l'option appropriée, telle que "Declaration" (Déclaration) pour trouver la déclaration, ou d'autres options en fonction de ce que vous recherchez. IntelliJ IDEA vous conduit directement à la déclaration ou à l'emplacement où la variable ou la méthode est définie. Vous pouvez naviguer entre les déclarations en utilisant les raccourcis clavier Ctrl + B pour avancer et Ctrl + Alt + B pour revenir en arrière.

Comment insérer un bloc de code prédéfini (snippet) ?

Accédez aux paramètres de l'éditeur via "File" > "Settings" (ou "Preferences" sur macOS). Sélectionnez "Editor" > "Live Templates." Choisissez le langage de programmation pertinent (par exemple, Java). Ajoutz un nouveau Live Template en spécifiant un nom et le code à insérer. Utilisez des variables (
) pour définir les parties modifiables du code. Configurez les variables pour préciser leur contenu. Pour insérer le snippet, tapez le raccourci que vous avez défini, puis utilisez la touche "Tab" pour naviguer entre les parties modifiables du code. Cela facilite l'insertion rapide de blocs de code prédéfinis dans votre code source IntelliJ IDEA en utilisant des Live Templates personnalisés.

Comment renommer une classe dans l'ensemble du projet ?

Cliquez avec le bouton droit sur le nom de la classe que vous souhaitez renommer. Sélectionnez "Refactor" (Refactoriser) dans le menu contextuel, puis choisissez "Rename" (Renommer) ou utilisez le raccourci clavier "Shift + F6". Modifiez le nom de la classe dans la boîte de dialogue qui apparaît. Appuyez sur "Enter" pour valider le nouveau nom. IntelliJ IDEA renommera automatiquement la classe dans tout le projet, mettant à jour toutes les références. Vérifiez les avertissements ou erreurs qui peuvent apparaître temporairement et résolvez-les si nécessaire. Une fois terminé, le renommage sera appliqué à l'ensemble du projet.

Comment exécuter le programme en lui passant un paramètre en ligne de commande ?

Ouvrez votre projet Java. Configurez une nouvelle configuration d'exécution via "Run" > "Edit Configurations..." Créez une configuration "Application" en spécifiant la classe principale et les paramètres du programme. Enregistrez la configuration. Exécutez le programme à l'aide de la configuration créée. Visualisez les résultats dans la console.

Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?

Placez des points d'arrêt dans le code. Lancez le débogage avec "Run" > "Debug" ou le raccourci clavier. Examinez les variables en cours d'exécution dans la fenêtre "Variables" du débogueur. Ajoutez des variables à surveiller en les ajoutant aux "Watches." Utilisez les commandes de débogage pour naviguer et inspecter les variables. Arrêtez le débogage lorsque vous avez terminé.

Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?

Pour le développement Java avec IntelliJ IDEA, voici les fonctionnalités clés : Complétion automatique : Aide à l'écriture du code. Débogage puissant : Pour détecter et corriger les erreurs. Refactoring automatisé : Facilite la réorganisation du code. Intégration Git : Pour gérer les versions du code.