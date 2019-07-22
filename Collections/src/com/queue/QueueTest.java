package com.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author ashwini.kamath
 * Use Queue to give the order in which the lectures will be given for the day.
 * The person entering first to the auditorium will be the first to give the lecture.
 * Order : Chris -> Robert -> Scarlet -> Robin
 * O/P : Chris, Robert, Scarlet, Robin
 *
 */
public class QueueTest {
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		queue.add("Chris");
		queue.add("Robert");
		queue.add("Scarlet");
		queue.add("Robin");

		System.out.println("The order of Lecutres for the day is : ");
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
	}
}
