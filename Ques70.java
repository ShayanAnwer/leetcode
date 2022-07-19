
public class Ques70 {

	public int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		int totalSteps = 0;
		int stepsTo2StepsBack = 1;
		int stepsTo1StepsBack = 2;

		for (int i = 3; i <= n; i++) {
			totalSteps = stepsTo2StepsBack + stepsTo1StepsBack;
			stepsTo2StepsBack = stepsTo1StepsBack;
			stepsTo1StepsBack = totalSteps;
		}

		return totalSteps;
	}

}
