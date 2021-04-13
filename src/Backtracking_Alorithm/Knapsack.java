package Backtracking_Alorithm;

//创建一个物品对象，分别存在价值、重量以及单位重量价值三种属性。
public class Knapsack implements Comparable<Knapsack> {
    /** 物品重量 */
    private int weight;
    /** 物品价值 */
    private int value;
    /** 单位重量价值 */
    private int unitValue;

    public Knapsack(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.unitValue = (weight == 0) ? 0 : value / weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getUnitValue() {
        return unitValue;
    }

    @Override
    public int compareTo(Knapsack snapsack) {
        int value = snapsack.unitValue;
        if (unitValue > value)
            return 1;
        if (unitValue < value)
            return -1;
        return 0;
    }

}
