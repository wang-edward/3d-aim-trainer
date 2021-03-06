package mygame;
/*
Asad Jiwani & Edward Wang
April 5th, 2021
This class controls a stat entry for the player of the game. A stat entry has a dateInMilliseconds (in milliseconds), the number of targets hit, 
the number of shots fired and the player accuracy
 */
import java.util.Date;

public class StatEntry {
    private int targetsHit;
    private int shotsFired;
    private double accuracy;
    
    /**
     * Primary constructor - accept new values for the targetsHit and shotsFired attributes of stat entry
     * @param targetsHit - the number of targets the player hit
     * @param shotsFired - the number of total shots the player fired
     */
    public StatEntry(int targetsHit, int shotsFired){
        this.targetsHit = targetsHit;
        this.shotsFired = shotsFired;
        this.accuracy = (targetsHit/shotsFired) * 100; //calculate accuracy by dividing targets hit by shots fired and multiply by 100 to make it a percent
    }
    
    /**
     * Seoncdary constructor - accept new values for all attributes of stat entry
     * @param targetsHit - the number of targets the player hit
     * @param shotsFired - the number of total shots the player fired
     * @param accuracy - the player's accuracy in the game
     */
    public StatEntry(int targetsHit, int shotsFired, double accuracy){
        this.targetsHit = targetsHit;
        this.shotsFired = shotsFired;
        this.accuracy = accuracy; 
    }
    
    /**
     * Compare two stat entries based on their number of shots fired
     * @param other - the other stat entry to compare with
     * @return a positive num if the other entry is lower
     * a 0 if both entries are equal
     * a negative num if the other entryis higher
     */
    public int compareTo(StatEntry other) {
        if (shotsFired > other.getShotsFired()) {
            return 1;
        } else if (shotsFired == other.getShotsFired()) {
            return 0;
        } else {
            return -1;
        }
    }
    
    /**
     * Mutator method for the number of targets the player hit
     * @param targetsHit - the number of targets the player hit
     */
    public void setTargetsHit(int targetsHit){
        this.targetsHit = targetsHit;
    }
    
    /**
     * Accessor method for the number of targets the player hit
     * @return the number of targets the player hit
     */
    public int getTargetsHit(){
        return targetsHit;
    }
    
    /**
     * Mutator method for the number of shots fired by the player
     * @param shotsFired - the number of shots fired by the player
     */
    public void setShotsFired(int shotsFired){
        this.shotsFired = shotsFired;
    }
    
    /**
     * Accessor method for the number of shots fired by the player
     * @return the number of shots fired by the player
     */
    public int getShotsFired(){
        return shotsFired;
    }
    
    /**
     * Mutator method for the accuracy of the player
     * @param accuracy - the accuracy of the player
     */
    public void setAccuracy(double accuracy){
        this.accuracy = accuracy;
    }
    
    /**
     * Accessor method for the accuracy of the player
     * @return the accuracy of the player
     */
    public double getAccuracy(){
        return accuracy;
    }
    
    /**
     * Create a String representation of all stat entry attributes
     * @return a String representation of all stat entry attributes
     */
    public String toString(){
        return "Shots Fired: " + shotsFired + "\nTargets Hit: " + targetsHit + 
                "\nAccuracy: " + accuracy;
    }
    
    /**
     * Create a new StatEntry with same attribute values as this one
     * @return a new StatEntry with same attribute values as this one
     */
    public StatEntry clone(){
        StatEntry clone = new StatEntry(targetsHit, shotsFired, accuracy);
        return clone;
    }
    
    /**
     * Compare a StatEntry with the one in this class
     * @param other - the other stat entry to compare
     * @return true or false depending on if the stat entry is the same
     */
    public boolean equals(StatEntry other){
        return this.shotsFired == other.shotsFired &&
                this.targetsHit == other.targetsHit &&
                this.accuracy == other.accuracy;
    }
    
}
