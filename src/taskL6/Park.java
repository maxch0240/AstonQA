package taskL6;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions = new ArrayList<>();

    public void createAttraction(String info, String workHours, int cost) {
        attractions.add(new Attraction(info, workHours, cost));
    }

    public void showAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println("Info: " + attraction.getInfo());
            System.out.println("Working hours: " + attraction.getWorkHours());
            System.out.println("Cost in dollars: " + attraction.getCost() + "\n");
        }
    }

    private class Attraction {
        private String info;
        private String workHours;
        private int Cost;

        public Attraction(String info, String workHours, int cost) {
            this.info = info;
            this.workHours = workHours;
            Cost = cost;
        }

        public String getInfo() {
            return info;
        }

        public String getWorkHours() {
            return workHours;
        }

        public int getCost() {
            return Cost;
        }
    }
}
