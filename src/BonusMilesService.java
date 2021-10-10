public class BonusMilesService {
    public int calculate(int ticketPrice, int bonusMiles) {
        int totalMiles = ticketPrice / bonusMiles;
        return totalMiles;
    }
}