
package agendapoo;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private final List<Contactos> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contactos contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado.");
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contactos contacto : contactos) {
                System.out.println("Nombre: " + contacto.getNombre() + ", Número de teléfono: " + contacto.getNum());
            }
        }
     }
     }