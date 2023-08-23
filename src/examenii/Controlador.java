/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii;

/**
 *
 * @author Student
 */
public class Controlador {
    private int P;
    private int C;
    private int A;

    public Controlador() {
        this.P = 0;
        this.C = 0;
        this.A = 0;
    }
    
    
    
    public void GenerarTicket(String tipo){
        if (null == tipo) {
            Ticket ticket = new Ticket(A,"A");
            A++;
        }else switch (tipo) {
            case "P":
                {
                    Ticket ticket = new Ticket(P,"P");
                    P++;
                    break;
                }
            case "C":
                {
                    Ticket ticket = new Ticket(C,"C");
                    C++;
                    break;
                }
            default:
                {
                        Ticket ticket = new Ticket(A,"A");
                        A++;
                    break;
                }
        }
    }
        
    public void Atender(String tipo){
        
    }
        
}
