/*
1184. Distance Between Bus Stops
Easy

A bus has n stops numbered from 0 to n - 1 that form a circle. 

We know the distance between all pairs of neighboring stops where distance[i] is the distance between the stops number i and (i + 1) % n.

The bus goes along both directions i.e. clockwise and counterclockwise.

Return the shortest distance between the given start and destination stops.
*/
package leetcode;

public class _1184_DistanceBetweenBusStops{
  public static void main(String args[]){
    int distance = {1,2,3,4};
    int start = 0, ;
    int destination = 1;
    int dis = distanceBetweenBusStops(distance,start,destination);
    System.out.print(dis);
}
 public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total=0, travel=0;
        for(int i:distance){
            total+=i;
        }    
        if(start>destination){
            int tmp=start;
            start=destination;
            destination=tmp;
        }
        
        for(int j=start;j<destination;j++){
            travel+=distance[j];
        }
        return Math.min(travel, total-travel);
    }
}
}
