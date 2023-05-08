public class Myself implements Tourist {
    
    private int budget = 1000;

    @Override
    public void visit(Boracay boracay) {
        if (this.budget - boracay.getAirFare() < 0) {
            System.out.println("Not enough money to travel Boracay.");
        } else {
            System.out.println("Enjoying Boracay.");
            budget -= boracay.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Batangas batangas) {
        if (this.budget - batangas.getAirFare() < 0) {
            System.out.println("Not enough money to travel Batangas.");
        } else {
            System.out.println("Enjoying Batangas.");
            budget -= batangas.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(ElNido elnido) {
        if (this.budget - elnido.getAirFare() < 0) {
            System.out.println("Not enough money to travel El Nido.");
        } else {
            System.out.println("Enjoying El Nido.");
            budget -= elnido.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Pangasinan pangasinan) {
        if (this.budget - pangasinan.getAirFare() < 0) {
            System.out.println("Not enough money to travel Pangasinan.");
        } else {
            System.out.println("Enjoying Pangasinan.");
            budget -= pangasinan.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Palawan palawan) {
        if (this.budget - palawan.getAirFare() < 0) {
            System.out.println("Not enough money to travel Palawan.");
        } else {
            System.out.println("Enjoying Palawan.");
            budget -= palawan.getAirFare();
        }
        checkBudget();
    }
    
    
    public void checkBudget() {
        System.out.println("My budget is " + this.budget);
        System.out.println();
    }

}