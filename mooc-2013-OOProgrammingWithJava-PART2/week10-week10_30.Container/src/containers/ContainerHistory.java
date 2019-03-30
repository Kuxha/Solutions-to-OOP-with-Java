package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private List<Double> containerHistory;

    public ContainerHistory() {
        this.containerHistory = new ArrayList<Double>();

    }

    public void add(double situation) {
        containerHistory.add(situation);
    }

    public void reset() {

        containerHistory.clear();
    }

    public String toString() {
        return containerHistory.toString();

    }

    public double maxValue() {

        if (containerHistory.isEmpty()) {

            return 0;

        } else {
            double max = this.containerHistory.get(0);
            for (Double vol : containerHistory) {

                if (vol > max) {

                    max = vol;
                }

            }
            return max;
        }

    }

    public double minValue() {

        if (containerHistory.isEmpty()) {

            return 0;

        } else {
            double min = containerHistory.get(0);
            for (Double vol : containerHistory) {

                if (vol < min) {

                    min = vol;
                }

            }
            return min;
        }

    }

    public double average() {

        if (containerHistory.isEmpty()) {

            return 0;

        } else {
            double avg;
            double sum = 0;
            for (Double vol : containerHistory) {

                sum += vol;

            }

            avg = sum / containerHistory.size();
            return avg;
        }

    }

    public double greatestFluctuation() {

        if (containerHistory.isEmpty() || containerHistory.size() == 1) {

            return 0;

        } else {

            double fluc = Math.abs(containerHistory.get(0) - containerHistory.get(1));
            for (int i = 0; i < this.containerHistory.size() - 1; i++) {

                double currentfluc = Math.abs(containerHistory.get(i) - containerHistory.get(i + 1));
                if (currentfluc > fluc) {
                    fluc = currentfluc;
                }
            }
            return fluc;
        }

    }

    public double variance() {

        if (containerHistory.isEmpty() || containerHistory.size() == 1) {

            return 0;

        } else {
            double n = containerHistory.size();
            double sqsum = 0;
            for (Double vol : containerHistory) {

                sqsum += Math.pow(vol - this.average(), 2);

            }

            return sqsum / (n - 1);
        }

    }
}
