package main

func isPalindrome(x int) bool {

	if x < 0 || x%10 == 0 && x != 0 {
		return false
	}

	revertido := 0
	for x > revertido {
		revertido = revertido*10 + x%10
		x /= 10
	}
	return x == revertido || x == revertido/10

}
