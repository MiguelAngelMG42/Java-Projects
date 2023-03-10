package poo.exercise.one;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the begginig");

        Posnet posnet = new Posnet();
        Persona p = new Persona("4813598321", "Pepe", "Gomez", "587138984", "pepe@fakemail.com");
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank", "9893238946", 15000, EntidadFinanciera.BIRZA, p);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t.toString());

        System.out.println("Ticket tras pagar ...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(t.toString());

    }
}