package expressionsInfixes;

import PileGenerique.Stack;

public class EvaluateurSuffixe {
    public EvaluateurSuffixe(){
    }

    public static int evaluerSuffixe(String expressionSuffixe){
        int valeurExpressionSuffixe = 0, operande1, operande2;
        Stack<Integer> pileEntier = new Stack<>();
        for(int i = 0; i<expressionSuffixe.length(); i++){
            char caractereCourant = expressionSuffixe.charAt(i);
            if(Character.isDigit(caractereCourant)){
                pileEntier.empiler(Character.getNumericValue(caractereCourant));
            }else if(ConvertisseurInfixeEnSuffixe.estUnOperateur(caractereCourant)){
                operande2 = pileEntier.depiler();
                operande1 = pileEntier.depiler();
                pileEntier.empiler(resultat(operande1, operande2, caractereCourant));
            }
        }
        valeurExpressionSuffixe = pileEntier.depiler();
        return valeurExpressionSuffixe;
    }

    public static int resultat(int operande1, int operande2, char operateur){
        int resultat = 0;
        switch (operateur) {
			case '+': resultat = operande1 + operande2; break;
			case '-': resultat = operande1 - operande2; break;
			case '/': resultat = operande1 / operande2; break;
			case '*': resultat = operande1 * operande2; break;
		
			default:
				break;
		}
        return resultat;
    }
}
