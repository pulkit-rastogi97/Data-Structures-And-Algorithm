
public class BrokenEconomy {
	public static void main(String[] args) {
		int[] denominationsAvailable = InputUtils.takeArrayInput();
		int denominationRequired = InputUtils.takeIntInput();
		
		callMoneyExchange(denominationsAvailable, denominationRequired);
	}

	private static void callMoneyExchange(int[] denominationsAvailable, int denominationRequired) {
		if(denominationsAvailable == null)
			return;
		
		int left = 0;
		int right = denominationsAvailable.length - 1;
		int mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(denominationsAvailable[mid] == denominationRequired) {
				System.out.println(denominationRequired);
				return;
			}else if(denominationsAvailable[mid] <= denominationRequired) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		
		if(denominationsAvailable[mid] < denominationRequired) {
			System.out.println(denominationsAvailable[mid] + ", " + denominationsAvailable[mid + 1]);
		}else {
			System.out.println(denominationsAvailable[mid - 1] + ", " + denominationsAvailable[mid]);
		}
		
	}
}
