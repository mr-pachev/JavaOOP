
package Demo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safeData = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long gold = 0;
        long gem = 0;
        long cash = 0;

        for (int i = 0; i < safeData.length; i += 2) {

            String nameItem = safeData[i];
            long currentSumItem = Long.parseLong(safeData[i + 1]);

            String currentItem = "";

            if (nameItem.length() == 3) {
                currentItem = "Cash";
            } else if (nameItem.toLowerCase().endsWith("gem")) {
                currentItem = "Gem";
            } else if (nameItem.toLowerCase().equals("gold")) {
                currentItem = "Gold";
            }

            if (currentItem.equals("")) {
                continue;
            } else if (bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + currentSumItem) {
                continue;
            }

            switch (currentItem) {
                case "Gem":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gold")) {
                            if (currentSumItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values().stream().mapToLong(e -> e).sum() + currentSumItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gem")) {
                            if (currentSumItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values().stream().mapToLong(e -> e).sum() + currentSumItem > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(currentItem)) {
                bag.put((currentItem), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(currentItem).containsKey(nameItem)) {
                bag.get(currentItem).put(nameItem, 0L);
            }


            bag.get(currentItem).put(nameItem, bag.get(currentItem).get(nameItem) + currentSumItem);
            if (currentItem.equals("Gold")) {
                gold += currentSumItem;
            } else if (currentItem.equals("Gem")) {
                gem += currentSumItem;
            } else if (currentItem.equals("Cash")) {
                cash += currentSumItem;
            }
        }

        for (var currentBag : bag.entrySet()) {
            Long sumValues = currentBag.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", currentBag.getKey(), sumValues));

            currentBag.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }
}