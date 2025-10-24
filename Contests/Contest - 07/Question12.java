/*
    There are N processes to be completed. All the processes have a unique number assigned to them from 1 to N.

    Now, we are given two things -
        1) The calling order in which all the processes are called.
        2) The ideal order in which all the processes should have been executed.

    Executing a process takes 1 unit of time. Changing the position takes 1 unit of time.

    We have to find out the unit of time required to complete all the process such that a process is executed from the ideal order only when it exists at the same index in the calling order. We can push the first term from the calling order to the last thus rotating the order.


    Input Format -
        First line contains a single integer N.
        Next line contains N space separated integers denoting the calling order.
        Last line contains N space separated integers denoting the ideal order.

    Constraints - 1 <= N <= 10^6
    Output Format - The total time required
    Sample Input - 
        5
        5 4 2 3 1
        5 2 1 4 3
    Sample Output - 7
    Explanation - 
        Iteration #1 - Since the ideal order and calling order both has process #5 to be executed first. Process #5 is executed taking 1 unit of time. The new calling order is: 4 - 2 - 3 - 1. Time taken in step #1 - 1.

        Iteration #2 - Since the ideal order has process #2 to be executed firstly, the calling ordered has to be changed again, i.e., the first element has to be pushed to the last place. The new calling order is: 2 - 3 - 1 - 4 and process #2 is executed. Time taken in step #2 - 2.

        Iteration #3 - Since the ideal order has process #1 to be executed firstly, the calling ordered has to be changed again, i.e., the first element has to be pushed to the last place. The new calling order is: 1 - 4 - 3 and process #1 is executed. Time taken in step #2 - 2.

        Iteration #4 - Since the new first element of the calling order is same as the ideal order, that process will be executed. Time taken in step #4 - 1.

        Iteration #5 - Since the last element of the calling order is same as the ideal order, that process will be executed. Time taken in step #5 - 1.

        Total time taken = 7
*/

import java.util.Scanner;

public class Question12 {
    protected int size;

	protected int front;
	protected int[] data;

	public Question12() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Question12(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enQueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("Main is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int deQueue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static int ImpofTime(Question12 q,int[] orig_order) throws Exception{ 
        // Write the code here
        int time = 0;
        int n = orig_order.length;
        for(int i = 0; i < n; i++){
            int ideal = orig_order[i];
            while(true){
                int curr = q.getFront();
                if(curr == ideal){
                    q.deQueue();
                    time += 1;
                    break;
                }else{
                    q.deQueue();
                    q.enQueue(curr);
                    time += 1;
                }
            }
        }
        return time;	
    } 


	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		Question12 q = new Question12();

		int n = scn.nextInt();
		int[] process = new int[n];
		for (int i = 0; i < n; i++) {
			q.enQueue(scn.nextInt());
		}
		
		for(int i = 0;i < n;i++){
		
		    process[i] = scn.nextInt();
		}
		System.out.print(ImpofTime(q,process));
	}
}