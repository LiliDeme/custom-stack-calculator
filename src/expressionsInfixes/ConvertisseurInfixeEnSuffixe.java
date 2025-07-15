package expressionsInfixes;

import PileGenerique.Stack;

public class ConvertisseurInfixeEnSuffixe {

    //Pile<Character> pile = new Pile<>();
    public ConvertisseurInfixeEnSuffixe(){        
    }

    public static String convertirEnSuffixe(String expressionInfixe){
        String expressionSuffixe = "";
        char parentheseGaucheSupprime;
        Stack<Character> pileOperateur = new Stack<>();
        pileOperateur.empiler('(');//a)
        expressionInfixe += ')';//b)
        while(!pileOperateur.estVide()){
            for(int i = 0; i<expressionInfixe.length(); i++){
                char caractereCourant = expressionInfixe.charAt(i);
                switch (caractereCourant) {
                    case '(': pileOperateur.empiler(caractereCourant); break;                    
                    case ')': 
                        while(pileOperateur.voir() != '('){
                            expressionSuffixe += pileOperateur.depiler();
                        }
                        parentheseGaucheSupprime = pileOperateur.depiler();
                        break;
                    default:
                    if(Character.isDigit(caractereCourant)){
                        expressionSuffixe += caractereCourant;
                    }else if(estUnOperateur(caractereCourant)){//si c'est un opérateur au sommet
                        while(estUnOperateur(pileOperateur.voir()) && prioriteEgaleOuGrande(pileOperateur.voir(), caractereCourant)){// tant que les opérateur du sommet de la pile ont une priorité égale ou plus grande
                            expressionSuffixe += pileOperateur.depiler(); // ajout à l'expression suffixée le caractère au sommet
                        }
                        pileOperateur.empiler(caractereCourant);
                    }
                        break;
                }//fin switch                
            }//fin for
        }//fin while
        return expressionSuffixe;        
    }

    public static boolean estUnOperateur(char character){ //static pour pouvoir appeler la méthode de manière static sans avoir à creer d'instance de la classe
        boolean estOperateur = false;
        if(character == '+' || character == '-' || character == '*' || character == '/'){
            estOperateur = true;
        }
        return estOperateur;
    }

    public static boolean prioriteEgaleOuGrande(char op1, char op2){
        boolean prioriteOp1 = false;// initialisation à false donc pas besoin de traiter les cas où la priorité est moins grande.
        if(op1 == '*' || op1 == '/'){
            prioriteOp1 = true;
        }else if(op2 == '+' || op2 == '-'){//cas où op1 est soit + ou -
            prioriteOp1 = true;
        }
        return prioriteOp1;
    }
}
