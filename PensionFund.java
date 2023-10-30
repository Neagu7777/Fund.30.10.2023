package ConstructorFund;

import ConstructorFund.Person;
import java.util.List;

public class PensionFund {
    public static PensionFund findFundWithMostMembers(List<PensionFund> funds, List<Worker> workers) {
        return funds.stream()
                .max((fund1, fund2) -> countFundMembers(fund1, workers) - countFundMembers(fund2, workers))
                .orElse(null);
    }

    private static int countFundMembers(PensionFund fund, List<Worker> workers) {
        return (int) workers.stream()
                .filter(worker -> worker.isContributingTo(fund))
                .count();
    }

    public static String findWorkerWithHighestPension(List<Worker> workers, List<PensionFund> funds) {
        return workers.stream()
                .max((worker1, worker2) -> calculatePension(worker1, funds) - calculatePension(worker2, funds))
                .map(Worker::getName)
                .orElse(null);
    }

    private static int calculatePension(Worker worker, List<PensionFund> funds) {
        return funds.stream()
                .filter(fund -> worker.isContributingTo(fund))
                .mapToInt(fund -> calculatePensionContribution(worker, fund))
                .sum();
    }

    private static int calculatePensionContribution(Worker worker, PensionFund fund) {
        return 0;
    }

}