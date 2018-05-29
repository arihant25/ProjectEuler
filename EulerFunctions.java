/**
 *ProjectEulerFunctions
 *
 *@author Arihant Jain
 */


private static boolean isPrime(long check) {
	for (long i=2; i<check; i++)
		if (check%i == 0) return false;
	return true;
}


private static boolean isPerfectSquare(int number) {
	double test = Math.sqrt(number);
	if (test - Math.floor(test) == 0)
		return true;
	return false;
}


private static int factorialSum(int[] check) {
	int sum = 0;
	for (int i = 0; i < check.length; i++) {
		int product = 1;
		for (int j = 1; j <= check[i]; j++)
			product *= j;
		sum += product;
	}
	return sum;
}


private static int[] toArray(BigInteger num) {
	String[] temp = num.toString().split("");
	int[] answer = new int[temp.length];
	for (int i = 0; i< temp.length; i++){
		answer[i] = Integer.parseInt(temp[i]);
	}
	return answer;
}


private static int[] toArray(double num) {
	String[] temp = Long.toString((int) num).split("");
	int[] answer = new int[temp.length];
	for (int i = 0; i < temp.length; i++) {
		answer[i] = Integer.parseInt(temp[i]);
	}
	return answer;
}


private static void rotateByOne(int[] array) {
	int temp = array[0];
	for (int i = 0; i < array.length - 1; i++)
		array[i] = array[i + 1];
	array[array.length - 1] = temp;
}


private static boolean isPandigital (int check) {
	String number = Integer.toString(check);
	if (number.length() != 9)
		return false;
	char [] arr = number.toCharArray();
	Arrays.sort(arr);
	String temp = String.valueOf(arr);
	if (temp.equals("123456789"))
		return true;
	return false;
}


private static int totalTriangles(int number) {
	int count = 0;
	for (int i = 1; i < 1000; i++){ 
		for (int j = 1; j < 1000; j++){ 
			if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(number - i - j, 2)){
				if (j < number){ 
					count++;
				}
			}
		}
	}
	return count / 2;
}


private static BigInteger reverse(BigInteger number) {
	String temp = number.toString();
	StringBuilder rev = new StringBuilder();
	rev.append(temp);
	rev = rev.reverse();
	temp = rev.toString();
	return new BigInteger(temp);
}


private static int reverse(int number) {
	String temp = Integer.toString(number);
	StringBuilder rev = new StringBuilder();
	rev.append(temp);
	rev = rev.reverse();
	temp = rev.toString();
	return Integer.parseInt(temp);
}


private static boolean isPalindrome(BigInteger number) {
	String temp = number.toString();
	StringBuilder rev = new StringBuilder();
	rev.append(temp);
	rev = rev.reverse();
	String compare = rev.toString();
	if (compare.equals(temp))
		return true;
	return false;
}


private static boolean isPalindrome(String string) {
	return string.equals(new StringBuilder(string).reverse().toString());
}


private static HashSet<String> allPerm(int array[]) {
	HashSet<String> hs = new HashSet<>();
	int[] temp = new int[array.length];
	for (int i = 0; i < array.length; i++)
		temp[i] = 0;
	hs.add(Arrays.toString(array).replaceAll("[\\[\\]]|\\s|,", ""));
	int count = 0;
	while (count < array.length){
		if (temp[count] < count) {
			if (count % 2 == 0)
				swap(array, 0, count);
			else
				swap(array, temp[count], count);
			hs.add(Arrays.toString(array).replaceAll("[\\[\\]]|\\s|,", ""));
			temp[count] += 1;
			count = 0;
		} else {
			temp[count] = 0;
			count += 1;
		}
	}
	return hs;
}


private static void swap(int[] array, int i, int j) {
	int c = array[i];
	array[i] = array[j];
	array[j] = c;
}


//sieve of eratosthenes
private static boolean[] sieve(int n) {
	boolean[] primeArr = new boolean[n + 1];
	for (int i = 2; i < n; i++)
		primeArr[i] = true;

	for (int i = 2; i < Math.sqrt(n); i++) {
		if (primeArr[i])
			for (int j = i; j * i <= n; j++)
				primeArr[i * j] = false;
		}
	return primeArr;
}