/*
Q:- 6. To check given number is prime number or not ( range of input ).

 o/p:-
It is a Prime Number : 2
It is a Prime Number : 3
It is not a Prime Number : 4
It is a Prime Number : 5
It is not a Prime Number : 6
It is a Prime Number : 7
It is not a Prime Number : 8
It is not a Prime Number : 9
It is not a Prime Number : 10
It is a Prime Number : 11
It is not a Prime Number : 12
It is a Prime Number : 13
It is not a Prime Number : 14
It is not a Prime Number : 15
It is not a Prime Number : 16
It is a Prime Number : 17
It is not a Prime Number : 18
It is a Prime Number : 19
It is not a Prime Number : 20
It is not a Prime Number : 21
It is not a Prime Number : 22
It is a Prime Number : 23
It is not a Prime Number : 24
It is not a Prime Number : 25
It is not a Prime Number : 26
It is not a Prime Number : 27
It is not a Prime Number : 28
It is a Prime Number : 29
It is not a Prime Number : 30
It is a Prime Number : 31
It is not a Prime Number : 32
It is not a Prime Number : 33
It is not a Prime Number : 34
It is not a Prime Number : 35
It is not a Prime Number : 36
It is a Prime Number : 37
It is not a Prime Number : 38
It is not a Prime Number : 39
It is not a Prime Number : 40
It is a Prime Number : 41
It is not a Prime Number : 42
It is a Prime Number : 43
It is not a Prime Number : 44
It is not a Prime Number : 45
It is not a Prime Number : 46
It is a Prime Number : 47
It is not a Prime Number : 48
It is not a Prime Number : 49
It is not a Prime Number : 50
It is not a Prime Number : 51
It is not a Prime Number : 52
It is a Prime Number : 53
It is not a Prime Number : 54
It is not a Prime Number : 55
It is not a Prime Number : 56
It is not a Prime Number : 57
It is not a Prime Number : 58
It is a Prime Number : 59
It is not a Prime Number : 60
It is a Prime Number : 61
It is not a Prime Number : 62
It is not a Prime Number : 63
It is not a Prime Number : 64
It is not a Prime Number : 65
It is not a Prime Number : 66
It is a Prime Number : 67
It is not a Prime Number : 68
It is not a Prime Number : 69
It is not a Prime Number : 70
It is a Prime Number : 71
It is not a Prime Number : 72
It is a Prime Number : 73
It is not a Prime Number : 74
It is not a Prime Number : 75
It is not a Prime Number : 76
It is not a Prime Number : 77
It is not a Prime Number : 78
It is a Prime Number : 79
It is not a Prime Number : 80
It is not a Prime Number : 81
It is not a Prime Number : 82
It is a Prime Number : 83
It is not a Prime Number : 84
It is not a Prime Number : 85
It is not a Prime Number : 86
It is not a Prime Number : 87
It is not a Prime Number : 88
It is a Prime Number : 89
It is not a Prime Number : 90
It is not a Prime Number : 91
It is not a Prime Number : 92
It is not a Prime Number : 93
It is not a Prime Number : 94
It is not a Prime Number : 95
It is not a Prime Number : 96
It is a Prime Number : 97
It is not a Prime Number : 98
It is not a Prime Number : 99
It is not a Prime Number : 100


 */

package java_program_in_softcopy_Nots;
/**
 * 
 * @author ravik
 *
 */
public class PrimeNumber_or_not_in_a_Range1To100 {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			int n = i;
			boolean flag = true;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("It is a Prime Number : " + n);
			} else if (flag == false) {
				System.out.println("It is not a Prime Number : " + n);
			}
		}
	}
}
