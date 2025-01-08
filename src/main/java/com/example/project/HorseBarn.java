package com.example.project;

public class HorseBarn {
    /** The stalls in the barn. Each array element holds a reference to the Horse
     *  that is currently occupying the stall. A null value indicates an empty stall.
     */
    private Horse[] stalls;

    /** Initializes stalls to an array with a length equal to numStalls
     *  (all elements remain null initially)
     *
     *  @param numStalls  the number of stalls in the barn
     */
    public HorseBarn(int numStalls) {
        /* to be implemented in part (a) */
        stalls = new Horse[numStalls];
    }

    /** Assigns stalls to reference sampleHorses
     */
    public HorseBarn(Horse[] sampleStalls) {
        /* to be implemented in part (a) */
        stalls = sampleStalls;
    }
    public Horse[] getStalls() {
        return stalls;
    }
    /** Getter/accessor method for stalls
     *
     *  @return  a references to the stalls array
     */
    // to be added in part (a)

    /** Returns a string that shows which horses are in which stalls
     */
    public String horseBarnInfo() {
        /* to be implemented in part (b) */
        StringBuilder info = new StringBuilder();
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] == null) {
                info.append("Stall ").append(i).append(": empty\n");
            } else {
                info.append("Stall ").append(i).append(": ").append(stalls[i].horseInfo()).append("\n");
            }
        }
        return info.toString();
    }

    /** Places a Horse into stalls at the index indicated by stall
     *
     *  PRECONDITION: stall is a valid index of stalls
     *
     *  @param horse  the Horse object to place into stalls
     *  @param stall  the index of stalls to place the Horse
     */
    public void placeHorse(Horse horse, int stall) {
        /* to be implemented in part (c) */
        stalls[stall] = horse;
    }

    /** Returns the index of the stall that contains the horse with the specified name.
     *
     * Precondition: No two horses in the barn have the same name.
     *
     * @param  name the name of the horse to find
     * @return  the index of the stall containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseStall(String name) {
        /* to be implemented in part (d) */
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null && stalls[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  stalls, starting at index 0, with no empty stall between any two horses.
     *
     *  POSTCONDITION: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        /* to be implemented in part (e) */
        Horse[] newStalls = new Horse[stalls.length];
        int newIndex = 0;
        for (Horse horse : stalls) {
            if (horse != null) {
                newStalls[newIndex] = horse;
                newIndex++;
            }
        }
        stalls = newStalls;
    }
}
