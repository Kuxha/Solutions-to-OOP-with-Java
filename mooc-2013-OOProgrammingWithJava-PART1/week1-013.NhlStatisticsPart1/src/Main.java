
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        int i;
        
         NHLStatistics.sortByGoals();
         NHLStatistics.top(10);
        
        
        
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        NHLStatistics.searchByPlayer("Sidney Crosby");
        NHLStatistics.teamStatistics("PHI");
       // NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
