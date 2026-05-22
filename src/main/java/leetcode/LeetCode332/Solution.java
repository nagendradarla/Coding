package leetcode.LeetCode332;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        //Build the graph, adjacency matrix
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        for (List<String> ticket : tickets) {
            String source = ticket.get(0);
            String dest = ticket.get(1);
            graph.computeIfAbsent(source, s -> new ArrayList<String>()).add(dest);
        }
        //Sort the neighbours to get LexicoGraphical order
        for (Map.Entry entry : graph.entrySet()) {
            List<String> list = (ArrayList<String>) entry.getValue();
            Collections.sort(list);
        }
        List<String> itinerary = new ArrayList<String>();
        dfs("JFK", graph, itinerary);
        return itinerary;
    }

    private void dfs(String source, HashMap<String, ArrayList<String>> graph, List<String> itinerary) {
        ArrayList<String> neighbours = graph.get(source);
        while (neighbours != null && !neighbours.isEmpty()) {
            String neighbour = neighbours.get(0);
            neighbours.remove(0); // remove to avoid going to same place agin
            dfs(neighbour, graph, itinerary);
        }
        itinerary.add(0, source);
    }

    public static void main(String[] args) {
        String input = "[[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]";
        List<List<String>> tickets = parseTickets(input);
        Solution solution = new Solution();
        System.out.println(solution.findItinerary(tickets));
    }

    private static List<List<String>> parseTickets(String input) {
        List<List<String>> tickets = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\\"([^\\\"]+)\\\"");
        Matcher matcher = pattern.matcher(input);

        List<String> values = new ArrayList<>();
        while (matcher.find()) {
            values.add(matcher.group(1));
        }
        if (values.size() % 2 != 0) {
            throw new IllegalArgumentException("Invalid ticket input: expected source/destination pairs");
        }
        for (int i = 0; i < values.size(); i += 2) {
            tickets.add(Arrays.asList(values.get(i), values.get(i + 1)));
        }
        return tickets;
    }
}
