import java.util.*;
class BookTheatreSeat{
    int total_seat=10;
     synchronized void bookSeat(int seat){
        if(total_seat >= seat){
            System.out.println("Ticket Book Successful");
            total_seat = total_seat-seat;
            System.out.println("Available Seat = "+total_seat);
            } 
            else{
            System.out.println("Oops Seat is not Available ");
            System.out.println("Left seat is = "+total_seat);
        }
    }
}
public class MovieBookApp extends Thread {
   static BookTheatreSeat b;
   int seat;
   public void run(){
   b.bookSeat(seat);
   }
   public static void main(String[] args) {
    b = new BookTheatreSeat();
    MovieBookApp asif = new MovieBookApp();
    asif.seat=5;
    asif.start();

    MovieBookApp salim = new MovieBookApp();
    salim.seat=3;
    salim.start();
  }
}
