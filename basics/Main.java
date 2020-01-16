import java.time.LocalDateTime;

public class Main {


public static void main(String[] args){
int dogCount = 1;
int catCount = 2;
int turtleCount = 0;


System.out.println("I own " + dogCount + " " + pluralize(dogCount, "dog") + ".");

System.out.println("I own " + catCount + " " + pluralize(catCount,"cat") + ".");


System.out.println("I own " + turtleCount + " " + pluralize(turtleCount, "turtle" ) + ".");


flipNHeads(1);

Main object = new Main();
object.clock();

}

public static String pluralize(int number, String word) {
    
if (number==1) {
return word;
} else {
return word + "s";
}
}


public static void flipNHeads(int n) {
    
int counter=0;
int headCounter = 0;

while (headCounter<n) {
    counter ++;
    double rand = Math.random();
    if (rand<0.5) {
        System.out.println("tails");
    } else {
        System.out.println("Heads");
        headCounter ++;
    }

}

System.out.println("It took " + counter+ " flips to flip " + n + " head in a row.");
}


private synchronized void clock(){


while(true){
LocalDateTime now = LocalDateTime.now();
int hour = now.getHour();
int minute = now.getMinute();
int second = now.getSecond();
System.out.println(String.format("%d:%d:%d", hour, minute, second));
    try{
    this.wait(1000);
} catch (InterruptedException e){
    e.printStackTrace();
}
}
}
}


 



 
