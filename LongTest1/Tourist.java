public interface Tourist {
    
    int budget = 0;

    void visit(Boracay boracay);

    void visit(Batangas batangas);

    void visit(ElNido elnido);

    void visit(Palawan palawan);

    void visit(Pangasinan Pangasinan);

    default void visit(Location location) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}