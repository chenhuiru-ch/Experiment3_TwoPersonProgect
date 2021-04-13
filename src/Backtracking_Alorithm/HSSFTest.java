package Backtracking_Alorithm;

public class HSSFTest {
public static void main(String[] args) {
	long timeStart = System.currentTimeMillis();
    Knapsack[] bags = new Knapsack[] { //背包的具体价值及重量
    		new Knapsack(408, 508),new Knapsack(921, 1021),new Knapsack(1329,1321),
            new Knapsack(11,111), new Knapsack(998,1098), new Knapsack(1009,1196),
            new Knapsack(104,204), new Knapsack(839,939), new Knapsack(943,1107),
            new Knapsack(299, 399),new Knapsack(374, 474),new Knapsack(673,719),
            new Knapsack(703, 803),new Knapsack(954, 1054),new Knapsack(1657,1781),
            new Knapsack(425,525),new Knapsack(950,1050),new Knapsack(1375,1362),
            new Knapsack(430,530),new Knapsack(541,641),new Knapsack(971,903),
            new Knapsack(332,432),new Knapsack(483,583),new Knapsack(815,894),
            new Knapsack(654,754),new Knapsack(706,806),new Knapsack(1360,1241),
            new Knapsack(956,1056),new Knapsack(992,1092),new Knapsack(1948,1545),
            };
    int totalWeight = 10149;
    HSSFProblem problem = new HSSFProblem(bags, totalWeight);
    
    System.out.print("最优解为：");
    System.out.println(problem.solve(0));
    
    long timeEnd = System.currentTimeMillis();
	System.out.println( "总共花费：" + (timeEnd - timeStart)+ "ms" );
}
}