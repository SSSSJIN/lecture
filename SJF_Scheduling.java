import java.util.Scanner;

public class SJF_Scheduling {
    public static void sortByBurstTime(Process[] processes) {
        for (int i = 0; i < processes.length - 1; i++) {
            for (int j = 0; j < processes.length - i - 1; j++) {
                if (processes[j].burstTime > processes[j + 1].burstTime) {
                    Process temp = processes[j];
                    processes[j] = processes[j + 1];
                    processes[j + 1] = temp;
                }
            }
        }
    }
    
public static void calculateWaitingAndTurnaroundTime(Process[] processes) {
    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;

    processes[0].waitingTime = 0;
    processes[0].turnaroundTime = processes[0].burstTime;

    for (int i = 1; i < processes.length; i++) {
        processes[i].waitingTime = processes[i - 1].waitingTime + processes[i - 1].burstTime;
        processes[i].turnaroundTime = processes[i].waitingTime + processes[i].burstTime;
    }

    System.out.println("\nPID\tBurst\tWaiting\tTurnaround");
    for (Process p : processes) {
        System.out.println(p.pid + "\t" + p.burstTime + "\t" + p.waitingTime + "\t" + p.turnaroundTime);
        totalWaitingTime += p.waitingTime;
        totalTurnaroundTime += p.turnaroundTime;
    }

    System.out.printf("\nAverage Waiting Time: %.2f\n", (double) totalWaitingTime / processes.length);
    System.out.printf("Average Turnaround Time: %.2f\n", (double) totalTurnaroundTime / processes.length);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of processes: ");
    int n = scanner.nextInt();
    Process[] processes = new Process[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Enter burst time for process " + (i + 1) + ": ");
        int bt = scanner.nextInt();
        processes[i] = new Process(i + 1, bt);
    }

    sortByBurstTime(processes);
    calculateWaitingAndTurnaroundTime(processes);

    scanner.close();
}
}
