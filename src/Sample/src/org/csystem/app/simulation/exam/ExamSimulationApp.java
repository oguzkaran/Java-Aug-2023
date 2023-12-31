package org.csystem.app.simulation.exam;

public class ExamSimulationApp {
    public static void run()
    {
        ExamSimulation examSimulation = new ExamSimulation("Fizik");

        examSimulation.run();
        examSimulation.printReport();
    }

    public static void main(String[] args)
    {
        run();
    }
}
