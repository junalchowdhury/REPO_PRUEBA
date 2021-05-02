public class PruebaJava {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Auto auto1 = new Auto();
        auto1.setId("01");
        auto1.setDescripcion("Auto de nestor");
        auto1.setModelo("Compacto");
        System.out.println(auto1.getId());
        System.out.println(auto1.getDescripcion());
        System.out.println(auto1.getModelo());

        Auto auto2 = new Auto();
        auto2.setId("02");
        auto2.setDescripcion("auto deportivo");
        auto2.setModelo("Deportivo");
        System.out.println(auto2.getId()+" "+auto2.getDescripcion()+""+auto2.getModelo());

    }
}
