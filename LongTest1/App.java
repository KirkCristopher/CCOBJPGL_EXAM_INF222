public class App {
    public static void main(String[] args) {
        
        Location boracay = new Boracay();
        Location palawan = new Palawan();
        Location pangasinan = new Pangasinan();
        Location batangas = new Batangas();
        Location elnido = new ElNido();

        Tourist kirk = new Myself();

        elnido.accept(kirk);
        boracay.accept(kirk);
        batangas.accept(kirk);
        pangasinan.accept(kirk);
        palawan.accept(kirk);
        batangas.accept(kirk);
        pangasinan.accept(kirk);
        palawan.accept(kirk);

    }
}