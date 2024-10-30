public class Spinner{
    public Spinner(){}
    public int spin(int min, int max) {
        int result;
        result = (int)(Math.random() * (max - min + 1) + min);
        return result;
    }
    public void playRound() {
        int spinner1 = spin(1, 10);
        int spinner2 = spin(2, 8);
        int score = 0;
        int p1 = 0;
        int p2 = 0;
        int secSpin1 = 0;
        int secSpin2 = 0;
        if(spinner1 > spinner2) {
            score = spinner1 - spinner2;
            System.out.println("win! " + score + " points");
        } else if(spinner2 > spinner1) {
            score = spinner2 - spinner1;
            System.out.println("lose! -" + score + " points");
        } else {
            secSpin1 = spin(1, 10);
            secSpin2 = spin(2, 8);
            p1 = spinner1 + secSpin1;
            p2 = spinner2 + secSpin2;
            if(p1 > p2) {
                score = 1;
                System.out.println("win! " + score + " points");
            } else if(p2 > p1) {
                score = 1;
                System.out.println("lose! -" + score + " points");
            } else {
                score = 0;
                System.out.println("Tie. " + score + " points");
            }
        }
    }
}