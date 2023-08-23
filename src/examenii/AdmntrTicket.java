/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii;

import java.util.Stack;


/**
 *
 * @author Student
 */
public class AdmntrTicket {
    
    private Stack<Ticket> tickets;

    public Stack<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Stack<Ticket> tickets) {
        this.tickets = tickets;
    }

    public AdmntrTicket(Stack<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    public void agegar(Ticket ticket){
        this.tickets.addElement(ticket);
    }
    
    public void eliminarPosicion(int target){
        this.tickets.removeElementAt(target);
    }
    
    public void buscar(String tipo){
        this.tickets.get(0);
    }
}
